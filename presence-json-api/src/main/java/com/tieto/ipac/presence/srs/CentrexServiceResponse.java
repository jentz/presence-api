package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CentrexServiceResponse {

  @JsonProperty(required = true)
  protected String bsnb;
  @JsonProperty(required = true)
  protected String cnid;
  protected int status;

  public String getBsnb() {
    return bsnb;
  }

  public void setBsnb(String value) {
    this.bsnb = value;
  }

  public String getCnid() {
    return cnid;
  }

  public void setCnid(String value) {
    this.cnid = value;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int value) {
    this.status = value;
  }

}
