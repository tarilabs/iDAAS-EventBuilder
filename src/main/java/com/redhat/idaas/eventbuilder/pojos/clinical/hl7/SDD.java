package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SDD {
private String SDD_1_LotNumber;
private String SDD_2_DeviceNumber;
private String SDD_3_DeviceName;
private String SDD_4_DeviceDataState;
private String SDD_5_LoadStatus;
private String SDD_6_ControlCode;
private String SDD_7_OperatorName;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

