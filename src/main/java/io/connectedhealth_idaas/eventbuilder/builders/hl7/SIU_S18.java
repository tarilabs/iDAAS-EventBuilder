package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SIU_S18 {
public MSH MessageHeader;
public SCH SchedulingActivityInformation;
public TQ1 TimingQuantity;
public NTE NotesandComments;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public OBX ObservationResult;
public DG1 Diagnosis;
public RGS ResourceGroup;
public AIS AppointmentInformation;
public NTE NotesandComments1;
public AIG AppointmentInformationGeneralResource;
public NTE NotesandComments2;
public AIL AppointmentInformationLocationResource;
public NTE NotesandComments3;
public AIP AppointmentInformationPersonnelResource;
public NTE NotesandComments4;

    public MSH getMessageHeader() {
        return MessageHeader;
    }

    public void setMessageHeader(MSH messageHeader) {
        MessageHeader = messageHeader;
    }

    public SCH getSchedulingActivityInformation() {
        return SchedulingActivityInformation;
    }

    public void setSchedulingActivityInformation(SCH schedulingActivityInformation) {
        SchedulingActivityInformation = schedulingActivityInformation;
    }

    public TQ1 getTimingQuantity() {
        return TimingQuantity;
    }

    public void setTimingQuantity(TQ1 timingQuantity) {
        TimingQuantity = timingQuantity;
    }

    public NTE getNotesandComments() {
        return NotesandComments;
    }

    public void setNotesandComments(NTE notesandComments) {
        NotesandComments = notesandComments;
    }

    public PID getPatientIdentification() {
        return PatientIdentification;
    }

    public void setPatientIdentification(PID patientIdentification) {
        PatientIdentification = patientIdentification;
    }

    public PD1 getPatientAdditionalDemographic() {
        return PatientAdditionalDemographic;
    }

    public void setPatientAdditionalDemographic(PD1 patientAdditionalDemographic) {
        PatientAdditionalDemographic = patientAdditionalDemographic;
    }

    public PV1 getPatientVisit() {
        return PatientVisit;
    }

    public void setPatientVisit(PV1 patientVisit) {
        PatientVisit = patientVisit;
    }

    public PV2 getPatientVisitAdditionalInformation() {
        return PatientVisitAdditionalInformation;
    }

    public void setPatientVisitAdditionalInformation(PV2 patientVisitAdditionalInformation) {
        PatientVisitAdditionalInformation = patientVisitAdditionalInformation;
    }

    public OBX getObservationResult() {
        return ObservationResult;
    }

    public void setObservationResult(OBX observationResult) {
        ObservationResult = observationResult;
    }

    public DG1 getDiagnosis() {
        return Diagnosis;
    }

    public void setDiagnosis(DG1 diagnosis) {
        Diagnosis = diagnosis;
    }

    public RGS getResourceGroup() {
        return ResourceGroup;
    }

    public void setResourceGroup(RGS resourceGroup) {
        ResourceGroup = resourceGroup;
    }

    public AIS getAppointmentInformation() {
        return AppointmentInformation;
    }

    public void setAppointmentInformation(AIS appointmentInformation) {
        AppointmentInformation = appointmentInformation;
    }

    public NTE getNotesandComments1() {
        return NotesandComments1;
    }

    public void setNotesandComments1(NTE notesandComments1) {
        NotesandComments1 = notesandComments1;
    }

    public AIG getAppointmentInformationGeneralResource() {
        return AppointmentInformationGeneralResource;
    }

    public void setAppointmentInformationGeneralResource(AIG appointmentInformationGeneralResource) {
        AppointmentInformationGeneralResource = appointmentInformationGeneralResource;
    }

    public NTE getNotesandComments2() {
        return NotesandComments2;
    }

    public void setNotesandComments2(NTE notesandComments2) {
        NotesandComments2 = notesandComments2;
    }

    public AIL getAppointmentInformationLocationResource() {
        return AppointmentInformationLocationResource;
    }

    public void setAppointmentInformationLocationResource(AIL appointmentInformationLocationResource) {
        AppointmentInformationLocationResource = appointmentInformationLocationResource;
    }

    public NTE getNotesandComments3() {
        return NotesandComments3;
    }

    public void setNotesandComments3(NTE notesandComments3) {
        NotesandComments3 = notesandComments3;
    }

    public AIP getAppointmentInformationPersonnelResource() {
        return AppointmentInformationPersonnelResource;
    }

    public void setAppointmentInformationPersonnelResource(AIP appointmentInformationPersonnelResource) {
        AppointmentInformationPersonnelResource = appointmentInformationPersonnelResource;
    }

    public NTE getNotesandComments4() {
        return NotesandComments4;
    }

    public void setNotesandComments4(NTE notesandComments4) {
        NotesandComments4 = notesandComments4;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

