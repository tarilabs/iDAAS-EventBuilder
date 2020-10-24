package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PCR {
    private String PCR_1_ImplicatedProduct;
    private String PCR_2_GenericProduct;
    private String PCR_3_ProductClass;
    private String PCR_4_TotalDurationOfTherapy;
    private String PCR_5_ProductManufactureDate;
    private String PCR_6_ProductExpirationDate;
    private String PCR_7_ProductImplantationDate;
    private String PCR_8_ProductExplantationDate;
    private String PCR_9_SingleUseDevice;
    private String PCR_10_IndicationForProductUse;
    private String PCR_11_ProductProblem;
    private String PCR_12_ProductSerialLotNumber;
    private String PCR_13_ProductAvailableForInspection;
    private String PCR_14_ProductEvaluationPerformed;
    private String PCR_15_ProductEvaluationStatus;
    private String PCR_16_ProductEvaluationResults;
    private String PCR_17_EvaluatedProductSource;
    private String PCR_18_DateProductReturnedToManufacturer;
    private String PCR_19_DeviceOperatorQualifications;
    private String PCR_20_RelatednessAssessment;
    private String PCR_21_ActionTakenInResponseToTheEvent;
    private String PCR_22_EventCausalityObservations;
    private String PCR_23_IndirectExposureMechanism;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

