package ca.ontario.conestoga.volunteer_hub.others.enums;

import ca.ontario.conestoga.volunteer_hub.entity.PositionApplication;
import lombok.Getter;

@Getter
public enum ApplicationStatus {
  PENDING("pending", true), APPROVED("approved", false),
  DECLINED("declined", false), UNAVAILABLE("unavailable", false),
  CANCELLED("cancelled", false);
  private String status;
  private Boolean changeable;

  ApplicationStatus(String status, Boolean changeable) {
    this.status = status;
    this.changeable = changeable;
  }

  public static void approveApplication(PositionApplication application) {
    ApplicationStatus applicationStatus = fromString(application.getStatus());
    if (applicationStatus.changeable) {
      application.setStatus(APPROVED.status);
    }
  }

  public static void declineApplication(PositionApplication application) {
    ApplicationStatus applicationStatus = fromString(application.getStatus());
    if (applicationStatus.changeable) {
      application.setStatus(DECLINED.status);
    }
  }

  public static void cancelApplication(PositionApplication application) {
    ApplicationStatus applicationStatus = fromString(application.getStatus());
    if (applicationStatus.changeable) {
      application.setStatus(CANCELLED.status);
    }
  }

  // Static method to get ApplicationStatus by string
  public static ApplicationStatus fromString(String status) {
    for (ApplicationStatus appStatus : ApplicationStatus.values()) {
      if (appStatus.getStatus().equalsIgnoreCase(status)) {
        return appStatus;
      }
    }
    return null;
  }
}
