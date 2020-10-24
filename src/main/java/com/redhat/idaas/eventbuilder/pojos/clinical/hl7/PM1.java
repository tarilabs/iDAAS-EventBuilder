package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PM1 {
    private String PM1_1_HealthPlanID;
    private String PM1_2_InsuranceCompanyID;
    private String PM1_3_InsuranceCompanyName;
    private String PM1_4_InsuranceCompanyAddress;
    private String PM1_5_InsuranceCoContactPerson;
    private String PM1_6_InsuranceCoPhoneNumber;
    private String PM1_7_GroupNumber;
    private String PM1_8_GroupName;
    private String PM1_9_PlanEffectiveDate;
    private String PM1_10_PlanExpirationDate;
    private String PM1_11_PatientDOBRequired;
    private String PM1_12_PatientGenderRequired;
    private String PM1_13_PatientRelationshipRequired;
    private String PM1_14_PatientSignatureRequired;
    private String PM1_15_DiagnosisRequired;
    private String PM1_16_ServiceRequired;
    private String PM1_17_PatientNameRequired;
    private String PM1_18_PatientAddressRequired;
    private String PM1_19_SubscribersNameRequired;
    private String PM1_20_WorkmansCompIndicator;
    private String PM1_21_BillTypeRequired;
    private String PM1_22_CommercialCarrierNameandAddressRequired;
    private String PM1_23_PolicyNumberPattern;
    private String PM1_24_GroupNumberPattern;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

