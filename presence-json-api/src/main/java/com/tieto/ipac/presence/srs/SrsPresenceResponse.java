package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tieto.ipac.presence.CentrexService;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SrsPresenceResponse {

  @JsonProperty(required = true)
  protected String bsnb;
  @JsonProperty(required = true)
  protected String cnid;
  @JsonProperty(required = true)
  protected boolean last;
  @JsonProperty(required = true)
  protected CentrexService centrexService;

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

  public boolean isLast() {
    return last;
  }

  public void setLast(boolean last) {
    this.last = last;
  }

  public CentrexService getCentrexService() {
    return centrexService;
  }

  public void setCentrexService(CentrexService value) {
    this.centrexService = value;
  }
}
