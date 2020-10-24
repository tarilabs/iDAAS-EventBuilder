package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SID {
    private String SID_1_ApplicationMethodIdentifier;
    private String SID_2_SubstanceLotNumber;
    private String SID_3_SubstanceContainerIdentifier;
    private String SID_4_SubstanceManufacturerIdentifier;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

