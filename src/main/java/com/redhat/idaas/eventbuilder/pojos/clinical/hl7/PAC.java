package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PAC {
private String PAC_1_SetIdPAC;
private String PAC_2_PackageID;
private String PAC_3_ParentPackageID;
private String PAC_4_PositioninParentPackage;
private String PAC_5_PackageType;
private String PAC_6_PackageCondition;
private String PAC_7_PackageHandlingCode;
private String PAC_8_PackageRiskCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

