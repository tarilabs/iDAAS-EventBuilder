package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RAS_O17 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public NTE NotesandComments;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public PRT ParticipationInformation;
public NTE NotesandComments1;
public ARV AccessRestriction;
public AL1 PatientAllergyInformation;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public PRT ParticipationInformation1;
public ARV AccessRestriction1;
public ORC CommonOrder;
public PRT ParticipationInformation2;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public RXO PharmacyTreatmentOrder;
public NTE NotesandComments2;
public RXR PharmacyTreatmentRoute;
public RXC PharmacyTreatmentComponentOrder;
public NTE NotesandComments3;
public RXE PharmacyTreatmentEncodedOrder;
public PRT ParticipationInformation3;
public NTE NotesandComments4;
public TQ1 TimingQuantity1;
public TQ2 TimingQuantityRelationship1;
public RXR PharmacyTreatmentRoute1;
public RXC PharmacyTreatmentComponentOrder1;
public CDO CumulativeDosage;
public RXA PharmacyTreatmentAdministration;
public PRT ParticipationInformation4;
public RXR PharmacyTreatmentRoute3;
public OBX ObservationResult;
public PRT ParticipationInformation5;
public NTE NotesandComments5;
public CTI ClinicalTrialIdentification;

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

    public NTE getNotesandComments() {
        return NotesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        NotesandComments = notesandComments;
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

    public NTE getNotesandComments1() {
        return NotesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        NotesandComments1 = notesandComments1;
    }

    public ARV getAccessRestriction() {
        return AccessRestriction;
    }

    public void setAccessRestriction(ARV accessRestriction) {
        AccessRestriction = accessRestriction;
    }

    public AL1 getPatientAllergyInformation() {
        return PatientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        PatientAllergyInformation = patientAllergyInformation;
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

    public PRT getParticipationInformation1() {
        return ParticipationInformation1;
    }

    public void setParticipationInformation1(PRT participationInformation1) {
        ParticipationInformation1 = participationInformation1;
    }

    public ARV getAccessRestriction1() {
        return AccessRestriction1;
    }

    public void setAccessRestriction1(ARV accessRestriction1) {
        AccessRestriction1 = accessRestriction1;
    }

    public ORC getCommonOrder() {
        return CommonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        CommonOrder = commonOrder;
    }

    public PRT getParticipationInformation2() {
        return ParticipationInformation2;
    }

    public void setParticipationInformation2(PRT participationInformation2) {
        ParticipationInformation2 = participationInformation2;
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

    public RXO getPharmacyTreatmentOrder() {
        return PharmacyTreatmentOrder;
    }

    public void setPharmacyTreatmentOrder(RXO pharmacyTreatmentOrder) {
        PharmacyTreatmentOrder = pharmacyTreatmentOrder;
    }

    public NTE getNotesandComments2() {
        return NotesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        NotesandComments2 = notesandComments2;
    }

    public RXR getPharmacyTreatmentRoute() {
        return PharmacyTreatmentRoute;
    }

    public void setPharmacyTreatmentRoute(RXR pharmacyTreatmentRoute) {
        PharmacyTreatmentRoute = pharmacyTreatmentRoute;
    }

    public RXC getPharmacyTreatmentComponentOrder() {
        return PharmacyTreatmentComponentOrder;
    }

    public void setPharmacyTreatmentComponentOrder(RXC pharmacyTreatmentComponentOrder) {
        PharmacyTreatmentComponentOrder = pharmacyTreatmentComponentOrder;
    }

    public NTE getNotesandComments3() {
        return NotesandComments3;
    }

    public void setNotesandComments3(NTE notesandComments3) {
        NotesandComments3 = notesandComments3;
    }

    public RXE getPharmacyTreatmentEncodedOrder() {
        return PharmacyTreatmentEncodedOrder;
    }

    public void setPharmacyTreatmentEncodedOrder(RXE pharmacyTreatmentEncodedOrder) {
        PharmacyTreatmentEncodedOrder = pharmacyTreatmentEncodedOrder;
    }

    public PRT getParticipationInformation3() {
        return ParticipationInformation3;
    }

    public void setParticipationInformation3(PRT participationInformation3) {
        ParticipationInformation3 = participationInformation3;
    }

    public NTE getNotesandComments4() {
        return NotesandComments4;
    }

    public void setNotesandComments4(NTE notesandComments4) {
        NotesandComments4 = notesandComments4;
    }

    public TQ1 getTimingQuantity1() {
        return TimingQuantity1;
    }

    public void setTimingQuantity1(TQ1 timingQuantity1) {
        TimingQuantity1 = timingQuantity1;
    }

    public TQ2 getTimingQuantityRelationship1() {
        return TimingQuantityRelationship1;
    }

    public void setTimingQuantityRelationship1(TQ2 timingQuantityRelationship1) {
        TimingQuantityRelationship1 = timingQuantityRelationship1;
    }

    public RXR getPharmacyTreatmentRoute1() {
        return PharmacyTreatmentRoute1;
    }

    public void setPharmacyTreatmentRoute1(RXR pharmacyTreatmentRoute1) {
        PharmacyTreatmentRoute1 = pharmacyTreatmentRoute1;
    }

    public RXC getPharmacyTreatmentComponentOrder1() {
        return PharmacyTreatmentComponentOrder1;
    }

    public void setPharmacyTreatmentComponentOrder1(RXC pharmacyTreatmentComponentOrder1) {
        PharmacyTreatmentComponentOrder1 = pharmacyTreatmentComponentOrder1;
    }

    public CDO getCumulativeDosage() {
        return CumulativeDosage;
    }

    public void setCumulativeDosage(CDO cumulativeDosage) {
        CumulativeDosage = cumulativeDosage;
    }

    public RXA getPharmacyTreatmentAdministration() {
        return PharmacyTreatmentAdministration;
    }

    public void setPharmacyTreatmentAdministration(RXA pharmacyTreatmentAdministration) {
        PharmacyTreatmentAdministration = pharmacyTreatmentAdministration;
    }

    public PRT getParticipationInformation4() {
        return ParticipationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        ParticipationInformation4 = participationInformation4;
    }

    public RXR getPharmacyTreatmentRoute3() {
        return PharmacyTreatmentRoute3;
    }

    public void setPharmacyTreatmentRoute3(RXR pharmacyTreatmentRoute3) {
        PharmacyTreatmentRoute3 = pharmacyTreatmentRoute3;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
    }

    public PRT getParticipationInformation5() {
        return ParticipationInformation5;
    }

    public void setParticipationInformation5(PRT participationInformation5) {
        ParticipationInformation5 = participationInformation5;
    }

    public NTE getNotesandComments5() {
        return NotesandComments5;
    }

    public void setNotesandComments5(NTE notesandComments5) {
        NotesandComments5 = notesandComments5;
    }

    public CTI getClinicalTrialIdentification() {
        return ClinicalTrialIdentification;
    }

    public void setClinicalTrialIdentification(CTI clinicalTrialIdentification) {
        ClinicalTrialIdentification = clinicalTrialIdentification;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

