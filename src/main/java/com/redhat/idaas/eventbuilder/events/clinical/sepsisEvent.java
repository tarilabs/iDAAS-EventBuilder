package com.redhat.idaas.eventbuilder.events.clinical;


import com.redhat.idaas.eventbuilder.pojos.clinical.*;
import com.redhat.idaas.pojos.clinical.*;
//import com.redhat.idaas.pojos.clinical.patientVisit;

public class sepsisEvent {

    private messageHeader messageHeader;
    private com.redhat.idaas.eventbuilder.pojos.clinical.patientIdentifiers patientIdentifiers;
    private com.redhat.idaas.eventbuilder.pojos.clinical.patientVisit patientVisit;
    private pharmacyTreatmentOrder pharmacyTreatmentOrder;
    private location Location;
    private com.redhat.idaas.eventbuilder.pojos.clinical.orderControl orderControl;
    private com.redhat.idaas.eventbuilder.pojos.clinical.observation observation;
    private com.redhat.idaas.eventbuilder.pojos.clinical.observationRequest observationRequest;
    private medicalNotes medicalNotes;
}
