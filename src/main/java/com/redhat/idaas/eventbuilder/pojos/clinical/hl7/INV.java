package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class INV {
private String INV_1_SubstanceIdentifier;
private String INV_2_SubstanceStatus;
private String INV_3_SubstanceType;
private String INV_4_InventoryContainerIdentifier;
private String INV_5_ContainerCarrierIdentifier;
private String INV_6_PositiononCarrier;
private String INV_7_InitialQuantity;
private String INV_8_CurrentQuantity;
private String INV_9_AvailableQuantity;
private String INV_10_ConsumptionQuantity;
private String INV_11_QuantityUnits;
private String INV_12_ExpirationDateTime;
private String INV_13_FirstUsedDateTime;
private String INV_14_OnBoardStabilityDuration;
private String INV_15_TestFluidIdentifiers;
private String INV_16_ManufacturerLotNumber;
private String INV_17_ManufacturerIdentifier;
private String INV_18_SupplierIdentifier;
private String INV_19_OnBoardStabilityTime;
private String INV_20_TargetValue;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

