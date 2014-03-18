package com.tieto.ipac.presence.srs.pm.jaxb2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;
import com.tieto.ipac.presence.jaxb2.ActivityTokenTypeEnum;
import com.tieto.ipac.presence.jaxb2.ContactAvailability;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jentzmar
 */
public class MarshallingTest {

  private static ObjectMapper mapper;


  @BeforeClass
  public static void setupClass() {
    mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.disable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    AnnotationIntrospector primary = new JacksonAnnotationIntrospector();
    AnnotationIntrospector secondary = new JaxbAnnotationIntrospector(TypeFactory.defaultInstance());
    AnnotationIntrospectorPair pair = new AnnotationIntrospectorPair(primary, secondary);
    mapper.setAnnotationIntrospector(pair);

  }

  @AfterClass
  public static void tearDownClass() {

  }

  @Test
  public void marshalPresence() throws JsonProcessingException {
    Presence presence = new Presence();
    presence.setBsnb("480123456");
    presence.setCnid("123456");
    presence.setLyncUri("uri:lync");
    presence.setTimestamp(new Date());

    PresenceStatus presenceStatus = new PresenceStatus();
    presenceStatus.setActivity(ActivityTokenTypeEnum.ON_THE_PHONE.toString());
    presenceStatus.setContactAvailability(ContactAvailability.NONE);
    presenceStatus.setManual(true);
    presenceStatus.setLastActive(new Date());

    presence.setPresenceStatus(presenceStatus);

    String json = mapper.writeValueAsString(presence);

    System.out.println(json);

  }
}
