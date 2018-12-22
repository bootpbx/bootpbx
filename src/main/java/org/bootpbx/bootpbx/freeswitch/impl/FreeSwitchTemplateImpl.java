package org.bootpbx.bootpbx.freeswitch.impl;

import org.bootpbx.bootpbx.freeswitch.FreeSwitchFactory;
import org.bootpbx.bootpbx.freeswitch.FreeSwitchTemplate;
import org.freeswitch.esl.client.transport.event.EslEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class FreeSwitchTemplateImpl implements FreeSwitchTemplate {

    @Autowired
    private FreeSwitchFactory freeSwitchFactory;

    /**
     * invite
     *
     * @param callerCallerIdNumber    callerCallerIdNumber
     * @param callerDestinationNumber callerDestinationNumber
     */
    public String invite(String callerCallerIdNumber, String callerDestinationNumber) throws ExecutionException, InterruptedException {

        String dialString = String.format("{origination_caller_id_number=%s}user/%s %s", callerCallerIdNumber, callerCallerIdNumber, callerDestinationNumber);

        CompletableFuture<EslEvent> message = freeSwitchFactory.client.sendBackgroundApiCommand("originate", dialString);
        return message.get().getEventBodyLines().get(0);
    }
}
