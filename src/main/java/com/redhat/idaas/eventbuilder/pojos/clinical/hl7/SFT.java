package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SFT {
private String SFT_1_SoftwareVendorOrganization;
private String SFT_2_SoftwareCertifiedVersionorReleaseNumber;
private String SFT_3_SoftwareProductName;
private String SFT_4_SoftwareBinaryID;
private String SFT_5_SoftwareProductInformation;
private String SFT_6_SoftwareInstallDate;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

