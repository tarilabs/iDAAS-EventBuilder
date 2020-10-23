package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FHS {
private String FHS_1_FileFieldSeparator;
private String FHS_2_FileEncodingCharacters;
private String FHS_3_FileSendingApplication;
private String FHS_4_FileSendingFacility;
private String FHS_5_FileReceivingApplication;
private String FHS_6_FileReceivingFacility;
private String FHS_7_FileCreationDateTime;
private String FHS_8_FileSecurity;
private String FHS_9_FileNameID;
private String FHS_10_FileHeaderComment;
private String FHS_11_FileControlID;
private String FHS_12_ReferenceFileControlID;
private String FHS_13_FileSendingNetworkAddress;
private String FHS_14_FileReceivingNetworkAddress;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

