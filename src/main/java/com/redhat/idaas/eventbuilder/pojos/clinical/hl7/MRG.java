package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MRG {
private String MRG_1_PriorPatientIdentifierList;
private String MRG_2_PriorAlternatePatientID;
private String MRG_3_PriorPatientAccountNumber;
private String MRG_4_PriorPatientID;
private String MRG_5_PriorVisitNumber;
private String MRG_6_PriorAlternateVisitID;
private String MRG_7_PriorPatientName;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

