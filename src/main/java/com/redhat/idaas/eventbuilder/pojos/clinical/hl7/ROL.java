package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ROL {
    private String ROL_1_RoleInstanceID;
    private String ROL_2_ActionCode;
    private String ROL_3_RoleROL;
    private String ROL_4_RolePerson;
    private String ROL_5_RoleBeginDateTime;
    private String ROL_6_RoleEndDateTime;
    private String ROL_7_RoleDuration;
    private String ROL_8_RoleActionReason;
    private String ROL_9_ProviderType;
    private String ROL_10_OrganizationUnitType;
    private String ROL_11_OfficeHomeAddressBirthplace;
    private String ROL_12_Phone;
    private String ROL_13_PersonsLocation;
    private String ROL_14_Organization;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

