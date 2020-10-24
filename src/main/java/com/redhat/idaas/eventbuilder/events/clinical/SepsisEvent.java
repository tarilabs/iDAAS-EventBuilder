package com.redhat.idaas.eventbuilder.events.clinical;


import com.redhat.idaas.eventbuilder.pojos.clinical.fhir.Location;
import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.MedicalNotes;
import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.*;
import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.PharmacyTreatmentOrder;

public class SepsisEvent {

    private MessageHeader messageHeader;
    private PatientIdentifiers patientIdentifiers;
    private PatientVisit patientVisit;
    private PharmacyTreatmentOrder pharmacyTreatmentOrder;
    private Location Location;
    private OrderControl orderControl;
    private Observation observation;
    private ObservationRequest observationRequest;
    private MedicalNotes medicalNotes;
}
