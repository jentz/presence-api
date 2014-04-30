
package com.tieto.ipac.presence.srs;

import com.tieto.ipac.presence.ActivityTokenTypeEnum;
import com.tieto.ipac.presence.CentrexService;
import com.tieto.ipac.presence.ContactAvailability;
import com.tieto.ipac.presence.LineState;
import com.tieto.ipac.presence.Machine;
import com.tieto.ipac.presence.MachineState;
import com.tieto.ipac.presence.Note;
import com.tieto.ipac.presence.NoteType;
import com.tieto.ipac.presence.PhoneNumber;
import com.tieto.ipac.presence.PhoneType;
import com.tieto.ipac.presence.ServiceType;
import com.tieto.ipac.presence.VisibilityLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jentzmar
 */
public class PresenceFixtures {

  public static final String STD_CNID = "4680960000";
  public static final String STD_BSNB = "6877";
  public static final String STD_TEL = "tel:+4680966877";

  public static Presence standardPresence() {
    Presence p = new Presence();
    p.setBsnb(STD_BSNB);
    p.setCnid(STD_CNID);
    p.setLyncUri("sip:john.doe@acme.com");
    p.setUri("sip:john.doe@acme.com");
    p.setTimestamp(new Date());
    p.setPresenceStatus(standardPresenceStatus());
    p.getNotes().add(standardNote());
    return p;
  }

  public static Presence centrexPresence() {
    Presence p = new Presence();
    p.setBsnb(STD_BSNB);
    p.setCnid(STD_CNID);
    p.setUri(STD_TEL);
    p.setTimestamp(new Date());
    p.setPresenceStatus(centrexPresenceStatus());
    return p;
  }

  private static PresenceStatus centrexPresenceStatus() {
    PresenceStatus ps = new PresenceStatus();
    ps.getPhoneNumbers().add(centrexPhoneNumber());
    return ps;
  }

  private static PresenceStatus standardPresenceStatus() {
    PresenceStatus ps = new PresenceStatus();
    ps.setActivity(ActivityTokenTypeEnum.IN_A_MEETING.toString());
    ps.setContactAvailability(ContactAvailability.BUSY);
    ps.setLastActive(new Date());
    ps.setManual(false);
    ps.getMachines().add(standardMachine());
    ps.getPhoneNumbers().add(standardPhoneNumber());
    return ps;
  }

  private static Machine standardMachine() {
    Machine m = new Machine();
    m.setDeviceType("laptop");
    m.setEndpointLocation("work");
    m.setMachineName("ws123");
    m.setState(MachineState.IDLE);
    m.getCapabilities().add("unknown");
    return m;
  }

  private static PhoneNumber centrexPhoneNumber() {
    PhoneNumber pn = new PhoneNumber();
    pn.setBsnb(STD_BSNB);
    pn.setCentrexService(standardCentrexService());
    pn.setLineState(LineState.REACHABLE);
    pn.setPhoneType(PhoneType.UNKNOWN);
    pn.setUri(STD_TEL);
    pn.setVisibility(VisibilityLevel.NONE);
    return pn;
  }

  private static PhoneNumber standardPhoneNumber() {
    PhoneNumber pn = new PhoneNumber();
    pn.setBsnb(STD_BSNB);
    pn.setCentrexService(standardCentrexService());
    pn.setDirection(null);
    pn.setDisconnectBy(null);
    pn.setLineState(LineState.REACHABLE);
    pn.setPhoneType(PhoneType.VOIP);
    pn.setUri(STD_TEL);
    pn.setVisibility(VisibilityLevel.NONE);
    pn.getReleaseCauseIndicators().add((short)12);
    pn.getReleaseCauseIndicators().add((short)2);
    return pn;
  }

  private static Note standardNote() {
    Note n = new Note();
    n.setMessage("Example note");
    n.setNoteType(NoteType.PERSONAL);
    return n;
  }

  public static CentrexService standardCentrexService() {
    CentrexService cs = new CentrexService();
    cs.setAbsentCode(0);
    cs.setActivated(true);
    cs.setReturnTime(format("2014-06-12T07:30:00.000+0000"));
    cs.setServiceType(ServiceType.ABS);
    return cs;
  }

  /**
   *
   * @param str such as "2014-06-12T07:30:00.000+0000"
   * @return Date object
   */
  public static Date format(String str) {
    try {
      return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(str);
    }
    catch (ParseException ex) {
      throw new RuntimeException(ex);
    }
  }

  public static PresenceRequest standardPresenceRequest() {
    PresenceRequest r = new PresenceRequest();
    r.setCnid(STD_CNID);
    r.setForcedUpdate(true);

    return r;
  }

  public static CentrexServiceRequest standardCentrexServiceRequest() {
    CentrexServiceRequest r = new CentrexServiceRequest();
    r.setBsnb(STD_BSNB);
    r.setCentrexService(standardCentrexService());
    r.setCnid(STD_CNID);
    return r;
  }

  static CentrexServiceResponse standardCentrexServiceResponse() {
    CentrexServiceResponse r = new CentrexServiceResponse();
    r.setBsnb(STD_BSNB);
    r.setCnid(STD_CNID);
    r.setStatus(0);
    return r;
  }
}
