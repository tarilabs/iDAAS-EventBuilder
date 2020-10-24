package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXC {
    private String RXC_1_RXComponentType;
    private String RXC_2_ComponentCode;
    private String RXC_3_ComponentAmount;
    private String RXC_4_ComponentUnits;
    private String RXC_5_ComponentStrength;
    private String RXC_6_ComponentStrengthUnits;
    private String RXC_7_SupplementaryCode;
    private String RXC_8_ComponentDrugStrengthVolume;
    private String RXC_9_ComponentDrugStrengthVolumeUnits;
    private String RXC_10_DispenseAmount;
    private String RXC_11_DispenseUnits;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

