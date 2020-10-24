package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IAM {
    private String IAM_1_SetIDIAM;
    private String IAM_2_AllergenTypeCode;
    private String IAM_3_AllergenCodeMnemonicDescription;
    private String IAM_4_AllergySeverityCode;
    private String IAM_5_AllergyReactionCode;
    private String IAM_6_AllergyActionCode;
    private String IAM_7_AllergyUniqueIdentifier;
    private String IAM_8_ActionReason;
    private String IAM_9_SensitivitytoCausativeAgentCode;
    private String IAM_10_AllergenGroupCodeMnemonicDescription;
    private String IAM_11_OnsetDate;
    private String IAM_12_OnsetDateText;
    private String IAM_13_ReportedDateTime;
    private String IAM_14_ReportedBy;
    private String IAM_15_RelationshiptoPatientCode;
    private String IAM_16_AlertDeviceCode;
    private String IAM_17_AllergyClinicalStatusCode;
    private String IAM_18_StatusedbyPerson;
    private String IAM_19_StatusedbyOrganization;
    private String IAM_20_StatusedatDateTime;
    private String IAM_21_InactivatedbyPerson;
    private String IAM_22_InactivatedDateTime;
    private String IAM_23_InitiallyRecordedbyPerson;
    private String IAM_24_InitiallyRecordedDateTime;
    private String IAM_25_ModifiedbyPerson;
    private String IAM_26_ModifiedDateTime;
    private String IAM_27_ClinicianIdentifiedCode;
    private String IAM_28_InitiallyRecordedbyOrganization;
    private String IAM_29_ModifiedbyOrganization;
    private String IAM_30_InactivatedbyOrganization;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

