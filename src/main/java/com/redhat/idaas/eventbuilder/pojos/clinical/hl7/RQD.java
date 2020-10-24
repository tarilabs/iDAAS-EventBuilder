package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RQD {
    private String RQD_1_RequisitionLineNumber;
    private String RQD_2_ItemCodeInternal;
    private String RQD_3_ItemCodeExternal;
    private String RQD_4_HospitalItemCode;
    private String RQD_5_RequisitionQuantity;
    private String RQD_6_RequisitionUnitofMeasure;
    private String RQD_7_CostCenterAccountNumber;
    private String RQD_8_ItemNaturalAccountCode;
    private String RQD_9_DeliverToID;
    private String RQD_10_DateNeeded;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

