package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DMI {
private String DMI_1_DiagnosticRelatedGroup;
private String DMI_2_MajorDiagnosticCategory;
private String DMI_3_LowerandUpperTrimPoints;
private String DMI_4_AverageLengthofStay;
private String DMI_5_RelativeWeight;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

