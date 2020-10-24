package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFI {
    private String MFI_1_MasterFileIdentifier;
    private String MFI_2_MasterFileApplicationIdentifier;
    private String MFI_3_FileLevelEventCode;
    private String MFI_4_EnteredDateTime;
    private String MFI_5_EffectiveDateTime;
    private String MFI_6_ResponseLevelCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

