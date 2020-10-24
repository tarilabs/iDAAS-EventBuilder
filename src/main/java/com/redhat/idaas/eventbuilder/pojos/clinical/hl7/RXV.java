package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXV {
    private String RXV_1_SetIDRXV;
    private String RXV_2_BolusType;
    private String RXV_3_BolusDoseAmount;
    private String RXV_4_BolusDoseAmountUnits;
    private String RXV_5_BolusDoseVolume;
    private String RXV_6_BolusDoseVolumeUnits;
    private String RXV_7_PCAType;
    private String RXV_8_PCADoseAmount;
    private String RXV_9_PCADoseAmountUnits;
    private String RXV_10_PCADoseAmountVolume;
    private String RXV_11_PCADoseAmountVolumeUnits;
    private String RXV_12_MaxDoseAmount;
    private String RXV_13_MaxDoseAmountUnits;
    private String RXV_14_MaxDoseAmountVolume;
    private String RXV_15_MaxDoseAmountVolumeUnits;
    private String RXV_16_MaxDoseperTime;
    private String RXV_17_LockoutInterval;
    private String RXV_18_SyringeManufacturer;
    private String RXV_19_SyringeModelNumber;
    private String RXV_20_SyringeSize;
    private String RXV_21_SyringeSizeUnits;
    private String RXV_22_ActionCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

