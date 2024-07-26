package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PositionListItem {
  private Integer id;
  private String name;
  private Integer eventId;
  private String eventName;
  private String organizationId;
  private String organizationName;
  private Integer recruitmentNum;
  private Integer recruitedNum;
  private String logoUrl;
}
