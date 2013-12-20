package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PhoneCapability {

  CENTREX("centrex"),
  FORKING_MEMBER("forkingMember"),
  MFN("mfn"),
  DEFAULT_NUMBER("defaultNumber"),
  ACDG("acdg");
  private final String value;

  PhoneCapability(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static PhoneCapability fromValue(String v) {
    for (PhoneCapability c : PhoneCapability.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
