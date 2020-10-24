package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRA {
    private String PRA_1_PrimaryKeyValuePRA;
    private String PRA_2_PractitionerGroup;
    private String PRA_3_PractitionerCategory;
    private String PRA_4_ProviderBilling;
    private String PRA_5_Specialty;
    private String PRA_6_PractitionerIDNumbers;
    private String PRA_7_Privileges;
    private String PRA_8_DateEnteredPractice;
    private String PRA_9_Institution;
    private String PRA_10_DateLeftPractice;
    private String PRA_11_GovernmentReimbursementBillingEligibility;
    private String PRA_12_SetIDPRA;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

