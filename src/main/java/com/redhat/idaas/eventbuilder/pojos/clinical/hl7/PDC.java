package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDC {
    private String PDC_1_ManufacturerDistributor;
    private String PDC_2_Country;
    private String PDC_3_BrandName;
    private String PDC_4_DeviceFamilyName;
    private String PDC_5_GenericName;
    private String PDC_6_ModelIdentifier;
    private String PDC_7_CatalogueIdentifier;
    private String PDC_8_OtherIdentifier;
    private String PDC_9_ProductCode;
    private String PDC_10_MarketingBasis;
    private String PDC_11_MarketingApprovalID;
    private String PDC_12_LabeledShelfLife;
    private String PDC_13_ExpectedShelfLife;
    private String PDC_14_DateFirstMarketed;
    private String PDC_15_DateLastMarketed;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

