/**
 * 
 */
package com.redhat.idaas.pojos.clinical;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author Alan Scott
 * 
 * Meant to provide an object to work with that represents the PRC segment in 
 * HL7 and has been augmented to support additional needed attributes. It can 
 * also be further augmented to support additional needs.
 *
 */
public class HL7Pricing {

	private String sendingApp;
	private String facilityId;
	private String messageDateTime;
	private String messageTriggerEvent;
	private String messageId;
	private String uniqueMessageId;
	private String messageVersion;
	private String primaryKeyValue;
	private String validPtClasses;
	private String priceAmt;
	private String minQty;
	private String maxQty;
	private String minPrice;
	private String maxPrice;
	private String effStartDate;
	private String effEndDate;
	private String billingCategory;
	private String chargeableFlag;
	private String ctivityFlag;
	private String lastValue;
	public String getSendingApp() {
		return sendingApp;
	}
	public void setSendingApp(String sendingApp) {
		this.sendingApp = sendingApp;
	}
	public String getFacilityId() {
		return facilityId;
	}
	public void setFacilityId(String facilityId) {
		this.facilityId = facilityId;
	}
	public String getMessageDateTime() {
		return messageDateTime;
	}
	public void setMessageDateTime(String messageDateTime) {
		this.messageDateTime = messageDateTime;
	}
	public String getMessageTriggerEvent() {
		return messageTriggerEvent;
	}
	public void setMessageTriggerEvent(String messageTriggerEvent) {
		this.messageTriggerEvent = messageTriggerEvent;
	}
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public String getUniqueMessageId() {
		return uniqueMessageId;
	}
	public void setUniqueMessageId(String uniqueMessageId) {
		this.uniqueMessageId = uniqueMessageId;
	}
	public String getMessageVersion() {
		return messageVersion;
	}
	public void setMessageVersion(String messageVersion) {
		this.messageVersion = messageVersion;
	}
	public String getPrimaryKeyValue() {
		return primaryKeyValue;
	}
	public void setPrimaryKeyValue(String primaryKeyValue) {
		this.primaryKeyValue = primaryKeyValue;
	}
	public String getValidPtClasses() {
		return validPtClasses;
	}
	public void setValidPtClasses(String validPtClasses) {
		this.validPtClasses = validPtClasses;
	}
	public String getPriceAmt() {
		return priceAmt;
	}
	public void setPriceAmt(String priceAmt) {
		this.priceAmt = priceAmt;
	}
	public String getMinQty() {
		return minQty;
	}
	public void setMinQty(String minQty) {
		this.minQty = minQty;
	}
	public String getMaxQty() {
		return maxQty;
	}
	public void setMaxQty(String maxQty) {
		this.maxQty = maxQty;
	}
	public String getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}
	public String getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}
	public String getEffStartDate() {
		return effStartDate;
	}
	public void setEffStartDate(String effStartDate) {
		this.effStartDate = effStartDate;
	}
	public String getEffEndDate() {
		return effEndDate;
	}
	public void setEffEndDate(String effEndDate) {
		this.effEndDate = effEndDate;
	}
	public String getBillingCategory() {
		return billingCategory;
	}
	public void setBillingCategory(String billingCategory) {
		this.billingCategory = billingCategory;
	}
	public String getChargeableFlag() {
		return chargeableFlag;
	}
	public void setChargeableFlag(String chargeableFlag) {
		this.chargeableFlag = chargeableFlag;
	}
	public String getCtivityFlag() {
		return ctivityFlag;
	}
	public void setCtivityFlag(String ctivityFlag) {
		this.ctivityFlag = ctivityFlag;
	}
	public String getLastValue() {
		return lastValue;
	}
	public void setLastValue(String lastValue) {
		this.lastValue = lastValue;
	}
	
	//toString 
	public String toString() 
	{
		return ReflectionToStringBuilder.toString(this);
	}
}
