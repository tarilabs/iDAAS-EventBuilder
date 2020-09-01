package com.redhat.idaas.eventbuilder.events.platform;

import com.redhat.idaas.eventbuilder.pojos.clinical.Allergies;
import com.redhat.idaas.eventbuilder.pojos.clinical.AppointmentInformation;
import com.redhat.idaas.eventbuilder.pojos.clinical.Diagnosis;
import com.redhat.idaas.eventbuilder.pojos.clinical.Insurance;
import com.redhat.idaas.eventbuilder.pojos.clinical.Location;
import com.redhat.idaas.eventbuilder.pojos.clinical.MessageHeader;
import com.redhat.idaas.eventbuilder.pojos.clinical.PharmacyTreatmentOrder;

public class CustomerExperienceEvent {

    public MessageHeader messageHeader;
    public com.redhat.idaas.eventbuilder.pojos.clinical.PatientIdentifiers patientIdentifiers;
    public com.redhat.idaas.eventbuilder.pojos.clinical.PatientVisit patientVisit;
    public PharmacyTreatmentOrder pharmacyTreatmentOrder;
    public Location Location;
    public com.redhat.idaas.eventbuilder.pojos.clinical.OrderControl orderControl;
    public com.redhat.idaas.eventbuilder.pojos.clinical.Observation observation;
    public com.redhat.idaas.eventbuilder.pojos.clinical.ObservationRequest observationRequest;
    public Allergies allergies;
    public Diagnosis diagnosis;
    public AppointmentInformation appointmentInformation;
    public Insurance insurance;

}
