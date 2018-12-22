package org.bootpbx.bootpbx.freeswitch;

import com.google.common.base.Throwables;
import org.freeswitch.esl.client.inbound.Client;
import org.freeswitch.esl.client.internal.IModEslApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
@EnableScheduling
@Order(1)
public class FreeSwitchFactory implements ApplicationRunner {

    private final static Logger logger = LoggerFactory.getLogger(FreeSwitchFactory.class);

    @Value("${freeswitch.esl.host}")
    private String host;

    @Value("${freeswitch.esl.port}")
    private Integer port;

    @Value("${freeswitch.esl.password}")
    private String password;

    @Value("${freeswitch.esl.timeout}")
    private Integer timeout;

    @Autowired
    private FreeSwitchEventHandler freeSwitchEventHandler;

    public Client client = new Client();

    public FreeSwitchFactory(){
        logger.info("Connect FreeSwitch By esl ...");
    }
    @Override
    public void run(ApplicationArguments args) {
        connect();
    }

    private void connect() {
        try {
            if (!client.canSend()) {
                client.connect(new InetSocketAddress(host, port), password, timeout);
                client.addEventListener((ctx, event) -> freeSwitchEventHandler.onMessage(event));
                client.setEventSubscriptions(IModEslApi.EventFormat.PLAIN, "CHANNEL_CREATE");
                client.setEventSubscriptions(IModEslApi.EventFormat.PLAIN, "CHANNEL_ANSWER");
                //client.setEventSubscriptions(IModEslApi.EventFormat.PLAIN, "CHANNEL_HANGUP");
                //client.setEventSubscriptions(IModEslApi.EventFormat.PLAIN, "CHANNEL_HANGUP_COMPLETE");
                client.setEventSubscriptions(IModEslApi.EventFormat.PLAIN, "CHANNEL_DESTROY");
            }
        } catch (Throwable t) {
            logger.error("Connect FreeSwitch failed", t);
        }
    }

    @Scheduled(cron = "0/5 * * * * *")
    private void reConnect(){
        if (!client.canSend()) {
            connect();
        }
    }
}
