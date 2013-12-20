package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum VisibilityLevel {

  NONE("none"),
  PERSONAL("personal"),
  WORKGROUP("workgroup"),
  SITE("site"),
  COMPANY("company"),
  FEDERATION("federation"),
  ALL("all");
  private final String value;

  VisibilityLevel(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static VisibilityLevel fromValue(String v) {
    for (VisibilityLevel c : VisibilityLevel.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
