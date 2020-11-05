package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MDM_T04 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public EVN EventType;
public PID PatientIdentification;
public PV1 PatientVisit;
public ORC CommonOrder;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public OBR ObservationRequest;
public NTE NotesandComments;
public TXA TranscriptionDocumentHeader;
public CON ConsentSegment;
public OBX ObservationResult;
public NTE NotesandComments1;

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

    public EVN getEventType() {
        return EventType;
    }

    public void setEventType(EVN eventType) {
        EventType = eventType;
    }

    public PID getPatientIdentification() {
        return PatientIdentification;
    }

    public void setPatientIdentification(PID patientIdentification) {
        PatientIdentification = patientIdentification;
    }

    public PV1 getPatientVisit() {
        return PatientVisit;
    }

    public void setPatientVisit(PV1 patientVisit) {
        PatientVisit = patientVisit;
    }

    public ORC getCommonOrder() {
        return CommonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        CommonOrder = commonOrder;
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

    public OBR getObservationRequest() {
        return ObservationRequest;
    }

    public void setObservationRequest(OBR observationRequest) {
        ObservationRequest = observationRequest;
    }

    public NTE getNotesandComments() {
        return NotesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        NotesandComments = notesandComments;
    }

    public TXA getTranscriptionDocumentHeader() {
        return TranscriptionDocumentHeader;
    }

    public void setTranscriptionDocumentHeader(TXA transcriptionDocumentHeader) {
        TranscriptionDocumentHeader = transcriptionDocumentHeader;
    }

    public CON getConsentSegment() {
        return ConsentSegment;
    }

    public void setConsentSegment(CON consentSegment) {
        ConsentSegment = consentSegment;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
    }

    public NTE getNotesandComments1() {
        return NotesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        NotesandComments1 = notesandComments1;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

