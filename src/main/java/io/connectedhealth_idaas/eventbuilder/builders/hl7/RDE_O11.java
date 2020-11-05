package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDE_O11 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public NTE NotesandComments;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public PRT ParticipationInformation;
public NTE NotesandComments1;
public ARV AccessRestriction;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public PRT ParticipationInformation1;
public ARV AccessRestriction1;
public IN1 Insurance;
public IN2 InsuranceAdditionalInformation;
public IN3 InsuranceAdditionalInformationCertification;
public GT1 Guarantor;
public AL1 PatientAllergyInformation;
public ORC CommonOrder;
public PRT ParticipationInformation2;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public RXO PharmacyTreatmentOrder;
public PRT ParticipationInformation3;
public NTE NotesandComments2;
public RXR PharmacyTreatmentRoute;
public RXC PharmacyTreatmentComponentOrder;
public NTE NotesandComments3;
public RXE PharmacyTreatmentEncodedOrder;
public PRT ParticipationInformation4;
public NTE NotesandComments4;
public TQ1 TimingQuantity1;
public TQ2 TimingQuantityRelationship1;
public RXV PharmacyTreatmentInfusion;
public PRT ParticipationInformation5;
public NTE NotesandComments5;
public TQ1 TimingQuantity2;
public TQ2 TimingQuantityRelationship2;
public RXR PharmacyTreatmentRoute2;
public RXC PharmacyTreatmentComponentOrder2;
public CDO CumulativeDosage;
public OBX ObservationResult;
public PRT ParticipationInformation6;
public NTE NotesandComments6;
public FT1 FinancialTransaction;
public BLG Billing;
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

    public PRT getParticipationInformation3() {
        return ParticipationInformation3;
    }

    public void setParticipationInformation3(PRT participationInformation3) {
        ParticipationInformation3 = participationInformation3;
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

    public PRT getParticipationInformation4() {
        return ParticipationInformation4;
    }

    public void setParticipationInformation4(PRT participationInformation4) {
        ParticipationInformation4 = participationInformation4;
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

    public RXV getPharmacyTreatmentInfusion() {
        return PharmacyTreatmentInfusion;
    }

    public void setPharmacyTreatmentInfusion(RXV pharmacyTreatmentInfusion) {
        PharmacyTreatmentInfusion = pharmacyTreatmentInfusion;
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

    public TQ1 getTimingQuantity2() {
        return TimingQuantity2;
    }

    public void setTimingQuantity2(TQ1 timingQuantity2) {
        TimingQuantity2 = timingQuantity2;
    }

    public TQ2 getTimingQuantityRelationship2() {
        return TimingQuantityRelationship2;
    }

    public void setTimingQuantityRelationship2(TQ2 timingQuantityRelationship2) {
        TimingQuantityRelationship2 = timingQuantityRelationship2;
    }

    public RXR getPharmacyTreatmentRoute2() {
        return PharmacyTreatmentRoute2;
    }

    public void setPharmacyTreatmentRoute2(RXR pharmacyTreatmentRoute2) {
        PharmacyTreatmentRoute2 = pharmacyTreatmentRoute2;
    }

    public RXC getPharmacyTreatmentComponentOrder2() {
        return PharmacyTreatmentComponentOrder2;
    }

    public void setPharmacyTreatmentComponentOrder2(RXC pharmacyTreatmentComponentOrder2) {
        PharmacyTreatmentComponentOrder2 = pharmacyTreatmentComponentOrder2;
    }

    public CDO getCumulativeDosage() {
        return CumulativeDosage;
    }

    public void setCumulativeDosage(CDO cumulativeDosage) {
        CumulativeDosage = cumulativeDosage;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
    }

    public PRT getParticipationInformation6() {
        return ParticipationInformation6;
    }

    public void setParticipationInformation6(PRT participationInformation6) {
        ParticipationInformation6 = participationInformation6;
    }

    public NTE getNotesandComments6() {
        return NotesandComments6;
    }

    public void setNotesandComments6(NTE notesandComments6) {
        NotesandComments6 = notesandComments6;
    }

    public FT1 getFinancialTransaction() {
        return FinancialTransaction;
    }

    public void setFinancialTransaction(FT1 financialTransaction) {
        FinancialTransaction = financialTransaction;
    }

    public BLG getBilling() {
        return Billing;
    }

    public void setBilling(BLG billing) {
        Billing = billing;
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

