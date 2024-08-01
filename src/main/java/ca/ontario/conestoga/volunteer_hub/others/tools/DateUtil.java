package ca.ontario.conestoga.volunteer_hub.others.tools;

import ca.ontario.conestoga.volunteer_hub.others.exception.HubException;

import java.util.Date;

public class DateUtil {
  public static int calculateAge(Date dob) throws HubException {
    if (dob == null) {
      throw new HubException("Date of birth is required.");
    }
    Date currentDate = new Date();
    long timeDiff = currentDate.getTime() - dob.getTime();
    long ageInMillis = 31556952000L; // Milliseconds in a year
    return (int) (timeDiff / ageInMillis);
  }
}
