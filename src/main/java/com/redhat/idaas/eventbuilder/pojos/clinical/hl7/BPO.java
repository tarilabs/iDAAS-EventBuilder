package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BPO {
private String BPO_1_SetIDBPO;
private String BPO_2_BPUniversalServiceIdentifier;
private String BPO_3_BPProcessingRequirements;
private String BPO_4_BPQuantity;
private String BPO_5_BPAmount;
private String BPO_6_BPUnits;
private String BPO_7_BPIntendedUseDateTime;
private String BPO_8_BPIntendedDispenseFromLocation;
private String BPO_9_BPIntendedDispenseFromAddress;
private String BPO_10_BPRequestedDispenseDateTime;
private String BPO_11_BPRequestedDispenseToLocation;
private String BPO_12_BPRequestedDispenseToAddress;
private String BPO_13_BPIndicationforUse;
private String BPO_14_BPInformedConsentIndicator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

