package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SPM {
    private String SPM_1_SetIDSPM;
    private String SPM_2_SpecimenID;
    private String SPM_3_SpecimenParentIDs;
    private String SPM_4_SpecimenType;
    private String SPM_5_SpecimenTypeModifier;
    private String SPM_6_SpecimenAdditives;
    private String SPM_7_SpecimenCollectionMethod;
    private String SPM_8_SpecimenSourceSite;
    private String SPM_9_SpecimenSourceSiteModifier;
    private String SPM_10_SpecimenCollectionSite;
    private String SPM_11_SpecimenRole;
    private String SPM_12_SpecimenCollectionAmount;
    private String SPM_13_GroupedSpecimenCount;
    private String SPM_14_SpecimenDescription;
    private String SPM_15_SpecimenHandlingCode;
    private String SPM_16_SpecimenRiskCode;
    private String SPM_17_SpecimenCollectionDateTime;
    private String SPM_18_SpecimenReceivedDateTime;
    private String SPM_19_SpecimenExpirationDateTime;
    private String SPM_20_SpecimenAvailability;
    private String SPM_21_SpecimenRejectReason;
    private String SPM_22_SpecimenQuality;
    private String SPM_23_SpecimenAppropriateness;
    private String SPM_24_SpecimenCondition;
    private String SPM_25_SpecimenCurrentQuantity;
    private String SPM_26_NumberofSpecimenContainers;
    private String SPM_27_ContainerType;
    private String SPM_28_ContainerCondition;
    private String SPM_29_SpecimenChildRole;
    private String SPM_30_AccessionID;
    private String SPM_31_OtherSpecimenID;
    private String SPM_32_ShipmentID;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

