package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IPC {
private String IPC_1_AccessionIdentifier;
private String IPC_2_RequestedProcedureID;
private String IPC_3_StudyInstanceUID;
private String IPC_4_ScheduledProcedureStepID;
private String IPC_5_Modality;
private String IPC_6_ProtocolCode;
private String IPC_7_ScheduledStationName;
private String IPC_8_ScheduledProcedureStepLocation;
private String IPC_9_ScheduledStationAETitle;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

