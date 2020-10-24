package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DON {
    private String DON_1_DonationIdentificationNumberDIN;
    private String DON_2_DonationType;
    private String DON_3_PhlebotomyStartDateTime;
    private String DON_4_PhlebotomyEndDateTime;
    private String DON_5_DonationDuration;
    private String DON_6_DonationDurationUnits;
    private String DON_7_IntendedProcedureType;
    private String DON_8_ActualProcedureType;
    private String DON_9_DonorEligibilityFlag;
    private String DON_10_DonorEligibilityProcedureType;
    private String DON_11_DonorEligibilityDate;
    private String DON_12_ProcessInterruption;
    private String DON_13_ProcessInterruptionReason;
    private String DON_14_PhlebotomyIssue;
    private String DON_15_IntendedRecipientBloodRelative;
    private String DON_16_IntendedRecipientName;
    private String DON_17_IntendedRecipientDOB;
    private String DON_18_IntendedRecipientFacility;
    private String DON_19_IntendedRecipientProcedureDate;
    private String DON_20_IntendedRecipientOrderingProvider;
    private String DON_21_PhlebotomyStatus;
    private String DON_22_ArmStick;
    private String DON_23_BleedStartPhlebotomist;
    private String DON_24_BleedEndPhlebotomist;
    private String DON_25_AphaeresisTypeMachine;
    private String DON_26_AphaeresisMachineSerialNumber;
    private String DON_27_DonorReaction;
    private String DON_28_FinalReviewStaffID;
    private String DON_29_FinalReviewDateTime;
    private String DON_30_NumberofTubesCollected;
    private String DON_31_DonationSampleIdentifier;
    private String DON_32_DonationAcceptStaff;
    private String DON_33_DonationMaterialReviewStaff;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

