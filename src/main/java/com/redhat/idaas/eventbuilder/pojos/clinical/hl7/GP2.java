package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GP2 {
    private String GP2_1_RevenueCode;
    private String GP2_2_NumberofServiceUnits;
    private String GP2_3_Charge;
    private String GP2_4_ReimbursementActionCode;
    private String GP2_5_DenialorRejectionCode;
    private String GP2_6_OCEEditCode;
    private String GP2_7_AmbulatoryPaymentClassificationCode;
    private String GP2_8_ModifierEditCode;
    private String GP2_9_PaymentAdjustmentCode;
    private String GP2_10_PackagingStatusCode;
    private String GP2_11_ExpectedCMSPaymentAmount;
    private String GP2_12_ReimbursementTypeCode;
    private String GP2_13_CoPayAmount;
    private String GP2_14_PayRateperServiceUnit;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

