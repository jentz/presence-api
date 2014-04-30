package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.tieto.ipac.presence.ContactAvailability;
import com.tieto.ipac.presence.Machine;
import com.tieto.ipac.presence.PhoneNumber;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PresenceStatus {

  protected ContactAvailability contactAvailability;
  protected String activity;
  protected boolean manual;
  protected Date lastActive;
  protected List<PhoneNumber> phoneNumbers;
  protected List<Machine> machines;

  public ContactAvailability getContactAvailability() {
    return contactAvailability;
  }

  public void setContactAvailability(ContactAvailability value) {
    this.contactAvailability = value;
  }

  public String getActivity() {
    return activity;
  }

  public void setActivity(String value) {
    this.activity = value;
  }

  public boolean isManual() {
    return manual;
  }

  public void setManual(boolean value) {
    this.manual = value;
  }

  public Date getLastActive() {
    return lastActive;
  }

  public void setLastActive(Date value) {
    this.lastActive = value;
  }

  /**
   * Gets the value of the phoneNumbers property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the phoneNumbers property.
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getPhoneNumbers().add(newItem);
   * </pre>
   *
   *
   * <p>
   * @return Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
   *
   *
   */
  public List<PhoneNumber> getPhoneNumbers() {
    if (phoneNumbers == null) {
      phoneNumbers = new ArrayList<>();
    }
    return this.phoneNumbers;
  }

  /**
   * Gets the value of the machines property.
   *
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot.
   * Therefore any modification you make to the returned list will be present
   * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
   * for the machines property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMachines().add(newItem);
   * </pre>
   *
   *
   * <p>
   * @return Objects of the following type(s) are allowed in the list
     * {@link Machine }
   *
   *
   */
  public List<Machine> getMachines() {
    if (machines == null) {
      machines = new ArrayList<>();
    }
    return this.machines;
  }
}
