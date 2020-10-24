package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFE {
    private String MFE_1_RecordLevelEventCode;
    private String MFE_2_MFNControlID;
    private String MFE_3_EffectiveDateTime;
    private String MFE_4_PrimaryKeyValueMFE;
    private String MFE_5_PrimaryKeyValueType;
    private String MFE_6_EnteredDateTime;
    private String MFE_7_EnteredBy;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

