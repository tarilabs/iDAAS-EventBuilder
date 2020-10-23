package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADJ {
private String ADJ_1_ProviderAdjustmentNumber;
private String ADJ_2_PayerAdjustmentNumber;
private String ADJ_3_AdjustmentSequenceNumber;
private String ADJ_4_AdjustmentCategory;
private String ADJ_5_AdjustmentAmount;
private String ADJ_6_AdjustmentQuantity;
private String ADJ_7_AdjustmentReasonPA;
private String ADJ_8_AdjustmentDescription;
private String ADJ_9_OriginalValue;
private String ADJ_10_SubstituteValue;
private String ADJ_11_AdjustmentAction;
private String ADJ_12_ProviderAdjustmentNumberCrossReference;
private String ADJ_13_ProviderProductServiceLineItemNumberCrossReference;
private String ADJ_14_AdjustmentDate;
private String ADJ_15_ResponsibleOrganization;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

