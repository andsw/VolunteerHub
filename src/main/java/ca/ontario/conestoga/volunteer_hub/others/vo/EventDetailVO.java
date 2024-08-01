package ca.ontario.conestoga.volunteer_hub.others.vo;

import ca.ontario.conestoga.volunteer_hub.entity.Event;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EventDetailVO {
    private Integer id;
    private String title;
    private String subtitle;
    private String descImgLinks;
    private String description;
    private String requiredSkillTags;
    private Integer organizationId;
    private String venue;
    private Date eventStartTime;
    private Date eventEndTime;
    private Date lastEditTime;
    private Date createTime;
    private Integer likesNum;
    private Integer collectionsNum;
    private Integer reviewsNum;
    private String reviewsJson;
    private Integer joinedVolunteerNum;
    private OrganizationVO organization;
    private List<PositionVO> positions;

    public Event toEvent() {
        Event event = new Event();
        event.setId(this.id);
        event.setTitle(this.title);
        event.setSubtitle(this.subtitle);
        event.setDescImgLinks(this.descImgLinks);
        event.setDescription(this.description);
        event.setRequiredSkillTags(this.requiredSkillTags);
        event.setOrganizationId(this.organizationId);
        event.setVenue(this.venue);
        event.setEventStartTime(this.eventStartTime);
        event.setEventEndTime(this.eventEndTime);
        return event;
    }
}
