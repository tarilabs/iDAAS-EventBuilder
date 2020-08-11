package com.redhat.idaas.events;

import com.redhat.idaas.pojos.clinical.*;
import com.redhat.idaas.pojos.clinical.patientIdentifiers;

public class customerExperienceEvent {

    public messageHeader messageHeader;
    public patientIdentifiers patientIdentifiers;
    public patientVisit patientVisit;
    public pharmacyTreatmentOrder pharmacyTreatmentOrder;
    public location Location;
    public orderControl orderControl;
    public observation observation;
    public observationRequest observationRequest;
    public allergies allergies;
    public diagnosis diagnosis;
    public appointmentInformation appointmentInformation;
    public insurance insurance;

}
