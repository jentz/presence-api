package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ServiceType {

  CFU("cfu"),
  CFB("cfb"),
  CFNA("cfna"),
  MW("mw"),
  ABS("abs"),
  GD("gd");
  private final String value;

  ServiceType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static ServiceType fromValue(String v) {
    for (ServiceType c : ServiceType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
