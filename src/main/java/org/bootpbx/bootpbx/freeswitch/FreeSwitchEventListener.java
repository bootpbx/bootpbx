package org.bootpbx.bootpbx.freeswitch;

import com.google.common.base.Throwables;
import org.freeswitch.esl.client.inbound.Client;
import org.freeswitch.esl.client.inbound.IEslEventListener;
import org.freeswitch.esl.client.internal.IModEslApi.EventFormat;
import org.freeswitch.esl.client.outbound.IClientHandler;
import org.freeswitch.esl.client.outbound.IClientHandlerFactory;
import org.freeswitch.esl.client.outbound.SocketClient;
import org.freeswitch.esl.client.transport.event.EslEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.net.InetSocketAddress;

@Component
@Order(1)
public class FreeSwitchEventListener implements ApplicationRunner {

    @Value("${freeswitch.esl.host}")
    private String host;

    @Value("${freeswitch.esl.port}")
    private Integer port;


    @Value("${freeswitch.esl.password}")
    private String password;

    @Value("${freeswitch.esl.timeout}")
    private Integer timeout;

    private final static Logger logger = LoggerFactory.getLogger(FreeSwitchEventListener.class);

    @Override
    public void run(ApplicationArguments args) {
        init();
    }

    private void init() {
        try {
            Client client = new Client();

            client.addEventListener((ctx, event) -> logger.info("Received event: {}", event.getEventName()));

            client.connect(new InetSocketAddress(host, port), password, timeout);
            //client.setEventSubscriptions(EventFormat.PLAIN, "all");
            client.setEventSubscriptions(EventFormat.PLAIN, "CHANNEL_ANSWER");
            client.setEventSubscriptions(EventFormat.PLAIN, "CHANNEL_HANGUP");
            client.setEventSubscriptions(EventFormat.PLAIN, "CHANNEL_HANGUP_COMPLETE");
            client.setEventSubscriptions(EventFormat.PLAIN, "CHANNEL_DESTROY");

        } catch (Throwable t) {
            Throwables.throwIfUnchecked(t);
        }
    }


}
