package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.tieto.ipac.presence.Note;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonPropertyOrder(value = {"uri", "lyncUri"})
public class Presence {

  @JsonProperty(required = true)
  protected String uri;
  protected String lyncUri;
  protected String cnid;
  protected String bsnb;
  protected Date timestamp;
  protected PresenceStatus presenceStatus;
  protected List<Note> notes;
  protected List<String> capabilites;

  public String getUri() {
    return uri;
  }

  public void setUri(String value) {
    this.uri = value;
  }

  public String getLyncUri() {
    return lyncUri;
  }

  public void setLyncUri(String value) {
    this.lyncUri = value;
  }

  public String getCnid() {
    return cnid;
  }

  public void setCnid(String value) {
    this.cnid = value;
  }

  public String getBsnb() {
    return bsnb;
  }

  public void setBsnb(String value) {
    this.bsnb = value;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public PresenceStatus getPresenceStatus() {
    return presenceStatus;
  }

  public void setPresenceStatus(PresenceStatus value) {
    this.presenceStatus = value;
  }

  /**
   * Gets the value of the notes property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the object. This is why there is not a <CODE>set</CODE> method for
   * the notes property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getNotes().add(newItem);
   * </pre>
   *
   *
   * <p>
   * @return Objects of the following type(s) are allowed in the list
     * {@link Note }
   *
   *
   */
  public List<Note> getNotes() {
    if (notes == null) {
      notes = new ArrayList<>();
    }
    return this.notes;
  }

  /**
   * Gets the value of the capabilites property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the object. This is why there is not a <CODE>set</CODE> method for
   * the capabilites property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCapabilites().add(newItem);
   * </pre>
   *
   *
   * <p>
   * @return Objects of the following type(s) are allowed in the list
     * {@link String }
   *
   *
   */
  public List<String> getCapabilites() {
    if (capabilites == null) {
      capabilites = new ArrayList<>();
    }
    return this.capabilites;
  }

}
