package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 */
public enum NoteType {

  UNKNOWN("unknown"),
  PERSONAL("personal"),
  OUT_OF_OFFICE("outOfOffice");
  private final String value;

  NoteType(String v) {
    value = v;
  }

  @JsonValue
  public String value() {
    return value;
  }

  @JsonCreator
  public static NoteType fromValue(String v) {
    for (NoteType c : NoteType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
