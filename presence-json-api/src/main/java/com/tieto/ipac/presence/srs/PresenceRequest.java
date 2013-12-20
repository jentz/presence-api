package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class PresenceRequest {

  protected List<String> uris;
  protected List<String> lyncIds;
  @JsonProperty(required = true)
  protected String cnid;
  protected long cid;
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

  public long getCid() {
    return cid;
  }

  public void setCid(long value) {
    this.cid = value;
  }

  public boolean isForcedUpdate() {
    return forcedUpdate;
  }

  public void setForcedUpdate(boolean value) {
    this.forcedUpdate = value;
  }

}
