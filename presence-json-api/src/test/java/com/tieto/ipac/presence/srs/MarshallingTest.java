package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.tieto.ipac.presence.ActivityTokenTypeEnum;
import com.tieto.ipac.presence.ContactAvailability;
import java.io.IOException;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author jentzmar
 */
public class MarshallingTest {

  private static ObjectMapper mapper;

  @BeforeClass
  public static void setupClass() throws JsonMappingException, JsonProcessingException {
    mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.disable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);

//    SchemaFactoryWrapper visitor = new SchemaFactoryWrapper();
//    mapper.acceptJsonFormatVisitor(mapper.constructType(Presence.class), visitor);
//    JsonSchema jsonSchema = visitor.finalSchema();
//    String json = mapper.writeValueAsString(jsonSchema);
//    System.out.println(json);
  }

  @AfterClass
  public static void tearDownClass() {

  }

  @Test
  public void marshalPresence() throws JsonProcessingException, IOException {
    Presence from = new Presence();
    from.setUri("something");
    from.setBsnb("480123456");
    from.setCnid("123456");
    from.setLyncUri("uri:lync");
    from.setTimestamp(new Date());

    PresenceStatus presenceStatus = new PresenceStatus();
    presenceStatus.setActivity(ActivityTokenTypeEnum.ON_THE_PHONE.value());
    presenceStatus.setContactAvailability(ContactAvailability.NONE);
    presenceStatus.setManual(true);
    presenceStatus.setLastActive(new Date());

    from.setPresenceStatus(presenceStatus);

    String json = mapper.writeValueAsString(from);
    System.out.println(json);

    Presence to = mapper.readValue(json, Presence.class);

    assertThat(to.getBsnb(), equalTo(from.getBsnb()));
    assertThat(to.getCnid(), equalTo(from.getCnid()));
    assertThat(to.getPresenceStatus().getLastActive(), equalTo(from.getPresenceStatus().getLastActive()));
    assertThat(to.getPresenceStatus().getContactAvailability(), equalTo(from.getPresenceStatus().getContactAvailability()));
  }
}
