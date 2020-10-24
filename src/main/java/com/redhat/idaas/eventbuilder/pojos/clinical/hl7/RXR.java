package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXR {
    private String RXR_1_Route;
    private String RXR_2_AdministrationSite;
    private String RXR_3_AdministrationDevice;
    private String RXR_4_AdministrationMethod;
    private String RXR_5_RoutingInstruction;
    private String RXR_6_AdministrationSiteModifier;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

