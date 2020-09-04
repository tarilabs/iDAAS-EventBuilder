package com.redhat.idaas.eventbuilder.events.clinical;


import com.redhat.idaas.eventbuilder.pojos.clinical.Location;
import com.redhat.idaas.eventbuilder.pojos.clinical.MedicalNotes;
import com.redhat.idaas.eventbuilder.pojos.clinical.MessageHeader;
import com.redhat.idaas.eventbuilder.pojos.clinical.PharmacyTreatmentOrder;

public class SepsisEvent {

    private MessageHeader messageHeader;
    private com.redhat.idaas.eventbuilder.pojos.clinical.PatientIdentifiers patientIdentifiers;
    private com.redhat.idaas.eventbuilder.pojos.clinical.PatientVisit patientVisit;
    private PharmacyTreatmentOrder pharmacyTreatmentOrder;
    private Location Location;
    private com.redhat.idaas.eventbuilder.pojos.clinical.OrderControl orderControl;
    private com.redhat.idaas.eventbuilder.pojos.clinical.Observation observation;
    private com.redhat.idaas.eventbuilder.pojos.clinical.ObservationRequest observationRequest;
    private MedicalNotes medicalNotes;
}
