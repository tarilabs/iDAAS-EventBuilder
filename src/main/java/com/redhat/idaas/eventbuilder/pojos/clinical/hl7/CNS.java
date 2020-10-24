package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CNS {
    private String CNS_1_StartingNotificationReferenceNumber;
    private String CNS_2_EndingNotificationReferenceNumber;
    private String CNS_3_StartingNotificationDateTime;
    private String CNS_4_EndingNotificationDateTime;
    private String CNS_5_StartingNotificationCode;
    private String CNS_6_EndingNotificationCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

