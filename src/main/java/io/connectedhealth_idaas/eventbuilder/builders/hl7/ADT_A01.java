package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADT_A01 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public EVN EventType;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public ARV AccessRestriction;
public ROL Role;
public NK1 NextofKinAssociatedParties;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public ARV AccessRestriction1;
public ROL Role1;
public DB1 Disability;
public OBX ObservationResult;
public AL1 PatientAllergyInformation;
public DG1 Diagnosis;
public DRG DiagnosisRelatedGroup;
public PR1 Procedures;
public ROL Role2;
public GT1 Guarantor;
public IN1 Insurance;
public IN2 InsuranceAdditionalInformation;
public IN3 InsuranceAdditionalInformationCertification;
public ROL Role3;
public AUT AuthorizationInformation;
public RF1 ReferralInformation;
public ACC Accident;
public UB2 UniformBillingData;
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

    public NK1 getNextofKinAssociatedParties() {
        return NextofKinAssociatedParties;
    }

    public void setNextofKinAssociatedParties(NK1 nextofKinAssociatedParties) {
        NextofKinAssociatedParties = nextofKinAssociatedParties;
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

    public AL1 getPatientAllergyInformation() {
        return PatientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        PatientAllergyInformation = patientAllergyInformation;
    }

    public DG1 getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(DG1 diagnosis) {
        Diagnosis = diagnosis;
    }

    public DRG getDiagnosisRelatedGroup() {
        return DiagnosisRelatedGroup;
    }

    public void setDiagnosisRelatedGroup(DRG diagnosisRelatedGroup) {
        DiagnosisRelatedGroup = diagnosisRelatedGroup;
    }

    public PR1 getProcedures() {
        return Procedures;
    }

    public void setProcedures(PR1 procedures) {
        Procedures = procedures;
    }

    public ROL getRole2() {
        return Role2;
    }

    public void setRole2(ROL role2) {
        Role2 = role2;
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

    public ROL getRole3() {
        return Role3;
    }

    public void setRole3(ROL role3) {
        Role3 = role3;
    }

    public AUT getAuthorizationInformation() {
        return AuthorizationInformation;
    }

    public void setAuthorizationInformation(AUT authorizationInformation) {
        AuthorizationInformation = authorizationInformation;
    }

    public RF1 getReferralInformation() {
        return ReferralInformation;
    }

    public void setReferralInformation(RF1 referralInformation) {
        ReferralInformation = referralInformation;
    }

    public ACC getAccident() {
        return Accident;
    }

    public void setAccident(ACC accident) {
        Accident = accident;
    }

    public UB2 getUniformBillingData() {
        return UniformBillingData;
    }

    public void setUniformBillingData(UB2 uniformBillingData) {
        UniformBillingData = uniformBillingData;
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

