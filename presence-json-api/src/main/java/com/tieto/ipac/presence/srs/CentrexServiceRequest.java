package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tieto.ipac.presence.CentrexService;

public class CentrexServiceRequest {

  @JsonProperty(required = true)
  protected String bsnb;
  @JsonProperty(required = true)
  protected String cnid;
  @JsonProperty(required = true)
  protected CentrexService centrexService;
  protected long cid;

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

  public CentrexService getCentrexService() {
    return centrexService;
  }

  public void setCentrexService(CentrexService value) {
    this.centrexService = value;
  }

  public long getCid() {
    return cid;
  }

  public void setCid(long value) {
    this.cid = value;
  }

}
