package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ECD {
    private String ECD_1_ReferenceCommandNumber;
    private String ECD_2_RemoteControlCommand;
    private String ECD_3_ResponseRequired;
    private String ECD_4_RequestedCompletionTime;
    private String ECD_5_Parameters;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

