package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SubscriptionType {

  UNKNOWN("unknown"),
  POTS("pots"),
  VOIP("voip"),
  MOBILE("mobile");
  private final String value;

  SubscriptionType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static SubscriptionType fromValue(String v) {
    for (SubscriptionType c : SubscriptionType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

}
