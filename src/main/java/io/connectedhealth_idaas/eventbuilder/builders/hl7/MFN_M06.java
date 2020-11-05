package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M06 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public CM0 ClinicalStudyMaster;
public CM1 ClinicalStudyPhaseMaster;
public CM2 ClinicalStudyScheduleMaster;

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

    public CM0 getClinicalStudyMaster() {
        return ClinicalStudyMaster;
    }

    public void setClinicalStudyMaster(CM0 clinicalStudyMaster) {
        ClinicalStudyMaster = clinicalStudyMaster;
    }

    public CM1 getClinicalStudyPhaseMaster() {
        return ClinicalStudyPhaseMaster;
    }

    public void setClinicalStudyPhaseMaster(CM1 clinicalStudyPhaseMaster) {
        ClinicalStudyPhaseMaster = clinicalStudyPhaseMaster;
    }

    public CM2 getClinicalStudyScheduleMaster() {
        return ClinicalStudyScheduleMaster;
    }

    public void setClinicalStudyScheduleMaster(CM2 clinicalStudyScheduleMaster) {
        ClinicalStudyScheduleMaster = clinicalStudyScheduleMaster;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

