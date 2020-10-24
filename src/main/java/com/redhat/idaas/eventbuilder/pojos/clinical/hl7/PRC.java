package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRC {
    private String PRC_1_PrimaryKeyValuePRC;
    private String PRC_2_FacilityIDPRC;
    private String PRC_3_Department;
    private String PRC_4_ValidPatientClasses;
    private String PRC_5_Price;
    private String PRC_6_Formula;
    private String PRC_7_MinimumQuantity;
    private String PRC_8_MaximumQuantity;
    private String PRC_9_MinimumPrice;
    private String PRC_10_MaximumPrice;
    private String PRC_11_EffectiveStartDate;
    private String PRC_12_EffectiveEndDate;
    private String PRC_13_PriceOverrideFlag;
    private String PRC_14_BillingCategory;
    private String PRC_15_ChargeableFlag;
    private String PRC_16_ActiveInactiveFlag;
    private String PRC_17_Cost;
    private String PRC_18_ChargeonIndicator;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

