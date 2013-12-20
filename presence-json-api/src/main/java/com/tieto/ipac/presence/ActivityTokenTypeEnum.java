package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ActivityTokenTypeEnum {

  ON_THE_PHONE("on-the-phone"),
  IN_A_CONFERENCE("in-a-conference"),
  IN_A_MEETING("in-a-meeting"),
  OUT_OF_OFFICE("out-of-office"),
  URGENT_INTERRUPTIONS_ONLY("urgent-interruptions-only"),
  OFF_WORK("off-work"),
  IN_PRESENTATION("in-presentation");

  private final String value;

  ActivityTokenTypeEnum(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static ActivityTokenTypeEnum fromValue(String v) {
    for (ActivityTokenTypeEnum c : ActivityTokenTypeEnum.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
