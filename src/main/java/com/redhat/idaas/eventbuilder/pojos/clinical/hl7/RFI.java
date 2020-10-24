package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RFI {
    private String RFI_1_RequestDate;
    private String RFI_2_ResponseDueDate;
    private String RFI_3_PatientConsent;
    private String RFI_4_DateAdditionalInformationWasSubmitted;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

