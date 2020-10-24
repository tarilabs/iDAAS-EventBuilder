package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class QID {
    private String QID_1_QueryTag;
    private String QID_2_MessageQueryName;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

