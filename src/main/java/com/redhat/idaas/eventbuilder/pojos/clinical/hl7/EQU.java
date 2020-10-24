package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EQU {
    private String EQU_1_EquipmentInstanceIdentifier;
    private String EQU_2_EventDateTime;
    private String EQU_3_EquipmentState;
    private String EQU_4_LocalRemoteControlState;
    private String EQU_5_AlertLevel;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

