package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

import java.util.Date;

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
  private Integer recruitedNum;
  private String trainingDetail;
  private String workingCondition;
  private String accessibility;
  private String description;
  private Date applicationAvailableTime;
  private Date applicationDeadline;
  private EventDetailVO event;
  private OrganizationVO organization;
}
