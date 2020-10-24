package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OVR {
    private String OVR_1_BusinessRuleOverrideType;
    private String OVR_2_BusinessRuleOverrideCode;
    private String OVR_3_OverrideComments;
    private String OVR_4_OverrideEnteredBy;
    private String OVR_5_OverrideAuthorizedBy;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

