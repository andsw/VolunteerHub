package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrganizationVO {
  private Integer id;
  private String name;
  private String logoUrl;
  private String phone;
  private String email;
  private String officialSiteLink;
  private String address;
  private String city;
  private String province;
  private String country;
  private String postcode;
  private Integer accountId;
}
