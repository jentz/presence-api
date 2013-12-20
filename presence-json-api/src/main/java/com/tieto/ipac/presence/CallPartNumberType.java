package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CallPartNumberType {

  CDPN("cdpn"),
  CGPN("cgpn"),
  GN_ACGPN("gnAcgpn"),
  OCN("ocn"),
  RN("rn");
  private final String value;

  CallPartNumberType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static CallPartNumberType fromValue(String v) {
    for (CallPartNumberType c : CallPartNumberType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
