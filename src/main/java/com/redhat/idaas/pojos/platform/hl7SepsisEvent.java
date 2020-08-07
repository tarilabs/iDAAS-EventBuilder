package com.redhat.idaas.pojos.platform;


import com.redhat.idaas.pojos.clinical.HL7Location;
import com.redhat.idaas.pojos.clinical.Hl7MessageHeader;
import com.redhat.idaas.pojos.clinical.HL7Notes;
import com.redhat.idaas.pojos.clinical.HL7OrderControl;
import com.redhat.idaas.pojos.clinical.HL7Observation;
import com.redhat.idaas.pojos.clinical.HL7ObservationRequest;
import com.redhat.idaas.pojos.clinical.Hl7PatientIdentifiers;
import com.redhat.idaas.pojos.clinical.Hl7PatientVisit;
import com.redhat.idaas.pojos.clinical.HL7PharmacyTreatmentOrder;

public class hl7SepsisEvent {

    public Hl7MessageHeader hl7MessageHeader;
    public Hl7PatientIdentifiers hl7PatientIdentifiers;
    public Hl7PatientVisit  hl7PatientVisit;
    public HL7PharmacyTreatmentOrder hl7PharmacyTreatmentOrder;
    public HL7Location hl7Location;
    public HL7OrderControl hl7OrderControl;
    public HL7Observation hl7Observation;
    public HL7ObservationRequest hl7ObservationRequest;
    public HL7Notes hl7Notes;
}
