package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IAR {
    private String IAR_1_AllergyReactionCode;
    private String IAR_2_AllergySeverityCode;
    private String IAR_3_SensitivitytoCausativeAgentCode;
    private String IAR_4_Management;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

