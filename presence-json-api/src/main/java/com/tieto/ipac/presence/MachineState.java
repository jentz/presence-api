package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MachineState {

  UNKNOWN("unknown"),
  ONLINE("online"),
  IDLE("idle"),
  AWAY("away"),
  OFFLINE("offline");
  private final String value;

  MachineState(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static MachineState fromValue(String v) {
    for (MachineState c : MachineState.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
