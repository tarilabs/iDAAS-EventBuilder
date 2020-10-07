package com.redhat.idaas.eventbuilder.events.platform;

import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.*;
import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.AppointmentInformation;
import com.redhat.idaas.eventbuilder.pojos.clinical.Location;
import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.MessageHeader;
import com.redhat.idaas.eventbuilder.pojos.clinical.legacy.PharmacyTreatmentOrder;

public class CustomerExperienceEvent {

    public MessageHeader messageHeader;
    public PatientIdentifiers patientIdentifiers;
    public PatientVisit patientVisit;
    public PharmacyTreatmentOrder pharmacyTreatmentOrder;
    public Location Location;
    public OrderControl orderControl;
    public Observation observation;
    public ObservationRequest observationRequest;
    public Allergies allergies;
    public Diagnosis diagnosis;
    public AppointmentInformation appointmentInformation;
    public Insurance insurance;

}
