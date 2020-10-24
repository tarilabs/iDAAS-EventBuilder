package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GP1 {
    private String GP1_1_TypeofBillCode;
    private String GP1_2_RevenueCode;
    private String GP1_3_OverallClaimDispositionCode;
    private String GP1_4_OCEEditsperVisitCode;
    private String GP1_5_OutlierCost;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

