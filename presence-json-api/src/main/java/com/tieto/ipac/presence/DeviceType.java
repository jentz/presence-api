package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DeviceType {

  UNDEFINED("undefined"),
  COMPUTER("computer"),
  DESK_PHONE("deskPhone"),
  MOBILE("mobile"),
  WEB("web"),
  CUSTOM("custom");
  private final String value;

  DeviceType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static DeviceType fromValue(String v) {
    for (DeviceType c : DeviceType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
