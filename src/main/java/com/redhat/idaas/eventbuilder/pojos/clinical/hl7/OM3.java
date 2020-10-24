package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OM3 {
    private String OM3_1_SequenceNumberTestObservationMasterFile;
    private String OM3_2_PreferredCodingSystem;
    private String OM3_3_ValidCodedAnswers;
    private String OM3_4_NormalTextCodesforCategoricalObservations;
    private String OM3_5_AbnormalTextCodesforCategoricalObservations;
    private String OM3_6_CriticalTextCodesforCategoricalObservations;
    private String OM3_7_ValueType;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

