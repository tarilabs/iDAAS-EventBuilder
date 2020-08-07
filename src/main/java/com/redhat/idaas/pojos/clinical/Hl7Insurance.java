/*
 * Copyright 2019 Red Hat, Inc.
 * <p>
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 *
 */
package com.redhat.idaas.pojos.clinical;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Hl7Insurance {

  private String insuranceType;
  private String insurancePlanName;
  private String insurancePlanAddress;
  private String insurancePlanID;
  private String insurancePlanPhoneNumber;

  public String getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }

  public String getInsurancePlanName() {
    return insurancePlanName;
  }

  public void setInsurancePlanName(String insurancePlanName) {
    this.insurancePlanName = insurancePlanName;
  }

  public String getInsurancePlanAddress() {
    return insurancePlanAddress;
  }

  public void setInsurancePlanAddress(String insurancePlanAddress) {
    this.insurancePlanAddress = insurancePlanAddress;
  }

  public String getInsurancePlanID() {
    return insurancePlanID;
  }

  public void setInsurancePlanID(String insurancePlanID) {
    this.insurancePlanID = insurancePlanID;
  }

  public String getInsurancePlanPhoneNumber() {
    return insurancePlanPhoneNumber;
  }

  public void setInsurancePlanPhoneNumber(String insurancePlanPhoneNumber) {
    this.insurancePlanPhoneNumber = insurancePlanPhoneNumber;
  }
  
//toString 
public String toString() 
{
		return ReflectionToStringBuilder.toString(this);
}
}
