package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SrsPresenceRequest {

  @JsonProperty(required = true)
  protected String presenceSystemId;
  @JsonProperty(required = true)
  protected String cnid;
  protected List<String> bsnbs;

  public String getCnid() {
    return cnid;
  }

  public void setCnid(String value) {
    this.cnid = value;
  }

  public String getPresenceSystemId() {
    return presenceSystemId;
  }

  public void setPresenceSystemId(String presenceSystemId) {
    this.presenceSystemId = presenceSystemId;
  }

  public List<String> getBsnbs() {
    if (bsnbs == null) {
      bsnbs = new ArrayList<>();
    }
    return bsnbs;
  }

}
