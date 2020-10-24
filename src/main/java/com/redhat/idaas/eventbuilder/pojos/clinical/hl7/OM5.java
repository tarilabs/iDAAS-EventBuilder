package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OM5 {
    private String OM5_1_SequenceNumberTestObservationMasterFile;
    private String OM5_2_TestObservationsIncludedWithinanOrderedTestBattery;
    private String OM5_3_ObservationIDSuffixes;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

