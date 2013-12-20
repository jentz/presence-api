package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DisconnectBy {

  MYSELF("myself"),
  REMOTE("remote"),
  LOST_NETWORK("lostNetwork");
  private final String value;

  DisconnectBy(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static DisconnectBy fromValue(String v) {
    for (DisconnectBy c : DisconnectBy.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
