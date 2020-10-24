package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LRL {
    private String LRL_1_PrimaryKeyValueLRL;
    private String LRL_2_SegmentActionCode;
    private String LRL_3_SegmentUniqueKey;
    private String LRL_4_LocationRelationshipID;
    private String LRL_5_OrganizationalLocationRelationshipValue;
    private String LRL_6_PatientLocationRelationshipValue;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

