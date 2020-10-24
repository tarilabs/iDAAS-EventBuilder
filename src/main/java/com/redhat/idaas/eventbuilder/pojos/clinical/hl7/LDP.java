package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LDP {
    private String LDP_1_PrimaryKeyValueLDP;
    private String LDP_2_LocationDepartment;
    private String LDP_3_LocationService;
    private String LDP_4_SpecialtyType;
    private String LDP_5_ValidPatientClasses;
    private String LDP_6_ActiveInactiveFlag;
    private String LDP_7_ActivationDateLDP;
    private String LDP_8_InactivationDateLDP;
    private String LDP_9_InactivatedReason;
    private String LDP_10_VisitingHours;
    private String LDP_11_ContactPhone;
    private String LDP_12_LocationCostCenter;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

