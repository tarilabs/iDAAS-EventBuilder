package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CDO {
    private String CDO_1_SetIDCDO;
    private String CDO_2_ActionCode;
    private String CDO_3_CumulativeDosageLimit;
    private String CDO_4_CumulativeDosageLimitTimeInterval;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

