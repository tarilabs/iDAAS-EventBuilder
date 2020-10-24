package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class QRI {
    private String QRI_1_CandidateConfidence;
    private String QRI_2_MatchReasonCode;
    private String QRI_3_AlgorithmDescriptor;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

