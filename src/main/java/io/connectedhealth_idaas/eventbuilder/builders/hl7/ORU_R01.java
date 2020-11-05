package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORU_R01 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public PRT ParticipationInformation;
public NTE NotesandComments;
public NK1 NextofKinAssociatedParties;
public ARV AccessRestriction;
public OBX ObservationResult;
public PRT ParticipationInformation1;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public PRT ParticipationInformation2;
public ORC CommonOrder;
public PRT ParticipationInformation3;
public OBX ObservationResult1;
public PRT ParticipationInformation4;
public TXA TranscriptionDocumentHeader;
public OBR ObservationRequest;
public NTE NotesandComments2;
public PRT ParticipationInformation5;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public CTD ContactData;
public OBX ObservationResult2;
public PRT ParticipationInformation6;
public NTE NotesandComments3;
public FT1 FinancialTransaction;
public CTI ClinicalTrialIdentification;
public SPM Specimen;
public OBX ObservationResult3;
public PRT ParticipationInformation7;
public DSC ContinuationPointer;

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

    public PID getPatientIdentification() {
        return PatientIdentification;
    }

    public void setPatientIdentification(PID patientIdentification) {
        PatientIdentification = patientIdentification;
    }

    public PD1 getPatientAdditionalDemographic() {
        return PatientAdditionalDemographic;
    }

    public void setPatientAdditionalDemographic(PD1 patientAdditionalDemographic) {
        PatientAdditionalDemographic = patientAdditionalDemographic;
    }

    public PRT getParticipationInformation() {
        return ParticipationInformation;
    }

    public void setParticipationInformation(PRT participationInformation) {
        ParticipationInformation = participationInformation;
    }

    public NTE getNotesandComments() {
        return NotesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        NotesandComments = notesandComments;
    }

    public NK1 getNextofKinAssociatedParties() {
        return NextofKinAssociatedParties;
    }

    public void setNextofKinAssociatedParties(NK1 nextofKinAssociatedParties) {
        NextofKinAssociatedParties = nextofKinAssociatedParties;
    }

    public ARV getAccessRestriction() {
        return AccessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        AccessRestriction = accessRestriction;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
    }

    public PRT getParticipationInformation1() {
        return ParticipationInformation1;
    }

    public void setParticipationInformation1(PRT participationInformation1) {
        ParticipationInformation1 = participationInformation1;
    }

    public PV1 getPatientVisit() {
        return PatientVisit;
    }

    public void setPatientVisit(PV1 patientVisit) {
        PatientVisit = patientVisit;
    }

    public PV2 getPatientVisitAdditionalInformation() {
        return PatientVisitAdditionalInformation;
    }

    public void setPatientVisitAdditionalInformation(PV2 patientVisitAdditionalInformation) {
        PatientVisitAdditionalInformation = patientVisitAdditionalInformation;
    }

    public PRT getParticipationInformation2() {
        return ParticipationInformation2;
    }

    public void setParticipationInformation2(PRT participationInformation2) {
        ParticipationInformation2 = participationInformation2;
    }

    public ORC getCommonOrder() {
        return CommonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        CommonOrder = commonOrder;
    }

    public PRT getParticipationInformation3() {
        return ParticipationInformation3;
    }

    public void setParticipationInformation3(PRT participationInformation3) {
        ParticipationInformation3 = participationInformation3;
    }

    public OBX getObservationResult1() {
        return ObservationResult1;
    }

    public void setObservationResult1(OBX observationResult1) {
        ObservationResult1 = observationResult1;
    }

    public PRT getParticipationInformation4() {
        return ParticipationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        ParticipationInformation4 = participationInformation4;
    }

    public TXA getTranscriptionDocumentHeader() {
        return TranscriptionDocumentHeader;
    }

    public void setTranscriptionDocumentHeader(TXA transcriptionDocumentHeader) {
        TranscriptionDocumentHeader = transcriptionDocumentHeader;
    }

    public OBR getObservationRequest() {
        return ObservationRequest;
    }

    public void setObservationRequest(OBR observationRequest) {
        ObservationRequest = observationRequest;
    }

    public NTE getNotesandComments2() {
        return NotesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        NotesandComments2 = notesandComments2;
    }

    public PRT getParticipationInformation5() {
        return ParticipationInformation5;
    }

    public void setParticipationInformation5(PRT participationInformation5) {
        ParticipationInformation5 = participationInformation5;
    }

    public TQ1 getTimingQuantity() {
        return TimingQuantity;
    }

    public void setTimingQuantity(TQ1 timingQuantity) {
        TimingQuantity = timingQuantity;
    }

    public TQ2 getTimingQuantityRelationship() {
        return TimingQuantityRelationship;
    }

    public void setTimingQuantityRelationship(TQ2 timingQuantityRelationship) {
        TimingQuantityRelationship = timingQuantityRelationship;
    }

    public CTD getContactData() {
        return ContactData;
    }

    public void setContactData(CTD contactData) {
        ContactData = contactData;
    }

    public OBX getObservationResult2() {
        return ObservationResult2;
    }

    public void setObservationResult2(OBX observationResult2) {
        ObservationResult2 = observationResult2;
    }

    public PRT getParticipationInformation6() {
        return ParticipationInformation6;
    }

    public void setParticipationInformation6(PRT participationInformation6) {
        ParticipationInformation6 = participationInformation6;
    }

    public NTE getNotesandComments3() {
        return NotesandComments3;
    }

    public void setNotesandComments3(NTE notesandComments3) {
        NotesandComments3 = notesandComments3;
    }

    public FT1 getFinancialTransaction() {
        return FinancialTransaction;
    }

    public void setFinancialTransaction(FT1 financialTransaction) {
        FinancialTransaction = financialTransaction;
    }

    public CTI getClinicalTrialIdentification() {
        return ClinicalTrialIdentification;
    }

    public void setClinicalTrialIdentification(CTI clinicalTrialIdentification) {
        ClinicalTrialIdentification = clinicalTrialIdentification;
    }

    public SPM getSpecimen() {
        return Specimen;
    }

    public void setSpecimen(SPM specimen) {
        Specimen = specimen;
    }

    public OBX getObservationResult3() {
        return ObservationResult3;
    }

    public void setObservationResult3(OBX observationResult3) {
        ObservationResult3 = observationResult3;
    }

    public PRT getParticipationInformation7() {
        return ParticipationInformation7;
    }

    public void setParticipationInformation7(PRT participationInformation7) {
        ParticipationInformation7 = participationInformation7;
    }

    public DSC getContinuationPointer() {
        return ContinuationPointer;
    }

    public void setContinuationPointer(DSC continuationPointer) {
        ContinuationPointer = continuationPointer;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

