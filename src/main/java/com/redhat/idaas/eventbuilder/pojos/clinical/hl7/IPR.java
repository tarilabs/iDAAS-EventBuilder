package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IPR {
    private String IPR_1_IPRIdentifier;
    private String IPR_2_ProviderCrossReferenceIdentifier;
    private String IPR_3_PayerCrossReferenceIdentifier;
    private String IPR_4_IPRStatus;
    private String IPR_5_IPRDateTime;
    private String IPR_6_AdjudicatedPaidAmount;
    private String IPR_7_ExpectedPaymentDateTime;
    private String IPR_8_IPRChecksum;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

