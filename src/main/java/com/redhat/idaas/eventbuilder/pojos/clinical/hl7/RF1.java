package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RF1 {
    private String RF1_1_ReferralStatus;
    private String RF1_2_ReferralPriority;
    private String RF1_3_ReferralType;
    private String RF1_4_ReferralDisposition;
    private String RF1_5_ReferralCategory;
    private String RF1_6_OriginatingReferralIdentifier;
    private String RF1_7_EffectiveDate;
    private String RF1_8_ExpirationDate;
    private String RF1_9_ProcessDate;
    private String RF1_10_ReferralReason;
    private String RF1_11_ExternalReferralIdentifier;
    private String RF1_12_ReferralDocumentationCompletionStatus;
    private String RF1_13_PlannedTreatmentStopDate;
    private String RF1_14_ReferralReasonText;
    private String RF1_15_NumberofAuthorizedTreatmentsUnits;
    private String RF1_16_NumberofUsedTreatmentsUnits;
    private String RF1_17_NumberofScheduleTreatmentsUnits;
    private String RF1_18_RemainingBenefitAmount;
    private String RF1_19_AuthorizedProvider;
    private String RF1_20_AuthorizedHealthProfessional;
    private String RF1_21_SourceText;
    private String RF1_22_SourceDate;
    private String RF1_23_SourcePhone;
    private String RF1_24_Comment;
    private String RF1_25_ActionCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

