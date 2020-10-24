package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TQ2 {
    private String TQ2_1_SetIDTQ2;
    private String TQ2_2_SequenceResultsFlag;
    private String TQ2_3_RelatedPlacerNumber;
    private String TQ2_4_RelatedFillerNumber;
    private String TQ2_5_RelatedPlacerGroupNumber;
    private String TQ2_6_SequenceConditionCode;
    private String TQ2_7_CyclicEntryExitIndicator;
    private String TQ2_8_SequenceConditionTimeInterval;
    private String TQ2_9_CyclicGroupMaximumNumberofRepeats;
    private String TQ2_10_SpecialServiceRequestRelationship;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

