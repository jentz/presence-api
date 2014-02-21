package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mwi {

  @JsonProperty(required = true)
  protected String to;
  protected String toCnid;
  @JsonProperty(required = true)
  protected String from;
  protected String fromCnid;
  protected int newMsgs;
  protected int oldMsgs;
  @JsonProperty(required = true)
  protected MwiType mwiType;
  protected String msgData;

  public String getTo() {
    return to;
  }

  public void setTo(String value) {
    this.to = value;
  }

  public String getToCnid() {
    return toCnid;
  }

  public void setToCnid(String toCnid) {
    this.toCnid = toCnid;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String value) {
    this.from = value;
  }

  public String getFromCnid() {
    return fromCnid;
  }

  public void setFromCnid(String fromCnid) {
    this.fromCnid = fromCnid;
  }

  public int getNewMsgs() {
    return newMsgs;
  }

  public void setNewMsgs(int value) {
    this.newMsgs = value;
  }

  public int getOldMsgs() {
    return oldMsgs;
  }

  public void setOldMsgs(int value) {
    this.oldMsgs = value;
  }

  public MwiType getMwiType() {
    return mwiType;
  }

  public void setMwiType(MwiType value) {
    this.mwiType = value;
  }

  public String getMsgData() {
    return msgData;
  }

  public void setMsgData(String value) {
    this.msgData = value;
  }

}
