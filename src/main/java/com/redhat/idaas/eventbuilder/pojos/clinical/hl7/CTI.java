package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CTI {
    private String CTI_1_SponsorStudyID;
    private String CTI_2_StudyPhaseIdentifier;
    private String CTI_3_StudyScheduledTimePoint;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

