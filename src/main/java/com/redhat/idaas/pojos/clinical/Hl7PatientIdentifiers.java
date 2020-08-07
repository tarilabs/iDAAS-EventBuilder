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

public class Hl7PatientIdentifiers {

  private String ptExternalId;
  private String ptInternalId;
  private String ptRace;
  private String ptBusinessPhone;
  private String ptHomePhone;
  private String ptAddress;
  private String ptEthnicity;

  public String getPtExternalId() {
    return ptExternalId;
  }

  public void setPtExternalId(String ptExternalId) {
    this.ptExternalId = ptExternalId;
  }

  public String getPtInternalId() {
    return ptInternalId;
  }

  public void setPtInternalId(String ptInternalId) {
    this.ptInternalId = ptInternalId;
  }

  public String getPtRace() {
    return ptRace;
  }

  public void setPtRace(String ptRace) {
    this.ptRace = ptRace;
  }

  public String getPtBusinessPhone() {
    return ptBusinessPhone;
  }

  public void setPtBusinessPhone(String ptBusinessPhone) {
    this.ptBusinessPhone = ptBusinessPhone;
  }

  public String getPtHomePhone() {
    return ptHomePhone;
  }

  public void setPtHomePhone(String ptHomePhone) {
    this.ptHomePhone = ptHomePhone;
  }

  public String getPtAddress() {
    return ptAddress;
  }

  public void setPtAddress(String ptAddress) {
    this.ptAddress = ptAddress;
  }

  public String getPtEthnicity() {
    return ptEthnicity;
  }

  public void setPtEthnicity(String ptEthnicity) {
    this.ptEthnicity = ptEthnicity;
  }
  
//toString 
public String toString() 
{
	return ReflectionToStringBuilder.toString(this);
}
}
