package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RMI {
    private String RMI_1_RiskManagementIncidentCode;
    private String RMI_2_DateTimeIncident;
    private String RMI_3_IncidentTypeCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

