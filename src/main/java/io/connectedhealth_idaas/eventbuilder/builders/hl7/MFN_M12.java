package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M12 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public OM1 GeneralSegment;
public PRT ParticipationInformation;
public OM7 AdditionalBasicAttributes;
public PRT ParticipationInformation1;

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

    public PRT getParticipationInformation() {
        return ParticipationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        ParticipationInformation = participationInformation;
    }

    public OM7 getAdditionalBasicAttributes() {
        return AdditionalBasicAttributes;
    }

    public void setAdditionalBasicAttributes(OM7 additionalBasicAttributes) {
        AdditionalBasicAttributes = additionalBasicAttributes;
    }

    public PRT getParticipationInformation1() {
        return ParticipationInformation1;
    }

    public void setParticipationInformation1(PRT participationInformation1) {
        ParticipationInformation1 = participationInformation1;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

