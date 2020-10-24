package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DPS {
    private String DPS_1_DiagnosisCodeMCP;
    private String DPS_2_ProcedureCode;
    private String DPS_3_EffectiveDateTime;
    private String DPS_4_ExpirationDateTime;
    private String DPS_5_TypeofLimitation;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

