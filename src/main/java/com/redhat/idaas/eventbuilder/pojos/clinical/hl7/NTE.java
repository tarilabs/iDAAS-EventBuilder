package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NTE {
    private String NTE_1_SetIDNTE;
    private String NTE_2_SourceofComment;
    private String NTE_3_Comment;
    private String NTE_4_CommentType;
    private String NTE_5_EnteredBy;
    private String NTE_6_EnteredDateTime;
    private String NTE_7_EffectiveStartDate;
    private String NTE_8_ExpirationDate;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

