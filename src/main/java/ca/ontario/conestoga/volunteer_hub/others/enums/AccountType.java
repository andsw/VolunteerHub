package ca.ontario.conestoga.volunteer_hub.others.enums;

import lombok.Getter;

@Getter
public enum AccountType {

  VOLUNTEER("volunteer"),
  ORGANIZATION("organization"),
  ADMIN("admin");
  private final String name;
  AccountType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  public static boolean isVolunteer(String type) {
    AccountType accountType = AccountType.fromString(type);
    return accountType == VOLUNTEER;
  }

  public static boolean isOrganization(String type) {
    AccountType accountType = AccountType.fromString(type);
    return accountType == ORGANIZATION;
  }

    public static AccountType fromString(String type) {
    for (AccountType accountType : AccountType.values()) {
      if (accountType.getName().equalsIgnoreCase(type)) {
        return accountType;
      }
    }
    return null;
  }
}
