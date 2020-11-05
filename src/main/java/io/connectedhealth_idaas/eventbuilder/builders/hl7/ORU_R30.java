package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORU_R30 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public PRT ParticipationInformation;
public ARV AccessRestriction;
public OBX ObservationResult;
public PRT ParticipationInformation1;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public PRT ParticipationInformation2;
public ORC CommonOrder;
public PRT ParticipationInformation3;
public OBR ObservationRequest;
public NTE NotesandComments;
public PRT ParticipationInformation4;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public OBX ObservationResult1;
public PRT ParticipationInformation5;
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

    public PRT getParticipationInformation4() {
        return ParticipationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        ParticipationInformation4 = participationInformation4;
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

    public OBX getObservationResult1() {
        return ObservationResult1;
    }

    public void setObservationResult1(OBX observationResult1) {
        ObservationResult1 = observationResult1;
    }

    public PRT getParticipationInformation5() {
        return ParticipationInformation5;
    }

    public void setParticipationInformation5(PRT participationInformation5) {
        ParticipationInformation5 = participationInformation5;
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

