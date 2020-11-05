package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADT_A02 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public EVN EventType;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public ARV AccessRestriction;
public ROL Role;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public ARV AccessRestriction1;
public ROL Role1;
public DB1 Disability;
public OBX ObservationResult;
public PDA PatientDeathandAutopsy;

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

    public PD1 getPatientAdditionalDemographic() {
        return PatientAdditionalDemographic;
    }

    public void setPatientAdditionalDemographic(PD1 patientAdditionalDemographic) {
        PatientAdditionalDemographic = patientAdditionalDemographic;
    }

    public ARV getAccessRestriction() {
        return AccessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        AccessRestriction = accessRestriction;
    }

    public ROL getRole() {
        return Role;
    }

    public void setRole(ROL role) {
        Role = role;
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

    public ARV getAccessRestriction1() {
        return AccessRestriction1;
    }

    public void setAccessRestriction1(ARV accessRestriction1) {
        AccessRestriction1 = accessRestriction1;
    }

    public ROL getRole1() {
        return Role1;
    }

    public void setRole1(ROL role1) {
        Role1 = role1;
    }

    public DB1 getDisability() {
        return Disability;
    }

    public void setDisability(DB1 disability) {
        Disability = disability;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
    }

    public PDA getPatientDeathandAutopsy() {
        return PatientDeathandAutopsy;
    }

    public void setPatientDeathandAutopsy(PDA patientDeathandAutopsy) {
        PatientDeathandAutopsy = patientDeathandAutopsy;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

