package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum MwiType {

  UNKNOWN("unknown"),
  VOICE("voice"),
  TEXT("text"),
  FAX("fax");
  private final String value;

  MwiType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static MwiType fromValue(String v) {
    for (MwiType c : MwiType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
