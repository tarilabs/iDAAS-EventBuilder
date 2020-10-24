package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VND {
    private String VND_1_SetIdVND;
    private String VND_2_VendorIdentifier;
    private String VND_3_VendorName;
    private String VND_4_VendorCatalogNumber;
    private String VND_5_PrimaryVendorIndicator;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

