package io.connectedhealth_idaas.eventbuilder.builders.hl7;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7.*;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VXU_V04 {
public MSH MessageHeader;
public SFT SoftwareSegment;
public UAC UserAuthenticationCredentialSegment;
public PID PatientIdentification;
public PD1 PatientAdditionalDemographic;
public NK1 NextofKinAssociatedParties;
public ARV AccessRestriction;
public PV1 PatientVisit;
public PV2 PatientVisitAdditionalInformation;
public GT1 Guarantor;
public IN1 Insurance;
public IN2 InsuranceAdditionalInformation;
public IN3 InsuranceAdditionalInformationCertification;
public OBX ObservationResult;
public PRT ParticipationInformation;
public NTE NotesandComments;
public ORC CommonOrder;
public TQ1 TimingQuantity;
public TQ2 TimingQuantityRelationship;
public RXA PharmacyTreatmentAdministration;
public RXR PharmacyTreatmentRoute;

}


