package ca.ontario.conestoga.volunteer_hub.others.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PositionApplicationDTO {
  private Integer volunteerId;
  private Integer positionId;
}
