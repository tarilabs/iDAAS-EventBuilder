package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXO {
    private String RXO_1_RequestedGiveCode;
    private String RXO_2_RequestedGiveAmountMinimum;
    private String RXO_3_RequestedGiveAmountMaximum;
    private String RXO_4_RequestedGiveUnits;
    private String RXO_5_RequestedDosageForm;
    private String RXO_6_ProvidersPharmacyTreatmentInstructions;
    private String RXO_7_ProvidersAdministrationInstructions;
    private String RXO_8_AllowSubstitutions;
    private String RXO_9_RequestedDispenseCode;
    private String RXO_10_RequestedDispenseAmount;
    private String RXO_11_RequestedDispenseUnits;
    private String RXO_12_NumberOfRefills;
    private String RXO_13_OrderingProvidersDEANumber;
    private String RXO_14_PharmacistTreatmentSuppliersVerifierID;
    private String RXO_15_NeedsHumanReview;
    private String RXO_16_RequestedGivePerTimeUnit;
    private String RXO_17_RequestedGiveStrength;
    private String RXO_18_RequestedGiveStrengthUnits;
    private String RXO_19_Indication;
    private String RXO_20_RequestedGiveRateAmount;
    private String RXO_21_RequestedGiveRateUnits;
    private String RXO_22_TotalDailyDose;
    private String RXO_23_SupplementaryCode;
    private String RXO_24_RequestedDrugStrengthVolume;
    private String RXO_25_RequestedDrugStrengthVolumeUnits;
    private String RXO_26_PharmacyOrderType;
    private String RXO_27_DispensingInterval;
    private String RXO_28_MedicationInstanceIdentifier;
    private String RXO_29_SegmentInstanceIdentifier;
    private String RXO_30_MoodCode;
    private String RXO_31_DispensingPharmacy;
    private String RXO_32_DispensingPharmacyAddress;
    private String RXO_33_DelivertoPatientLocation;
    private String RXO_34_DelivertoAddress;
    private String RXO_35_PharmacyPhoneNumber;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

