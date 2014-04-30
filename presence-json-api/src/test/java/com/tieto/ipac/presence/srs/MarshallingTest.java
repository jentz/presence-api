package com.tieto.ipac.presence.srs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
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
    Presence from = PresenceFixtures.standardPresence();

    String json = mapper.writeValueAsString(from);
    System.out.println(json);

    Presence to = mapper.readValue(json, Presence.class);

    assertThat(to.getBsnb(), equalTo(from.getBsnb()));
    assertThat(to.getCnid(), equalTo(from.getCnid()));
    assertThat(to.getPresenceStatus().getLastActive(), equalTo(from.getPresenceStatus().getLastActive()));
    assertThat(to.getPresenceStatus().getContactAvailability(), equalTo(from.getPresenceStatus().getContactAvailability()));
  }

  @Test
  public void marshalCentrexPresence() throws JsonProcessingException, IOException {
    Presence from = PresenceFixtures.centrexPresence();

    String json = mapper.writeValueAsString(from);
    System.out.println(json);

    Presence to = mapper.readValue(json, Presence.class);

    assertThat(to.getBsnb(), equalTo(from.getBsnb()));
    assertThat(to.getCnid(), equalTo(from.getCnid()));
    assertThat(to.getPresenceStatus().getLastActive(), equalTo(from.getPresenceStatus().getLastActive()));
    assertThat(to.getPresenceStatus().getContactAvailability(), equalTo(from.getPresenceStatus().getContactAvailability()));
  }

  @Test
  public void marshalPresenceRequest() throws JsonProcessingException, IOException {
    PresenceRequest from = PresenceFixtures.standardPresenceRequest();
    String json = mapper.writeValueAsString(from);
    System.out.println(json);

    PresenceRequest to = mapper.readValue(json, PresenceRequest.class);
    assertThat(to.getCnid(), equalTo(from.getCnid()));
    assertThat(to.isForcedUpdate(), equalTo(from.isForcedUpdate()));
  }

  @Test
  public void marshalCentrexServiceRequest() throws JsonProcessingException, IOException {
    CentrexServiceRequest from = PresenceFixtures.standardCentrexServiceRequest();
    String json = mapper.writeValueAsString(from);
    System.out.println(json);

    CentrexServiceRequest to = mapper.readValue(json, CentrexServiceRequest.class);
    assertThat(to.getCnid(), equalTo(from.getCnid()));
  }

  @Test
  public void marshalCentrexServiceResponse() throws JsonProcessingException, IOException {
    CentrexServiceResponse from = PresenceFixtures.standardCentrexServiceResponse();
    String json = mapper.writeValueAsString(from);
    System.out.println(json);

    CentrexServiceResponse to = mapper.readValue(json, CentrexServiceResponse.class);
    assertThat(to.getCnid(), equalTo(from.getCnid()));
  }

}
