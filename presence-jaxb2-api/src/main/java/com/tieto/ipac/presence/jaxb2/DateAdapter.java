package com.tieto.ipac.presence.jaxb2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.bind.DatatypeConverter;

public class DateAdapter {
  
  /**
   * Converts a date object to a string in the standard XML Schema xsd:dateTime format:
   * yyyy-MM-ddTHH:mm:ss
   * 
   * @param s Date string
   * @return 
   */
  public static Date parseDate(String s) {
    return DatatypeConverter.parseDate(s).getTime();
  }

  public static String printDate(Date date) {
    Calendar cal = new GregorianCalendar();
    cal.setTime(date);
    return DatatypeConverter.printDate(cal);
  }
}