package com.redhat.idaas.pojos.platform;

import com.redhat.idaas.pojos.clinical.HL7Allergies;
import com.redhat.idaas.pojos.clinical.HL7AppointmentInformation;
import com.redhat.idaas.pojos.clinical.HL7Diagnosis;
import com.redhat.idaas.pojos.clinical.Hl7Insurance;
import com.redhat.idaas.pojos.clinical.HL7Location;
import com.redhat.idaas.pojos.clinical.Hl7MessageHeader;
import com.redhat.idaas.pojos.clinical.HL7OrderControl;
import com.redhat.idaas.pojos.clinical.HL7Observation;
import com.redhat.idaas.pojos.clinical.HL7ObservationRequest;
import com.redhat.idaas.pojos.clinical.Hl7PatientIdentifiers;
import com.redhat.idaas.pojos.clinical.Hl7PatientVisit;
import com.redhat.idaas.pojos.clinical.HL7PharmacyTreatmentOrder;

public class hl7CustomerExperienceEvent {

    public Hl7MessageHeader hl7MessageHeader;
    public Hl7PatientIdentifiers hl7PatientIdentifiers;
    public Hl7PatientVisit  hl7PatientVisit;
    public HL7PharmacyTreatmentOrder hl7PharmacyTreatmentOrder;
    public HL7Location hl7Location;
    public HL7OrderControl hl7OrderControl;
    public HL7Observation hl7Observation;
    public HL7ObservationRequest hl7ObservationRequest;
    public HL7Allergies hl7Allergies;
    public HL7Diagnosis hl7Diagnosis;
    public HL7AppointmentInformation hl7AppointmentInformation;
    public Hl7Insurance hl7Insurance;

}
