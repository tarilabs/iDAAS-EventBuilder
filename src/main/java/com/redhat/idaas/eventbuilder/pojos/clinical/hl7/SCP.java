package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SCP {
    private String SCP_1_NumberOfDecontaminationSterilizationDevices;
    private String SCP_2_LaborCalculationType;
    private String SCP_3_DateFormat;
    private String SCP_4_DeviceNumber;
    private String SCP_5_DeviceName;
    private String SCP_6_DeviceModelName;
    private String SCP_7_DeviceType;
    private String SCP_8_LotControl;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

