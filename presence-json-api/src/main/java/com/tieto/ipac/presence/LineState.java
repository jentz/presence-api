package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LineState {

  NOT_RETRIEVED("notRetrieved"),
  REACHABLE("reachable"),
  NOT_REACHABLE("notReachable"),
  BUSY("busy"),
  DIALING("dialing"),
  ALERTING("alerting");
  private final String value;

  LineState(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static LineState fromValue(String v) {
    for (LineState c : LineState.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
