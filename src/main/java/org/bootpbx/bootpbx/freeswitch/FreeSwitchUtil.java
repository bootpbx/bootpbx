package org.bootpbx.bootpbx.freeswitch;

import org.freeswitch.esl.client.transport.event.EslEvent;

public class FreeSwitchUtil {
    public static FreeSwitchEventEntity parseEvent(EslEvent eslEvent){
        FreeSwitchEventEntity eventEntity = new FreeSwitchEventEntity();
        eventEntity.setChannelState(eslEvent.getEventHeaders().get("Channel-State"));
        eventEntity.setChannelStateNumber(eslEvent.getEventHeaders().get("Channel-State-Number"));
        eventEntity.setChannelName(eslEvent.getEventHeaders().get("Channel-Name"));
        eventEntity.setUniqueId(eslEvent.getEventHeaders().get("Unique-ID"));
        eventEntity.setCallDirection(eslEvent.getEventHeaders().get("Call-Direction"));
        eventEntity.setAnswerState(eslEvent.getEventHeaders().get("Answer-State"));
        eventEntity.setChannelReadCodecName(eslEvent.getEventHeaders().get("Channel-Read-Codec-Name"));
        eventEntity.setChannelReadCodecRate(eslEvent.getEventHeaders().get("Channel-Read-Codec-Rate"));
        eventEntity.setChannelWriteCodecName(eslEvent.getEventHeaders().get("Channel-Write-Codec-Name"));
        eventEntity.setChannelWriteCodecRate(eslEvent.getEventHeaders().get("Channel-Write-Codec-Rate"));
        eventEntity.setCallerUsername(eslEvent.getEventHeaders().get("Caller-Username"));
        eventEntity.setCallerDialplan(eslEvent.getEventHeaders().get("Caller-Dialplan"));
        eventEntity.setCallerCallerIdName(eslEvent.getEventHeaders().get("Caller-Caller-ID-Name"));
        eventEntity.setCallerCallerIdNumber(eslEvent.getEventHeaders().get("Caller-Caller-ID-Number"));
        eventEntity.setCallerAni(eslEvent.getEventHeaders().get("Caller-ANI"));
        eventEntity.setCallerAniIi(eslEvent.getEventHeaders().get("Caller-ANI-II"));
        eventEntity.setCallerNetworkAddr(eslEvent.getEventHeaders().get("Caller-Network-Addr"));
        eventEntity.setCallerDestinationNumber(eslEvent.getEventHeaders().get("Caller-Destination-Number"));
        eventEntity.setCallerUniqueId(eslEvent.getEventHeaders().get("Caller-Unique-ID"));
        eventEntity.setCallerSource(eslEvent.getEventHeaders().get("Caller-Source"));
        eventEntity.setCallerContext(eslEvent.getEventHeaders().get("Caller-Context"));
        eventEntity.setCallerRdnis(eslEvent.getEventHeaders().get("Caller-RDNIS"));
        eventEntity.setCallerChannelName(eslEvent.getEventHeaders().get("Caller-Channel-Name"));
        eventEntity.setCallerProfileIndex(eslEvent.getEventHeaders().get("Caller-Profile-Index"));
        eventEntity.setCallerChannelCreatedTime(eslEvent.getEventHeaders().get("Caller-Channel-Created-Time"));
        eventEntity.setCallerChannelAnsweredTime(eslEvent.getEventHeaders().get("Caller-Channel-Answered-Time"));
        eventEntity.setCallerChannelHangupTime(eslEvent.getEventHeaders().get("Caller-Channel-Hangup-Time"));
        eventEntity.setCallerChannelTransferTime(eslEvent.getEventHeaders().get("Caller-Channel-Transfer-Time"));
        eventEntity.setCallerScreenBit(eslEvent.getEventHeaders().get("Caller-Screen-Bit"));
        eventEntity.setCallerPrivacyHideName(eslEvent.getEventHeaders().get("Caller-Privacy-Hide-Name"));
        eventEntity.setCallerPrivacyHideNumber(eslEvent.getEventHeaders().get("Caller-Privacy-Hide-Number"));
        eventEntity.setVariableSipReceivedIp(eslEvent.getEventHeaders().get("variable_sip_received_ip"));
        eventEntity.setVariableSipReceivedPort(eslEvent.getEventHeaders().get("variable_sip_received_port"));
        eventEntity.setVariableSipAuthorized(eslEvent.getEventHeaders().get("variable_sip_authorized"));
        eventEntity.setVariableSipMailbox(eslEvent.getEventHeaders().get("variable_sip_mailbox"));
        eventEntity.setVariableSipAuthUsername(eslEvent.getEventHeaders().get("variable_sip_auth_username"));
        eventEntity.setVariableSipAuthRealm(eslEvent.getEventHeaders().get("variable_sip_auth_realm"));
        eventEntity.setVariableMailbox(eslEvent.getEventHeaders().get("variable_mailbox"));
        eventEntity.setVariableUserName(eslEvent.getEventHeaders().get("variable_user_name"));
        eventEntity.setVariableDomainName(eslEvent.getEventHeaders().get("variable_domain_name"));
        eventEntity.setVariableRecordStereo(eslEvent.getEventHeaders().get("variable_record_stereo"));
        eventEntity.setVariableAccountcode(eslEvent.getEventHeaders().get("variable_accountcode"));
        eventEntity.setVariableUserContext(eslEvent.getEventHeaders().get("variable_user_context"));
        eventEntity.setVariableEffectiveCallerIdName(eslEvent.getEventHeaders().get("variable_effective_caller_id_name"));
        eventEntity.setVariableEffectiveCallerIdNumber(eslEvent.getEventHeaders().get("variable_effective_caller_id_number"));
        eventEntity.setVariableCallerDomain(eslEvent.getEventHeaders().get("variable_caller_domain"));
        eventEntity.setVariableSipFromUser(eslEvent.getEventHeaders().get("variable_sip_from_user"));
        eventEntity.setVariableSipFromUri(eslEvent.getEventHeaders().get("variable_sip_from_uri"));
        eventEntity.setVariableSipFromHost(eslEvent.getEventHeaders().get("variable_sip_from_host"));
        eventEntity.setVariableSipFromUserStripped(eslEvent.getEventHeaders().get("variable_sip_from_user_stripped"));
        eventEntity.setVariableSipFromTag(eslEvent.getEventHeaders().get("variable_sip_from_tag"));
        eventEntity.setVariableSofiaProfileName(eslEvent.getEventHeaders().get("variable_sofia_profile_name"));
        eventEntity.setVariableSofiaProfileDomainName(eslEvent.getEventHeaders().get("variable_sofia_profile_domain_name"));
        eventEntity.setVariableSipFullRoute(eslEvent.getEventHeaders().get("variable_sip_full_route"));
        eventEntity.setVariableSipFullVia(eslEvent.getEventHeaders().get("variable_sip_full_via"));
        eventEntity.setVariableSipFullFrom(eslEvent.getEventHeaders().get("variable_sip_full_from"));
        eventEntity.setVariableSipFullTo(eslEvent.getEventHeaders().get("variable_sip_full_to"));
        eventEntity.setVariableSipReqParams(eslEvent.getEventHeaders().get("variable_sip_req_params"));
        eventEntity.setVariableSipReqUser(eslEvent.getEventHeaders().get("variable_sip_req_user"));
        eventEntity.setVariableSipReqUri(eslEvent.getEventHeaders().get("variable_sip_req_uri"));
        eventEntity.setVariableSipReqHost(eslEvent.getEventHeaders().get("variable_sip_req_host"));
        eventEntity.setVariableSipToParams(eslEvent.getEventHeaders().get("variable_sip_to_params"));
        eventEntity.setVariableSipToTag(eslEvent.getEventHeaders().get("variable_sip_to_tag"));
        eventEntity.setVariableSipToUser(eslEvent.getEventHeaders().get("variable_sip_to_user"));
        eventEntity.setVariableSipToUri(eslEvent.getEventHeaders().get("variable_sip_to_uri"));
        eventEntity.setVariableSipToHost(eslEvent.getEventHeaders().get("variable_sip_to_host"));
        eventEntity.setVariableSipContactParams(eslEvent.getEventHeaders().get("variable_sip_contact_params"));
        eventEntity.setVariableSipContactUser(eslEvent.getEventHeaders().get("variable_sip_contact_user"));
        eventEntity.setVariableSipContactPort(eslEvent.getEventHeaders().get("variable_sip_contact_port"));
        eventEntity.setVariableSipContactUri(eslEvent.getEventHeaders().get("variable_sip_contact_uri"));
        eventEntity.setVariableSipContactHost(eslEvent.getEventHeaders().get("variable_sip_contact_host"));
        eventEntity.setVariableSipInviteDomain(eslEvent.getEventHeaders().get("variable_sip_invite_domain"));
        eventEntity.setVariableChannelName(eslEvent.getEventHeaders().get("variable_channel_name"));
        eventEntity.setVariableSipCallId(eslEvent.getEventHeaders().get("variable_sip_call_id"));
        eventEntity.setVariableSipUserAgent(eslEvent.getEventHeaders().get("variable_sip_user_agent"));
        eventEntity.setVariableSipViaHost(eslEvent.getEventHeaders().get("variable_sip_via_host"));
        eventEntity.setVariableSipViaPort(eslEvent.getEventHeaders().get("variable_sip_via_port"));
        eventEntity.setVariableSipViaRport(eslEvent.getEventHeaders().get("variable_sip_via_rport"));
        eventEntity.setVariablePresenceId(eslEvent.getEventHeaders().get("variable_presence_id"));
        eventEntity.setVariableSipHPKeyFlags(eslEvent.getEventHeaders().get("variable_sip_h_P-Key-Flags"));
        eventEntity.setVariableSwitchRSdp(eslEvent.getEventHeaders().get("variable_switch_r_sdp"));
        eventEntity.setVariableRemoteMediaIp(eslEvent.getEventHeaders().get("variable_remote_media_ip"));
        eventEntity.setVariableRemoteMediaPort(eslEvent.getEventHeaders().get("variable_remote_media_port"));
        eventEntity.setVariableWriteCodec(eslEvent.getEventHeaders().get("variable_write_codec"));
        eventEntity.setVariableWriteRate(eslEvent.getEventHeaders().get("variable_write_rate"));
        eventEntity.setVariableEndpointDisposition(eslEvent.getEventHeaders().get("variable_endpoint_disposition"));
        eventEntity.setVariableDialedExt(eslEvent.getEventHeaders().get("variable_dialed_ext"));
        eventEntity.setVariableTransferRingback(eslEvent.getEventHeaders().get("variable_transfer_ringback"));
        eventEntity.setVariableCallTimeout(eslEvent.getEventHeaders().get("variable_call_timeout"));
        eventEntity.setVariableHangupAfterBridge(eslEvent.getEventHeaders().get("variable_hangup_after_bridge"));
        eventEntity.setVariableContinueOnFail(eslEvent.getEventHeaders().get("variable_continue_on_fail"));
        eventEntity.setVariableDialedUser(eslEvent.getEventHeaders().get("variable_dialed_user"));
        eventEntity.setVariableDialedDomain(eslEvent.getEventHeaders().get("variable_dialed_domain"));
        eventEntity.setVariableSipRedirectContactUser0(eslEvent.getEventHeaders().get("variable_sip_redirect_contact_user_0"));
        eventEntity.setVariableSipRedirectContactHost0(eslEvent.getEventHeaders().get("variable_sip_redirect_contact_host_0"));
        eventEntity.setVariableSipHReferredBy(eslEvent.getEventHeaders().get("variable_sip_h_Referred-By"));
        eventEntity.setVariableSipReferTo(eslEvent.getEventHeaders().get("variable_sip_refer_to"));
        eventEntity.setVariableMaxForwards(eslEvent.getEventHeaders().get("variable_max_forwards"));
        eventEntity.setVariableOriginateDisposition(eslEvent.getEventHeaders().get("variable_originate_disposition"));
        eventEntity.setVariableReadCodec(eslEvent.getEventHeaders().get("variable_read_codec"));
        eventEntity.setVariableReadRate(eslEvent.getEventHeaders().get("variable_read_rate"));
        eventEntity.setVariableOpen(eslEvent.getEventHeaders().get("variable_open"));
        eventEntity.setVariableUseProfile(eslEvent.getEventHeaders().get("variable_use_profile"));
        eventEntity.setVariableCurrentApplication(eslEvent.getEventHeaders().get("variable_current_application"));
        eventEntity.setVariableEpCodecString(eslEvent.getEventHeaders().get("variable_ep_codec_string"));
        eventEntity.setVariableDisableHold(eslEvent.getEventHeaders().get("variable_disable_hold"));
        eventEntity.setVariableSipAclAuthedBy(eslEvent.getEventHeaders().get("variable_sip_acl_authed_by"));
        eventEntity.setVariableCurlResponseData(eslEvent.getEventHeaders().get("variable_curl_response_data"));
        eventEntity.setVariableDropDtmf(eslEvent.getEventHeaders().get("variable_drop_dtmf"));
        eventEntity.setSipCodecNegotiation(eslEvent.getEventHeaders().get("sip_codec_negotiation"));
        eventEntity.setCallerCalleeIdName(eslEvent.getEventHeaders().get("Caller-Callee-ID-Name"));
        eventEntity.setCallerCalleeIdNumber(eslEvent.getEventHeaders().get("Caller-Callee-ID-Number"));
        eventEntity.setCallerChannelProgressMediaTime(eslEvent.getEventHeaders().get("Caller-Channel-Progress-Media-Time"));
        eventEntity.setCallerChannelProgressTime(eslEvent.getEventHeaders().get("Caller-Channel-Progress-Time"));
        eventEntity.setCallerDirection(eslEvent.getEventHeaders().get("Caller-Direction"));
        eventEntity.setCallerProfileCreatedTime(eslEvent.getEventHeaders().get("Caller-Profile-Created-Time"));
        eventEntity.setCallerTransferSource(eslEvent.getEventHeaders().get("Caller-Transfer-Source"));
        eventEntity.setChannelCallState(eslEvent.getEventHeaders().get("Channel-Call-State"));
        eventEntity.setChannelCallUuid(eslEvent.getEventHeaders().get("Channel-Call-UUID"));
        eventEntity.setChannelHitDialplan(eslEvent.getEventHeaders().get("Channel-HIT-Dialplan"));
        eventEntity.setChannelReadCodecBitRate(eslEvent.getEventHeaders().get("Channel-Read-Codec-Bit-Rate"));
        eventEntity.setChannelWriteCodecBitRate(eslEvent.getEventHeaders().get("Channel-Write-Codec-Bit-Rate"));
        eventEntity.setCoreUuid(eslEvent.getEventHeaders().get("Core-UUID"));
        eventEntity.setEventCallingFile(eslEvent.getEventHeaders().get("Event-Calling-File"));
        eventEntity.setEventCallingFunction(eslEvent.getEventHeaders().get("Event-Calling-Function"));
        eventEntity.setEventCallingLineNumber(eslEvent.getEventHeaders().get("Event-Calling-Line-Number"));
        eventEntity.setEventDateGmt(eslEvent.getEventHeaders().get("Event-Date-GMT"));
        eventEntity.setEventDateLocal(eslEvent.getEventHeaders().get("Event-Date-Local"));
        eventEntity.setEventDateTimestamp(eslEvent.getEventHeaders().get("Event-Date-Timestamp"));
        eventEntity.setEventName(eslEvent.getEventHeaders().get("Event-Name"));
        eventEntity.setEventSequence(eslEvent.getEventHeaders().get("Event-Sequence"));
        eventEntity.setFreeswitchHostname(eslEvent.getEventHeaders().get("FreeSWITCH-Hostname"));
        eventEntity.setFreeswitchIpv4(eslEvent.getEventHeaders().get("FreeSWITCH-IPv4"));
        eventEntity.setFreeswitchIpv6(eslEvent.getEventHeaders().get("FreeSWITCH-IPv6"));
        eventEntity.setFreeswitchSwitchname(eslEvent.getEventHeaders().get("FreeSWITCH-Switchname"));
        eventEntity.setHuntAni(eslEvent.getEventHeaders().get("Hunt-ANI"));
        eventEntity.setHuntCalleeIdName(eslEvent.getEventHeaders().get("Hunt-Callee-ID-Name"));
        eventEntity.setHuntCalleeIdNumber(eslEvent.getEventHeaders().get("Hunt-Callee-ID-Number"));
        eventEntity.setHuntCallerIdName(eslEvent.getEventHeaders().get("Hunt-Caller-ID-Name"));
        eventEntity.setHuntCallerIdNumber(eslEvent.getEventHeaders().get("Hunt-Caller-ID-Number"));
        eventEntity.setHuntChannelAnsweredTime(eslEvent.getEventHeaders().get("Hunt-Channel-Answered-Time"));
        eventEntity.setHuntChannelCreatedTime(eslEvent.getEventHeaders().get("Hunt-Channel-Created-Time"));
        eventEntity.setHuntChannelHangupTime(eslEvent.getEventHeaders().get("Hunt-Channel-Hangup-Time"));
        eventEntity.setHuntChannelName(eslEvent.getEventHeaders().get("Hunt-Channel-Name"));
        eventEntity.setHuntChannelProgressMediaTime(eslEvent.getEventHeaders().get("Hunt-Channel-Progress-Media-Time"));
        eventEntity.setHuntChannelProgressTime(eslEvent.getEventHeaders().get("Hunt-Channel-Progress-Time"));
        eventEntity.setHuntChannelTransferTime(eslEvent.getEventHeaders().get("Hunt-Channel-Transfer-Time"));
        eventEntity.setHuntContext(eslEvent.getEventHeaders().get("Hunt-Context"));
        eventEntity.setHuntDestinationNumber(eslEvent.getEventHeaders().get("Hunt-Destination-Number"));
        eventEntity.setHuntDialplan(eslEvent.getEventHeaders().get("Hunt-Dialplan"));
        eventEntity.setHuntDirection(eslEvent.getEventHeaders().get("Hunt-Direction"));
        eventEntity.setHuntNetworkAddr(eslEvent.getEventHeaders().get("Hunt-Network-Addr"));
        eventEntity.setHuntPrivacyHideName(eslEvent.getEventHeaders().get("Hunt-Privacy-Hide-Name"));
        eventEntity.setHuntPrivacyHideNumber(eslEvent.getEventHeaders().get("Hunt-Privacy-Hide-Number"));
        eventEntity.setHuntProfileCreatedTime(eslEvent.getEventHeaders().get("Hunt-Profile-Created-Time"));
        eventEntity.setHuntProfileIndex(eslEvent.getEventHeaders().get("Hunt-Profile-Index"));
        eventEntity.setHuntRdnis(eslEvent.getEventHeaders().get("Hunt-RDNIS"));
        eventEntity.setHuntScreenBit(eslEvent.getEventHeaders().get("Hunt-Screen-Bit"));
        eventEntity.setHuntSource(eslEvent.getEventHeaders().get("Hunt-Source"));
        eventEntity.setHuntTransferSource(eslEvent.getEventHeaders().get("Hunt-Transfer-Source"));
        eventEntity.setHuntUniqueId(eslEvent.getEventHeaders().get("Hunt-Unique-ID"));
        eventEntity.setHuntUsername(eslEvent.getEventHeaders().get("Hunt-Username"));
        eventEntity.setPresenceCallDirection(eslEvent.getEventHeaders().get("Presence-Call-Direction"));
        eventEntity.setVariableDialstatus(eslEvent.getEventHeaders().get("variable_DIALSTATUS"));
        eventEntity.setVariableAbsoluteCodecString(eslEvent.getEventHeaders().get("variable_absolute_codec_string"));
        eventEntity.setVariableAdvertisedMediaIp(eslEvent.getEventHeaders().get("variable_advertised_media_ip"));
        eventEntity.setVariableBridgeChannel(eslEvent.getEventHeaders().get("variable_bridge_channel"));
        eventEntity.setVariableBridgeHangupCause(eslEvent.getEventHeaders().get("variable_bridge_hangup_cause"));
        eventEntity.setVariableBridgeUuid(eslEvent.getEventHeaders().get("variable_bridge_uuid"));
        eventEntity.setVariableCallUuid(eslEvent.getEventHeaders().get("variable_call_uuid"));
        eventEntity.setVariableCurrentApplicationResponse(eslEvent.getEventHeaders().get("variable_current_application_response"));
        eventEntity.setVariableDirection(eslEvent.getEventHeaders().get("variable_direction"));
        eventEntity.setVariableInheritCodec(eslEvent.getEventHeaders().get("variable_inherit_codec"));
        eventEntity.setVariableIsOutbound(eslEvent.getEventHeaders().get("variable_is_outbound"));
        eventEntity.setVariableLastBridgeTo(eslEvent.getEventHeaders().get("variable_last_bridge_to"));
        eventEntity.setVariableLastSentCalleeIdName(eslEvent.getEventHeaders().get("variable_last_sent_callee_id_name"));
        eventEntity.setVariableLastSentCalleeIdNumber(eslEvent.getEventHeaders().get("variable_last_sent_callee_id_number"));
        eventEntity.setVariableLocalMediaIp(eslEvent.getEventHeaders().get("variable_local_media_ip"));
        eventEntity.setVariableLocalMediaPort(eslEvent.getEventHeaders().get("variable_local_media_port"));
        eventEntity.setVariableNumberAlias(eslEvent.getEventHeaders().get("variable_number_alias"));
        eventEntity.setVariableOriginateEarlyMedia(eslEvent.getEventHeaders().get("variable_originate_early_media"));
        eventEntity.setVariableOriginatingLegUuid(eslEvent.getEventHeaders().get("variable_originating_leg_uuid"));
        eventEntity.setVariableOriginator(eslEvent.getEventHeaders().get("variable_originator"));
        eventEntity.setVariableOriginatorCodec(eslEvent.getEventHeaders().get("variable_originator_codec"));
        eventEntity.setVariableOutboundCallerIdNumber(eslEvent.getEventHeaders().get("variable_outbound_caller_id_number"));
        eventEntity.setVariableRecoveryProfileName(eslEvent.getEventHeaders().get("variable_recovery_profile_name"));
        eventEntity.setVariableRtpUseSsrc(eslEvent.getEventHeaders().get("variable_rtp_use_ssrc"));
        eventEntity.setVariableSessionId(eslEvent.getEventHeaders().get("variable_session_id"));
        eventEntity.setVariableSip2833RecvPayload(eslEvent.getEventHeaders().get("variable_sip_2833_recv_payload"));
        eventEntity.setVariableSip2833SendPayload(eslEvent.getEventHeaders().get("variable_sip_2833_send_payload"));
        eventEntity.setVariableSipPAssertedIdentity(eslEvent.getEventHeaders().get("variable_sip_P-Asserted-Identity"));
        eventEntity.setVariableSipPrivacy(eslEvent.getEventHeaders().get("variable_sip_Privacy"));
        eventEntity.setVariableSipAudioRecvPt(eslEvent.getEventHeaders().get("variable_sip_audio_recv_pt"));
        eventEntity.setVariableSipCidType(eslEvent.getEventHeaders().get("variable_sip_cid_type"));
        eventEntity.setVariableSipCseq(eslEvent.getEventHeaders().get("variable_sip_cseq"));
        eventEntity.setVariableSipDestinationUrl(eslEvent.getEventHeaders().get("variable_sip_destination_url"));
        eventEntity.setVariableSipFromDisplay(eslEvent.getEventHeaders().get("variable_sip_from_display"));
        eventEntity.setVariableSipFromPort(eslEvent.getEventHeaders().get("variable_sip_from_port"));
        eventEntity.setVariableSipGateway(eslEvent.getEventHeaders().get("variable_sip_gateway"));
        eventEntity.setVariableSipGatewayName(eslEvent.getEventHeaders().get("variable_sip_gateway_name"));
        eventEntity.setVariableSipHPChargingVector(eslEvent.getEventHeaders().get("variable_sip_h_P-Charging-Vector"));
        eventEntity.setVariableSipLocalNetworkAddr(eslEvent.getEventHeaders().get("variable_sip_local_network_addr"));
        eventEntity.setVariableSipLocalSdpStr(eslEvent.getEventHeaders().get("variable_sip_local_sdp_str"));
        eventEntity.setVariableSipNetworkIp(eslEvent.getEventHeaders().get("variable_sip_network_ip"));
        eventEntity.setVariableSipNetworkPort(eslEvent.getEventHeaders().get("variable_sip_network_port"));
        eventEntity.setVariableSipNumberAlias(eslEvent.getEventHeaders().get("variable_sip_number_alias"));
        eventEntity.setVariableSipOutgoingContactUri(eslEvent.getEventHeaders().get("variable_sip_outgoing_contact_uri"));
        eventEntity.setVariableSipPhPChargingVector(eslEvent.getEventHeaders().get("variable_sip_ph_P-Charging-Vector"));
        eventEntity.setVariableSipProfileName(eslEvent.getEventHeaders().get("variable_sip_profile_name"));
        eventEntity.setVariableSipRecoverContact(eslEvent.getEventHeaders().get("variable_sip_recover_contact"));
        eventEntity.setVariableSipRecoverVia(eslEvent.getEventHeaders().get("variable_sip_recover_via"));
        eventEntity.setVariableSipReplyHost(eslEvent.getEventHeaders().get("variable_sip_reply_host"));
        eventEntity.setVariableSipReplyPort(eslEvent.getEventHeaders().get("variable_sip_reply_port"));
        eventEntity.setVariableSipReqPort(eslEvent.getEventHeaders().get("variable_sip_req_port"));
        eventEntity.setVariableSipToPort(eslEvent.getEventHeaders().get("variable_sip_to_port"));
        eventEntity.setVariableSipUseCodecName(eslEvent.getEventHeaders().get("variable_sip_use_codec_name"));
        eventEntity.setVariableSipUseCodecPtime(eslEvent.getEventHeaders().get("variable_sip_use_codec_ptime"));
        eventEntity.setVariableSipUseCodecRate(eslEvent.getEventHeaders().get("variable_sip_use_codec_rate"));
        eventEntity.setVariableSipUsePt(eslEvent.getEventHeaders().get("variable_sip_use_pt"));
        eventEntity.setVariableSipViaProtocol(eslEvent.getEventHeaders().get("variable_sip_via_protocol"));
        eventEntity.setVariableSwitchMSdp(eslEvent.getEventHeaders().get("variable_switch_m_sdp"));
        eventEntity.setVariableTransferHistory(eslEvent.getEventHeaders().get("variable_transfer_history"));
        eventEntity.setVariableTransferSource(eslEvent.getEventHeaders().get("variable_transfer_source"));
        eventEntity.setVariableUuid(eslEvent.getEventHeaders().get("variable_uuid"));
        return eventEntity;
    }
}