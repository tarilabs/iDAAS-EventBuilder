package com.redhat.idaas.events;


import com.redhat.idaas.pojos.clinical.*;
//import com.redhat.idaas.pojos.clinical.patientVisit;

public class sepsisEvent {

    private messageHeader messageHeader;
    private patientIdentifiers patientIdentifiers;
    private patientVisit patientVisit;
    private pharmacyTreatmentOrder pharmacyTreatmentOrder;
    private location Location;
    private orderControl orderControl;
    private observation observation;
    private observationRequest observationRequest;
    private medicalNotes medicalNotes;
}
