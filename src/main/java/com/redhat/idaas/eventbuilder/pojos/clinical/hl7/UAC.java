package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UAC {
    private String UAC_1_UserAuthenticationCredentialTypeCode;
    private String UAC_2_UserAuthenticationCredential;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

