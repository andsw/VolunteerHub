package ca.ontario.conestoga.volunteer_hub.others.vo;

import lombok.*;

import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ActivityListItem {
  private int id;
  private String title;
  private String subtitle;
  private String requiredSkillTags;
  private String hostId;
  private String venue;
  private Date activityStartTime;
  private Date activityEndTime;
  private Date lastEditTime;
  private Date createTime;
  private Integer likesNum;
  private Integer collectionsNum;
  private Integer reviewsNum;
  private Integer joinedVolunteerNum;
}
