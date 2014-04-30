package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Machine {

  @JsonProperty(required = true)
  protected String machineName;
  protected MachineState state;
  protected String deviceType;
  protected String endpointLocation;
  protected List<String> capabilities;

  public String getMachineName() {
    return machineName;
  }

  public void setMachineName(String value) {
    this.machineName = value;
  }

  public MachineState getState() {
    return state;
  }

  public void setState(MachineState value) {
    this.state = value;
  }

  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String value) {
    this.deviceType = value;
  }

  public String getEndpointLocation() {
    return endpointLocation;
  }

  public void setEndpointLocation(String value) {
    this.endpointLocation = value;
  }

  public List<String> getCapabilities() {
    if (capabilities == null) {
      capabilities = new ArrayList<>();
    }
    return this.capabilities;
  }

}
