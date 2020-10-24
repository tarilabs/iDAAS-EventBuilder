package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RGS {
    private String RGS_1_SetIDRGS;
    private String RGS_2_SegmentActionCode;
    private String RGS_3_ResourceGroupID;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

