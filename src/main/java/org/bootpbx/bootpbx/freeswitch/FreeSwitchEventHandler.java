package org.bootpbx.bootpbx.freeswitch;

import org.freeswitch.esl.client.transport.event.EslEvent;

public interface FreeSwitchEventHandler {
    void onMessage(EslEvent eslEvent);
}
