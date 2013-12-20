package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum EndpointLocationEnum {

  OFFICE("office"),
  MOBILE("mobile"),
  HOME("home"),
  NONE("none");
  private final String value;

  EndpointLocationEnum(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static EndpointLocationEnum fromValue(String v) {
    for (EndpointLocationEnum c : EndpointLocationEnum.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
