package ca.ontario.conestoga.volunteer_hub.others.vo;

import ca.ontario.conestoga.volunteer_hub.entity.Position;
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

  public Position toPosition() {
    Position position = new Position();
    position.setId(this.id);
        position.setName(this.name);
        position.setMinAge(this.minAge);
        position.setMaxAge(this.maxAge);
        position.setIdealFor(this.idealFor);
        position.setContactName(this.contactName);
        position.setContactEmail(this.contactEmail);
        position.setEventId(this.eventId);
        position.setRecruitNum(this.recruitNum);
        position.setTrainingDetail(this.trainingDetail);
        position.setWorkingCondition(this.workingCondition);
        position.setAccessibility(this.accessibility);
        position.setDescription(this.description);
        position.setApplicationAvailableTime(this.applicationAvailableTime);
        position.setApplicationDeadline(this.applicationDeadline);
    return position;
  }
}
