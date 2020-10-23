package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSG {
private String PSG_1_ProviderProductServiceGroupNumber;
private String PSG_2_PayerProductServiceGroupNumber;
private String PSG_3_ProductServiceGroupSequenceNumber;
private String PSG_4_AdjudicateasGroup;
private String PSG_5_ProductServiceGroupBilledAmount;
private String PSG_6_ProductServiceGroupDescription;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

