package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MSA {
    private String MSA_1_AcknowledgmentCode;
    private String MSA_2_MessageControlID;
    private String MSA_3_TextMessage;
    private String MSA_4_ExpectedSequenceNumber;
    private String MSA_6_ErrorCondition;
    private String MSA_7_MessageWaitingNumber;
    private String MSA_8_MessageWaitingPriority;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

