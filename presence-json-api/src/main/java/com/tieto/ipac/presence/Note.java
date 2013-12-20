package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Note {

  @JsonProperty(required = true)
  protected String message;
  protected NoteType noteType;

  public String getMessage() {
    return message;
  }

  public void setMessage(String value) {
    this.message = value;
  }

  public NoteType getNoteType() {
    return noteType;
  }

  public void setNoteType(NoteType value) {
    this.noteType = value;
  }
}
