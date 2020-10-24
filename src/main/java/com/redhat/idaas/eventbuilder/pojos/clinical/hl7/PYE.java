package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PYE {
    private String PYE_1_SetIDPYE;
    private String PYE_2_PayeeType;
    private String PYE_3_PayeeRelationshiptoInvoicePatient;
    private String PYE_4_PayeeIdentificationList;
    private String PYE_5_PayeePersonName;
    private String PYE_6_PayeeAddress;
    private String PYE_7_PaymentMethod;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

