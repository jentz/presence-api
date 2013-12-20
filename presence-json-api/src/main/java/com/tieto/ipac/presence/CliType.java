package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CliType {

  NOT_AVAILABLE("notAvailable"),
  ALLOWED("allowed"),
  RESTRICTED("restricted");
  private final String value;

  CliType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static CliType fromValue(String v) {
    for (CliType c : CliType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
