package ca.ontario.conestoga.volunteer_hub.others.enums;

public enum AccountType {

  VOLUNTEER("volunteer"),
  ORGANIZATION("organization"),
  ADMIN("admin");
  private final String name;
  private AccountType(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}
