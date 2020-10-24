package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class REL {
    private String REL_1_SetIDREL;
    private String REL_2_RelationshipType;
    private String REL_3_ThisRelationshipInstanceIdentifier;
    private String REL_4_SourceInformationInstanceIdentifier;
    private String REL_5_TargetInformationInstanceIdentifier;
    private String REL_6_AssertingEntityInstanceID;
    private String REL_7_AssertingPerson;
    private String REL_8_AssertingOrganization;
    private String REL_9_AssertorAddress;
    private String REL_10_AssertorContact;
    private String REL_11_AssertionDateRange;
    private String REL_12_NegationIndicator;
    private String REL_13_CertaintyofRelationship;
    private String REL_14_PriorityNo;
    private String REL_15_PrioritySequenceNorelpreferenceforconsideration;
    private String REL_16_SeparabilityIndicator;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

