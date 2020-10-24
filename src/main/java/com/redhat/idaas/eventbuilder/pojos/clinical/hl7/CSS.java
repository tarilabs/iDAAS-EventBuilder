package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSS {
    private String CSS_1_StudyScheduledTimePoint;
    private String CSS_2_StudyScheduledPatientTimePoint;
    private String CSS_3_StudyQualityControlCodes;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

