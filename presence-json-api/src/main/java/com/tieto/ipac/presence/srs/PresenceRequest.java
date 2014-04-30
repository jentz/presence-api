package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PresenceRequest {

  protected List<String> uris;
  protected List<String> lyncIds;
  @JsonProperty(required = true)
  protected String cnid;
  protected boolean forcedUpdate;

  public List<String> getUris() {
    if (uris == null) {
      uris = new ArrayList<>();
    }
    return this.uris;
  }

  public List<String> getLyncIds() {
    if (lyncIds == null) {
      lyncIds = new ArrayList<>();
    }
    return this.lyncIds;
  }

  public String getCnid() {
    return cnid;
  }

  public void setCnid(String value) {
    this.cnid = value;
  }

  public boolean isForcedUpdate() {
    return forcedUpdate;
  }

  public void setForcedUpdate(boolean value) {
    this.forcedUpdate = value;
  }

}
