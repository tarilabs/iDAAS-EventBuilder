package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class STZ {
    private String STZ_1_SterilizationType;
    private String STZ_2_SterilizationCycle;
    private String STZ_3_MaintenanceCycle;
    private String STZ_4_MaintenanceType;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

