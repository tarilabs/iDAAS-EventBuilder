package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NPU {
    private String NPU_1_BedLocation;
    private String NPU_2_BedStatus;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

