package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

  protected String uri;
  protected String bsnb;
  protected CentrexService centrexService;
  @JsonProperty(required = true)
  protected PhoneType phoneType;
  @JsonProperty(required = true)
  protected LineState lineState;
  @JsonProperty(required = true)
  protected Direction direction;
  @JsonProperty(required = true)
  protected DisconnectBy disconnectBy;
  protected List<Short> releaseCauseIndicators;
  protected List<CallPartNumber> callPartNumbers;
  protected List<PhoneCapability> capabilities;
  @JsonProperty(required = true)
  protected VisibilityLevel visibility;

  public String getUri() {
    return uri;
  }

  public void setUri(String value) {
    this.uri = value;
  }

  public String getBsnb() {
    return bsnb;
  }

  public void setBsnb(String value) {
    this.bsnb = value;
  }

  public CentrexService getCentrexService() {
    return centrexService;
  }

  public void setCentrexService(CentrexService value) {
    this.centrexService = value;
  }

  public PhoneType getPhoneType() {
    return phoneType;
  }

  public void setPhoneType(PhoneType value) {
    this.phoneType = value;
  }

  public LineState getLineState() {
    return lineState;
  }

  public void setLineState(LineState value) {
    this.lineState = value;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction value) {
    this.direction = value;
  }

  public DisconnectBy getDisconnectBy() {
    return disconnectBy;
  }

  public void setDisconnectBy(DisconnectBy value) {
    this.disconnectBy = value;
  }

  /**
   * Gets the value of the releaseCauseIndicators property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the releaseCauseIndicators property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getReleaseCauseIndicators().add(newItem);
   * </pre>
   *
   *
   * <p>
   * @return Objects of the following type(s) are allowed in the list
   * {@link Short }
   *
   *
   */
  public List<Short> getReleaseCauseIndicators() {
      if (releaseCauseIndicators == null) {
          releaseCauseIndicators = new ArrayList<>();
      }
      return this.releaseCauseIndicators;
  }

  /**
   * Gets the value of the callPartNumbers property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the object. This is why there is not a <CODE>set</CODE> method
   * for the callPartNumbers property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCallPartNumbers().add(newItem);
   * </pre>
   *
   *
   * <p>
   * @return Objects of the following type(s) are allowed in the list
     * {@link CallPartNumber }
   *
   *
   */
  public List<CallPartNumber> getCallPartNumbers() {
    if (callPartNumbers == null) {
      callPartNumbers = new ArrayList<>();
    }
    return this.callPartNumbers;
  }

  /**
   * Gets the value of the capabilities property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the object. This is why there is not a <CODE>set</CODE> method
   * for the capabilities property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getCapabilities().add(newItem);
   * </pre>
   *
   * @return
   */
  public List<PhoneCapability> getCapabilities() {
    if (capabilities == null) {
      capabilities = new ArrayList<>();
    }
    return this.capabilities;
  }

  public VisibilityLevel getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityLevel value) {
    this.visibility = value;
  }
}
