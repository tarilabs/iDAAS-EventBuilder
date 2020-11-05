package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M10 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public OM1 GeneralSegment;
public OMC SupportingClinicalInformation;
public PRT ParticipationInformation;
public OM5 ObservationBatteriesSets;
public OM4 ObservationsthatRequireSpecimens;

    public MSH getMessageHeader() {
        return MessageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        MessageHeader = messageHeader;
    }

    public SFT getSoftwareSegment() {
        return SoftwareSegment;
    }

    public void setSoftwareSegment(SFT softwareSegment) {
        SoftwareSegment = softwareSegment;
    }

    public UAC getUserAuthenticationCredentialSegment() {
        return UserAuthenticationCredentialSegment;
    }

    public void setUserAuthenticationCredentialSegment(UAC userAuthenticationCredentialSegment) {
        UserAuthenticationCredentialSegment = userAuthenticationCredentialSegment;
    }

    public MFI getMasterFileIdentification() {
        return MasterFileIdentification;
    }

    public void setMasterFileIdentification(MFI masterFileIdentification) {
        MasterFileIdentification = masterFileIdentification;
    }

    public MFE getMasterFileEntry() {
        return MasterFileEntry;
    }

    public void setMasterFileEntry(MFE masterFileEntry) {
        MasterFileEntry = masterFileEntry;
    }

    public OM1 getGeneralSegment() {
        return GeneralSegment;
    }

    public void setGeneralSegment(OM1 generalSegment) {
        GeneralSegment = generalSegment;
    }

    public OMC getSupportingClinicalInformation() {
        return SupportingClinicalInformation;
    }

    public void setSupportingClinicalInformation(OMC supportingClinicalInformation) {
        SupportingClinicalInformation = supportingClinicalInformation;
    }

    public PRT getParticipationInformation() {
        return ParticipationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        ParticipationInformation = participationInformation;
    }

    public OM5 getObservationBatteriesSets() {
        return ObservationBatteriesSets;
    }

    public void setObservationBatteriesSets(OM5 observationBatteriesSets) {
        ObservationBatteriesSets = observationBatteriesSets;
    }

    public OM4 getObservationsthatRequireSpecimens() {
        return ObservationsthatRequireSpecimens;
    }

    public void setObservationsthatRequireSpecimens(OM4 observationsthatRequireSpecimens) {
        ObservationsthatRequireSpecimens = observationsthatRequireSpecimens;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

