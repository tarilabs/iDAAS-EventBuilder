package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LOC {
    private String LOC_1_PrimaryKeyValueLOC;
    private String LOC_2_LocationDescription;
    private String LOC_3_LocationTypeLOC;
    private String LOC_4_OrganizationNameLOC;
    private String LOC_5_LocationAddress;
    private String LOC_6_LocationPhone;
    private String LOC_7_LicenseNumber;
    private String LOC_8_LocationEquipment;
    private String LOC_9_LocationServiceCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

