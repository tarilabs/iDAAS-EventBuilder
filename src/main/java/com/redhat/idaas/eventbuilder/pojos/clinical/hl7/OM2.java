package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OM2 {
    private String OM2_1_SequenceNumberTestObservationMasterFile;
    private String OM2_2_UnitsofMeasure;
    private String OM2_3_RangeofDecimalPrecision;
    private String OM2_4_CorrespondingSIUnitsofMeasure;
    private String OM2_5_SIConversionFactor;
    private String OM2_6_ReferenceNormalRangeforOrdinalandContinuousObservations;
    private String OM2_7_CriticalRangeforOrdinalandContinuousObservations;
    private String OM2_8_AbsoluteRangeforOrdinalandContinuousObservations;
    private String OM2_9_DeltaCheckCriteria;
    private String OM2_10_MinimumMeaningfulIncrements;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

