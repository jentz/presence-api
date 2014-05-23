package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CentrexService {

  @JsonProperty(required = true)
  protected ServiceType serviceType;
  protected boolean activated;
  protected String forwardedNumber;
  protected Integer absentCode;
  protected Integer absentMessageId;
  protected Date returnTime;

  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType value) {
    this.serviceType = value;
  }

  public boolean isActivated() {
    return activated;
  }

  public void setActivated(boolean value) {
    this.activated = value;
  }

  public String getForwardedNumber() {
    return forwardedNumber;
  }

  public void setForwardedNumber(String value) {
    this.forwardedNumber = value;
  }

  public Integer getAbsentCode() {
    return absentCode;
  }

  public void setAbsentCode(Integer value) {
    this.absentCode = value;
  }

  public Integer getAbsentMessageId() {
    return absentMessageId;
  }

  public void setAbsentMessageId(Integer absentMessageId) {
    this.absentMessageId = absentMessageId;
  }
  
  public Date getReturnTime() {
    return returnTime;
  }

  public void setReturnTime(Date value) {
    this.returnTime = value;
  }
}
