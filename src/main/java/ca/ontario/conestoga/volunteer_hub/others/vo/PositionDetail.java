package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PositionDetail {
  private String name;
  private String ageRange;
  private String contactName;
  private String contactEmail;
  private Integer eventId;
  private Integer recruitNum;
  private String eventName;

}
