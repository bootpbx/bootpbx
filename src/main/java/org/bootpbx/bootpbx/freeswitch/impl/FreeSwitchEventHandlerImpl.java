package org.bootpbx.bootpbx.freeswitch.impl;

import com.google.gson.Gson;
import org.bootpbx.bootpbx.freeswitch.FreeSwitchEventEntity;
import org.bootpbx.bootpbx.freeswitch.FreeSwitchEventHandler;
import org.bootpbx.bootpbx.freeswitch.FreeSwitchUtil;
import org.freeswitch.esl.client.transport.event.EslEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FreeSwitchEventHandlerImpl implements FreeSwitchEventHandler {

    private final static Logger logger = LoggerFactory.getLogger(FreeSwitchEventHandlerImpl.class);

    @Override
    public void onMessage(EslEvent eslEvent) {
        FreeSwitchEventEntity freeSwitchEventEntity = FreeSwitchUtil.parseEvent(eslEvent);
        String mes = new Gson().toJson(freeSwitchEventEntity);
        logger.info(mes);
    }
}
