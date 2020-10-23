package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TCD {
private String TCD_1_UniversalServiceIdentifier;
private String TCD_2_AutoDilutionFactor;
private String TCD_3_RerunDilutionFactor;
private String TCD_4_PreDilutionFactor;
private String TCD_5_EndogenousContentofPreDilutionDiluent;
private String TCD_6_AutomaticRepeatAllowed;
private String TCD_7_ReflexAllowed;
private String TCD_8_AnalyteRepeatStatus;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

