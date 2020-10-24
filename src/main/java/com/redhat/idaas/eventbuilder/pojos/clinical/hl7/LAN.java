package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LAN {
    private String LAN_1_SetIDLAN;
    private String LAN_2_LanguageCode;
    private String LAN_3_LanguageAbilityCode;
    private String LAN_4_LanguageProficiencyCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

