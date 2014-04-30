package com.tieto.ipac.presence;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CallPartNumber {

  @JsonProperty(required = true)
  protected String number;
  @JsonProperty(required = true)
  protected CliType clir;
  @JsonProperty(required = true)
  protected CallPartNumberType callPartNumberType;

  /**
   * Nature of address 0-255
   */
  protected short noa;

  public String getNumber() {
    return number;
  }

  public void setNumber(String value) {
    this.number = value;
  }

  public CliType getClir() {
    return clir;
  }

  public void setClir(CliType value) {
    this.clir = value;
  }

  public CallPartNumberType getCallPartNumberType() {
    return callPartNumberType;
  }

  public void setCallPartNumberType(CallPartNumberType value) {
    this.callPartNumberType = value;
  }

  public short getNoa() {
    return noa;
  }

  public void setNoa(short value) {
    this.noa = value;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 31 * hash + Objects.hashCode(this.number);
    hash = 31 * hash + Objects.hashCode(this.clir);
    hash = 31 * hash + Objects.hashCode(this.callPartNumberType);
    hash = 31 * hash + this.noa;
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final CallPartNumber other = (CallPartNumber) obj;
    if (!Objects.equals(this.number, other.number)) {
      return false;
    }
    if (this.clir != other.clir) {
      return false;
    }
    if (this.callPartNumberType != other.callPartNumberType) {
      return false;
    }
    if (this.noa != other.noa) {
      return false;
    }
    return true;
  }
}
