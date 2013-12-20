package com.tieto.ipac.presence;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.util.Date;
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
  public static void setup() {
    mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.disable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);    
  }
  
  @Test
  public void marshalNote() throws JsonProcessingException, IOException {
    Note from = new Note();
    from.setMessage("testing");
    from.setNoteType(NoteType.UNKNOWN);
    
    String json = mapper.writeValueAsString(from);   
    System.out.println(json);

    Note to = mapper.readValue(json, Note.class);
    
    assertThat(to.getMessage(), equalTo(from.getMessage()));
    assertThat(to.getNoteType(), equalTo(from.getNoteType()));
  }
  
  @Test
  public void marshalCentrexService() throws JsonProcessingException, IOException {
    CentrexService from = new CentrexService();
    from.setServiceType(ServiceType.CFU);
    from.setReturnTime(new Date());
    String json = mapper.writeValueAsString(from);    
    System.out.println(json);
    CentrexService to = mapper.readValue(json, CentrexService.class);
    
    assertThat(to.getServiceType(), equalTo(from.getServiceType()));
    assertThat(to.getReturnTime(), equalTo(from.getReturnTime()));
  }
}
