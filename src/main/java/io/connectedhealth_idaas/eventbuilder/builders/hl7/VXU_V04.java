package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VXU_V04 {

public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public NK1 NextofKinAssociatedParties;
public ARV AccessRestriction;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public GT1 Guarantor;
public IN1 Insurance;
public IN2 InsuranceAdditionalInformation;
public IN3 InsuranceAdditionalInformationCertification;
public OBX ObservationResult;
public PRT ParticipationInformation;
public NTE NotesandComments;
public ORC CommonOrder;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public RXA PharmacyTreatmentAdministration;
public RXR PharmacyTreatmentRoute;

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

    public GT1 getGuarantor() {
        return Guarantor;
    }

    public void setGuarantor(GT1 guarantor) {
        Guarantor = guarantor;
    }

    public IN1 getInsurance() {
        return Insurance;
    }

    public void setInsurance(IN1 insurance) {
        Insurance = insurance;
    }

    public IN2 getInsuranceAdditionalInformation() {
        return InsuranceAdditionalInformation;
    }

    public void setInsuranceAdditionalInformation(IN2 insuranceAdditionalInformation) {
        InsuranceAdditionalInformation = insuranceAdditionalInformation;
    }

    public IN3 getInsuranceAdditionalInformationCertification() {
        return InsuranceAdditionalInformationCertification;
    }

    public void setInsuranceAdditionalInformationCertification(IN3 insuranceAdditionalInformationCertification) {
        InsuranceAdditionalInformationCertification = insuranceAdditionalInformationCertification;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
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

    public RXA getPharmacyTreatmentAdministration() {
        return PharmacyTreatmentAdministration;
    }

    public void setPharmacyTreatmentAdministration(RXA pharmacyTreatmentAdministration) {
        PharmacyTreatmentAdministration = pharmacyTreatmentAdministration;
    }

    public RXR getPharmacyTreatmentRoute() {
        return PharmacyTreatmentRoute;
    }

    public void setPharmacyTreatmentRoute(RXR pharmacyTreatmentRoute) {
        PharmacyTreatmentRoute = pharmacyTreatmentRoute;
    }

}
