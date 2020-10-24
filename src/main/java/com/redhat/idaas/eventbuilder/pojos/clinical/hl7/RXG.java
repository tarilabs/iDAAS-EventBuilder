package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXG {
    private String RXG_1_GiveSubIDCounter;
    private String RXG_2_DispenseSubIDCounter;
    private String RXG_3_QuantityTiming;
    private String RXG_4_GiveCode;
    private String RXG_5_GiveAmountMinimum;
    private String RXG_6_GiveAmountMaximum;
    private String RXG_7_GiveUnits;
    private String RXG_8_GiveDosageForm;
    private String RXG_9_AdministrationNotes;
    private String RXG_10_SubstitutionStatus;
    private String RXG_11_DispensetoLocation;
    private String RXG_12_NeedsHumanReview;
    private String RXG_13_SpecialAdministrationInstructions;
    private String RXG_14_GivePerTimeUnit;
    private String RXG_15_GiveRateAmount;
    private String RXG_16_GiveRateUnits;
    private String RXG_17_GiveStrength;
    private String RXG_18_GiveStrengthUnits;
    private String RXG_19_SubstanceLotNumber;
    private String RXG_20_SubstanceExpirationDate;
    private String RXG_21_SubstanceManufacturerName;
    private String RXG_22_Indication;
    private String RXG_23_GiveDrugStrengthVolume;
    private String RXG_24_GiveDrugStrengthVolumeUnits;
    private String RXG_25_GiveBarcodeIdentifier;
    private String RXG_26_PharmacyOrderType;
    private String RXG_27_DispensetoPharmacy;
    private String RXG_28_DispensetoPharmacyAddress;
    private String RXG_29_DelivertoPatientLocation;
    private String RXG_30_DelivertoAddress;
    private String RXG_31_GiveTagIdentifier;
    private String RXG_32_DispenseAmount;
    private String RXG_33_DispenseUnits;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

