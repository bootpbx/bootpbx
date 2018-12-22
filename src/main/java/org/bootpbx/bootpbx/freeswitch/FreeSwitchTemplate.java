package org.bootpbx.bootpbx.freeswitch;
import java.util.concurrent.ExecutionException;


public interface FreeSwitchTemplate {
    /**
     * invite
     *
     * @param callerCallerIdNumber    callerCallerIdNumber
     * @param callerDestinationNumber callerDestinationNumber
     */
    String invite(String callerCallerIdNumber, String callerDestinationNumber) throws ExecutionException, InterruptedException;
}
