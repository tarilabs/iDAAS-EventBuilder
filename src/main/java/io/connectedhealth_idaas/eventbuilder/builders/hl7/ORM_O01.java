package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ORM_O01 {
    public MSH MessageHeader;
    public NTE NotesandComments;
    public PID PatientIdentification;
    public PD1 PatientAdditionalDemographic;
    public NTE NotesandComments1;
    public PV1 PatientVisit;
    public PV2 PatientVisitAdditionalInformation;
    public IN1 Insurance;
    public IN2 InsuranceAdditionalInformation;
    public IN3 InsuranceAdditionalInformationCertification;
    public GT1 Guarantor;
    public AL1 PatientAllergyInformation;
    public ORC CommonOrder;
    public CTI ClinicalTrialIdentification;
    public BLG Billing;

    public MSH getMessageHeader() {
        return MessageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        MessageHeader = messageHeader;
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

    public NTE getNotesandComments1() {
        return NotesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        NotesandComments1 = notesandComments1;
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

    public GT1 getGuarantor() {
        return Guarantor;
    }

    public void setGuarantor(GT1 guarantor) {
        Guarantor = guarantor;
    }

    public AL1 getPatientAllergyInformation() {
        return PatientAllergyInformation;
    }

    public void setPatientAllergyInformation(AL1 patientAllergyInformation) {
        PatientAllergyInformation = patientAllergyInformation;
    }

    public ORC getCommonOrder() {
        return CommonOrder;
    }

    public void setCommonOrder(ORC commonOrder) {
        CommonOrder = commonOrder;
    }

    public CTI getClinicalTrialIdentification() {
        return ClinicalTrialIdentification;
    }

    public void setClinicalTrialIdentification(CTI clinicalTrialIdentification) {
        ClinicalTrialIdentification = clinicalTrialIdentification;
    }

    public BLG getBilling() {
        return Billing;
    }

    public void setBilling(BLG billing) {
        Billing = billing;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

}
