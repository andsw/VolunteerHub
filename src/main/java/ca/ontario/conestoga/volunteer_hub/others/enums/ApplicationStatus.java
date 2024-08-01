package ca.ontario.conestoga.volunteer_hub.others.enums;

import lombok.Getter;

@Getter
public enum ApplicationStatus {
  PENDING("pending", true), APPROVED("approved", false),
  DECLINED("declined", false), UNAVAILABLE("unavailable", false),
  CANCELLED("cancelled", false);
  private final String status;
  private final Boolean changeable;

  ApplicationStatus(String status, Boolean changeable) {
    this.status = status;
    this.changeable = changeable;
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
