package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EventListItem {
  private int id;
  private String title;
  private String subtitle;
  private String requiredSkillTags;
  private String organizationId;
  private String organizationName;
  private String venue;
  private Date eventStartTime;
  private Date eventEndTime;
  private Date lastEditTime;
  private Date createTime;
  private Integer likesNum;
  private Integer collectionsNum;
  private Integer reviewsNum;
  private Integer joinedVolunteerNum;
}
