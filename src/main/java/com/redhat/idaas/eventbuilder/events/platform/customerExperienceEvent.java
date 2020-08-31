package com.redhat.idaas.eventbuilder.events.platform;

import com.redhat.idaas.eventbuilder.pojos.clinical.*;
import com.redhat.idaas.eventbuilder.pojos.clinical.*;

public class customerExperienceEvent {

    public messageHeader messageHeader;
    public com.redhat.idaas.eventbuilder.pojos.clinical.patientIdentifiers patientIdentifiers;
    public com.redhat.idaas.eventbuilder.pojos.clinical.patientVisit patientVisit;
    public pharmacyTreatmentOrder pharmacyTreatmentOrder;
    public location Location;
    public com.redhat.idaas.eventbuilder.pojos.clinical.orderControl orderControl;
    public com.redhat.idaas.eventbuilder.pojos.clinical.observation observation;
    public com.redhat.idaas.eventbuilder.pojos.clinical.observationRequest observationRequest;
    public allergies allergies;
    public diagnosis diagnosis;
    public appointmentInformation appointmentInformation;
    public insurance insurance;

}
