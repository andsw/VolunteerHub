package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PositionApplicationVO {
  private Integer id;
  private Integer volunteerId;
  private String volunteerName;
  private Integer positionId;
  private String positionName;
  private Date applyTime;
  private String status;
  private Integer organizationId;
  private String organizationName;
  private String declinedMsg;
}
