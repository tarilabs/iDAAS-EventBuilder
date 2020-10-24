package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRT {
    private String PRT_1_ParticipationInstanceID;
    private String PRT_2_ActionCode;
    private String PRT_3_ActionReason;
    private String PRT_4_Participation;
    private String PRT_5_ParticipationPerson;
    private String PRT_6_ParticipationPersonProviderType;
    private String PRT_7_ParticipantOrganizationUnitType;
    private String PRT_8_ParticipationOrganization;
    private String PRT_9_ParticipantLocation;
    private String PRT_10_ParticipationDevice;
    private String PRT_11_ParticipationBeginDateTimearrivaltime;
    private String PRT_12_ParticipationEndDateTimedeparturetime;
    private String PRT_13_ParticipationQualitativeDuration;
    private String PRT_14_ParticipationAddress;
    private String PRT_15_ParticipantTelecommunicationAddress;
    private String PRT_16_ParticipantDeviceIdentifier;
    private String PRT_17_ParticipantDeviceManufactureDate;
    private String PRT_18_ParticipantDeviceExpiryDate;
    private String PRT_19_ParticipantDeviceLotNumber;
    private String PRT_20_ParticipantDeviceSerialNumber;
    private String PRT_21_ParticipantDeviceDonationIdentification;
    private String PRT_22_ParticipationDeviceType;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

