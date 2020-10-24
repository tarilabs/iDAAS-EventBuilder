package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NDS {
    private String NDS_1_NotificationReferenceNumber;
    private String NDS_2_NotificationDateTime;
    private String NDS_3_NotificationAlertSeverity;
    private String NDS_4_NotificationCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

