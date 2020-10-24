package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSH {
    private String PSH_1_ReportType;
    private String PSH_2_ReportFormIdentifier;
    private String PSH_3_ReportDate;
    private String PSH_4_ReportIntervalStartDate;
    private String PSH_5_ReportIntervalEndDate;
    private String PSH_6_QuantityManufactured;
    private String PSH_7_QuantityDistributed;
    private String PSH_8_QuantityDistributedMethod;
    private String PSH_9_QuantityDistributedComment;
    private String PSH_10_QuantityinUse;
    private String PSH_11_QuantityinUseMethod;
    private String PSH_12_QuantityinUseComment;
    private String PSH_13_NumberofProductExperienceReportsFiledbyFacility;
    private String PSH_14_NumberofProductExperienceReportsFiledbyDistributor;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

