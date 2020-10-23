package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PES {
private String PES_1_SenderOrganizationName;
private String PES_2_SenderIndividualName;
private String PES_3_SenderAddress;
private String PES_4_SenderTelephone;
private String PES_5_SenderEventIdentifier;
private String PES_6_SenderSequenceNumber;
private String PES_7_SenderEventDescription;
private String PES_8_SenderComment;
private String PES_9_SenderAwareDateTime;
private String PES_10_EventReportDate;
private String PES_11_EventReportTimingType;
private String PES_12_EventReportSource;
private String PES_13_EventReportedTo;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

