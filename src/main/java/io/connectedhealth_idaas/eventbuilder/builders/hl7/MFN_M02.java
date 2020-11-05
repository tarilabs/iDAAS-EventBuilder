package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFN_M02 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public MFI MasterFileIdentification;
public MFE MasterFileEntry;
public STF StaffIdentification;
public PRA PractitionerDetail;
public ORG PractitionerOrganizationUnit;
public AFF ProfessionalAffiliation;
public LAN LanguageDetail;
public EDU EducationalDetail;
public CER CertificateDetail;
public NTE NotesandComments;

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

    public STF getStaffIdentification() {
        return StaffIdentification;
    }

    public void setStaffIdentification(STF staffIdentification) {
        StaffIdentification = staffIdentification;
    }

    public PRA getPractitionerDetail() {
        return PractitionerDetail;
    }

    public void setPractitionerDetail(PRA practitionerDetail) {
        PractitionerDetail = practitionerDetail;
    }

    public ORG getPractitionerOrganizationUnit() {
        return PractitionerOrganizationUnit;
    }

    public void setPractitionerOrganizationUnit(ORG practitionerOrganizationUnit) {
        PractitionerOrganizationUnit = practitionerOrganizationUnit;
    }

    public AFF getProfessionalAffiliation() {
        return ProfessionalAffiliation;
    }

    public void setProfessionalAffiliation(AFF professionalAffiliation) {
        ProfessionalAffiliation = professionalAffiliation;
    }

    public LAN getLanguageDetail() {
        return LanguageDetail;
    }

    public void setLanguageDetail(LAN languageDetail) {
        LanguageDetail = languageDetail;
    }

    public EDU getEducationalDetail() {
        return EducationalDetail;
    }

    public void setEducationalDetail(EDU educationalDetail) {
        EducationalDetail = educationalDetail;
    }

    public CER getCertificateDetail() {
        return CertificateDetail;
    }

    public void setCertificateDetail(CER certificateDetail) {
        CertificateDetail = certificateDetail;
    }

    public NTE getNotesandComments() {
        return NotesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        NotesandComments = notesandComments;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

