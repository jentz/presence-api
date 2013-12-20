package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ContactAvailability {

  NONE("none"),
  ON_LINE("onLine"),
  IDLE_ON_LINE("idleOnLine"),
  BUSY("busy"),
  IDLE_BUSY("idleBusy"),
  DO_NOT_DISTURB("doNotDisturb"),
  BE_RIGHT_BACK("beRightBack"),
  AWAY("away"),
  OFFLINE("offline");
  private final String value;

  ContactAvailability(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static ContactAvailability fromValue(String v) {
    for (ContactAvailability c : ContactAvailability.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
