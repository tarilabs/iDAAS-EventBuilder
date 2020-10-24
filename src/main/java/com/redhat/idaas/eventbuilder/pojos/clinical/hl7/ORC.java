package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORC {
    private String ORC_1_OrderControl;
    private String ORC_2_PlacerOrderNumber;
    private String ORC_3_FillerOrderNumber;
    private String ORC_4_PlacerGroupNumber;
    private String ORC_5_OrderStatus;
    private String ORC_6_ResponseFlag;
    private String ORC_7_QuantityTiming;
    private String ORC_8_ParentOrder;
    private String ORC_9_DateTimeofTransaction;
    private String ORC_10_EnteredBy;
    private String ORC_11_VerifiedBy;
    private String ORC_12_OrderingProvider;
    private String ORC_13_EnterersLocation;
    private String ORC_14_CallBackPhoneNumber;
    private String ORC_15_OrderEffectiveDateTime;
    private String ORC_16_OrderControlCodeReason;
    private String ORC_17_EnteringOrganization;
    private String ORC_18_EnteringDevice;
    private String ORC_19_ActionBy;
    private String ORC_20_AdvancedBeneficiaryNoticeCode;
    private String ORC_21_OrderingFacilityName;
    private String ORC_22_OrderingFacilityAddress;
    private String ORC_23_OrderingFacilityPhoneNumber;
    private String ORC_24_OrderingProviderAddress;
    private String ORC_25_OrderStatusModifier;
    private String ORC_26_AdvancedBeneficiaryNoticeOverrideReason;
    private String ORC_27_FillersExpectedAvailabilityDateTime;
    private String ORC_28_ConfidentialityCode;
    private String ORC_29_OrderType;
    private String ORC_30_EntererAuthorizationMode;
    private String ORC_31_ParentUniversalServiceIdentifier;
    private String ORC_32_AdvancedBeneficiaryNoticeDate;
    private String ORC_33_AlternatePlacerOrderNumber;
    private String ORC_34_OrderWorkflowProfile;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

