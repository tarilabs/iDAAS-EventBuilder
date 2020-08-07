package com.redhat.idaas.pojos.platform;


import com.redhat.idaas.pojos.clinical.*;
import com.redhat.idaas.pojos.clinical.patientVisit;

public class hl7SepsisEvent {

    public messageHeader messageHeader;
    public patientIdentifiers patientIdentifiers;
    public patientVisit patientVisit;
    public pharmacyTreatmentOrder pharmacyTreatmentOrder;
    public location Location;
    public orderControl orderControl;
    public observation observation;
    public observationRequest observationRequest;
    public HL7Notes hl7Notes;
}
