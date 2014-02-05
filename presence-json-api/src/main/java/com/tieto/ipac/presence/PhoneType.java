package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PhoneType {

  UNKNOWN("unknown"),
  POTS("pots"),
  VOIP("voip"),
  MOBILE("mobile");
  private final String value;

  PhoneType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static PhoneType fromValue(String v) {
    for (PhoneType c : PhoneType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
