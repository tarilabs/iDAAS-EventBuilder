package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSS {
    private String PSS_1_ProviderProductServiceSectionNumber;
    private String PSS_2_PayerProductServiceSectionNumber;
    private String PSS_3_ProductServiceSectionSequenceNumber;
    private String PSS_4_BilledAmount;
    private String PSS_5_SectionDescriptionorHeading;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

