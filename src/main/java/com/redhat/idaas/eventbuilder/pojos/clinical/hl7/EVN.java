package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EVN {
    private String EVN_1_EventTypeCode;
    private String EVN_2_RecordedDateTime;
    private String EVN_3_DateTimePlannedEvent;
    private String EVN_4_EventReasonCode;
    private String EVN_5_OperatorID;
    private String EVN_6_EventOccurred;
    private String EVN_7_EventFacility;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

