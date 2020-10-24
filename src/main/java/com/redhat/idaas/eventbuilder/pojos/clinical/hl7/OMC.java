package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OMC {
    private String OMC_1_SequenceNumberTestObservationMasterFile;
    private String OMC_2_SegmentActionCode;
    private String OMC_3_SegmentUniqueKey;
    private String OMC_4_ClinicalInformationRequest;
    private String OMC_5_CollectionEventProcessStep;
    private String OMC_6_CommunicationLocation;
    private String OMC_7_AnswerRequired;
    private String OMC_8_HintHelpText;
    private String OMC_9_TypeofAnswer;
    private String OMC_10_MultipleAnswersAllowed;
    private String OMC_11_AnswerChoices;
    private String OMC_12_CharacterLimit;
    private String OMC_13_NumberofDecimals;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

