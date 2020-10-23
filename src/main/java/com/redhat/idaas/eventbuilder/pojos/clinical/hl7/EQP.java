package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EQP {
private String EQP_1_Eventtype;
private String EQP_2_FileName;
private String EQP_3_StartDateTime;
private String EQP_4_EndDateTime;
private String EQP_5_TransactionData;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

