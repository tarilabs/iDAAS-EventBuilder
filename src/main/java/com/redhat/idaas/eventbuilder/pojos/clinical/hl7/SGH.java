package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SGH {
    private String SGH_1_SetIDSGH;
    private String SGH_2_SegmentGroupName;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

