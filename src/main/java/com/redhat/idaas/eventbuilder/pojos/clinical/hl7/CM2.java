package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CM2 {
    private String CM2_1_SetIDCM2;
    private String CM2_2_ScheduledTimePoint;
    private String CM2_3_DescriptionofTimePoint;
    private String CM2_4_EventsScheduledThisTimePoint;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

