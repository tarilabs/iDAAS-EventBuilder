package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SHP {
private String SHP_1_ShipmentID;
private String SHP_2_InternalShipmentID;
private String SHP_3_ShipmentStatus;
private String SHP_4_ShipmentStatusDateTime;
private String SHP_5_ShipmentStatusReason;
private String SHP_6_ShipmentPriority;
private String SHP_7_ShipmentConfidentiality;
private String SHP_8_NumberofPackagesinShipment;
private String SHP_9_ShipmentCondition;
private String SHP_10_ShipmentHandlingCode;
private String SHP_11_ShipmentRiskCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

