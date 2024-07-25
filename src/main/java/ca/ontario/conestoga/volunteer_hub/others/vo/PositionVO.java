package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PositionVO {
  private Integer id;
  private String name;
  private Integer minAge;
  private Integer maxAge;
  private String idealFor;
  private String contactName;
  private String contactEmail;
  private Integer eventId;
  private Integer recruitNum;
  private String trainingDetail;
  private String workingCondition;
  private String accessibility;
  private EventDetailVO eventDetailVO;
}
