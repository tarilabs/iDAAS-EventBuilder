package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSR {
private String CSR_1_SponsorStudyID;
private String CSR_2_AlternateStudyID;
private String CSR_3_InstitutionRegisteringthePatient;
private String CSR_4_SponsorPatientID;
private String CSR_5_AlternatePatientIDCSR;
private String CSR_6_DateTimeofPatientStudyRegistration;
private String CSR_7_PersonPerformingStudyRegistration;
private String CSR_8_StudyAuthorizingProvider;
private String CSR_9_DateTimePatientStudyConsentSigned;
private String CSR_10_PatientStudyEligibilityStatus;
private String CSR_11_StudyRandomizationDatetime;
private String CSR_12_RandomizedStudyArm;
private String CSR_13_StratumforStudyRandomization;
private String CSR_14_PatientEvaluabilityStatus;
private String CSR_15_DateTimeEndedStudy;
private String CSR_16_ReasonEndedStudy;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

