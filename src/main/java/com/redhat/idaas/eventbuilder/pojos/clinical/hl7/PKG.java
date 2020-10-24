package com.redhat.idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PKG {
    private String PKG_1_SetIdPKG;
    private String PKG_2_PackagingUnits;
    private String PKG_3_DefaultOrderUnitOfMeasureIndicator;
    private String PKG_4_PackageQuantity;
    private String PKG_5_Price;
    private String PKG_6_FutureItemPrice;
    private String PKG_7_FutureItemPriceEffectiveDate;
    private String PKG_8_GlobalTradeItemNumber;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

