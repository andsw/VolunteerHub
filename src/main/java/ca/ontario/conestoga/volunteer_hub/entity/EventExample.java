package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EventExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNull() {
            addCriterion("subtitle is null");
            return (Criteria) this;
        }

        public Criteria andSubtitleIsNotNull() {
            addCriterion("subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andSubtitleEqualTo(String value) {
            addCriterion("subtitle =", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotEqualTo(String value) {
            addCriterion("subtitle <>", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThan(String value) {
            addCriterion("subtitle >", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("subtitle >=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThan(String value) {
            addCriterion("subtitle <", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLessThanOrEqualTo(String value) {
            addCriterion("subtitle <=", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleLike(String value) {
            addCriterion("subtitle like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotLike(String value) {
            addCriterion("subtitle not like", value, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleIn(List<String> values) {
            addCriterion("subtitle in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotIn(List<String> values) {
            addCriterion("subtitle not in", values, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleBetween(String value1, String value2) {
            addCriterion("subtitle between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andSubtitleNotBetween(String value1, String value2) {
            addCriterion("subtitle not between", value1, value2, "subtitle");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksIsNull() {
            addCriterion("desc_img_links is null");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksIsNotNull() {
            addCriterion("desc_img_links is not null");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksEqualTo(String value) {
            addCriterion("desc_img_links =", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksNotEqualTo(String value) {
            addCriterion("desc_img_links <>", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksGreaterThan(String value) {
            addCriterion("desc_img_links >", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksGreaterThanOrEqualTo(String value) {
            addCriterion("desc_img_links >=", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksLessThan(String value) {
            addCriterion("desc_img_links <", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksLessThanOrEqualTo(String value) {
            addCriterion("desc_img_links <=", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksLike(String value) {
            addCriterion("desc_img_links like", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksNotLike(String value) {
            addCriterion("desc_img_links not like", value, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksIn(List<String> values) {
            addCriterion("desc_img_links in", values, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksNotIn(List<String> values) {
            addCriterion("desc_img_links not in", values, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksBetween(String value1, String value2) {
            addCriterion("desc_img_links between", value1, value2, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescImgLinksNotBetween(String value1, String value2) {
            addCriterion("desc_img_links not between", value1, value2, "descImgLinks");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsIsNull() {
            addCriterion("required_skill_tags is null");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsIsNotNull() {
            addCriterion("required_skill_tags is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsEqualTo(String value) {
            addCriterion("required_skill_tags =", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsNotEqualTo(String value) {
            addCriterion("required_skill_tags <>", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsGreaterThan(String value) {
            addCriterion("required_skill_tags >", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsGreaterThanOrEqualTo(String value) {
            addCriterion("required_skill_tags >=", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsLessThan(String value) {
            addCriterion("required_skill_tags <", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsLessThanOrEqualTo(String value) {
            addCriterion("required_skill_tags <=", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsLike(String value) {
            addCriterion("required_skill_tags like", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsNotLike(String value) {
            addCriterion("required_skill_tags not like", value, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsIn(List<String> values) {
            addCriterion("required_skill_tags in", values, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsNotIn(List<String> values) {
            addCriterion("required_skill_tags not in", values, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsBetween(String value1, String value2) {
            addCriterion("required_skill_tags between", value1, value2, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andRequiredSkillTagsNotBetween(String value1, String value2) {
            addCriterion("required_skill_tags not between", value1, value2, "requiredSkillTags");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Integer value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Integer value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Integer value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Integer value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Integer value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Integer> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Integer> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Integer value1, Integer value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andVenueIsNull() {
            addCriterion("venue is null");
            return (Criteria) this;
        }

        public Criteria andVenueIsNotNull() {
            addCriterion("venue is not null");
            return (Criteria) this;
        }

        public Criteria andVenueEqualTo(String value) {
            addCriterion("venue =", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotEqualTo(String value) {
            addCriterion("venue <>", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueGreaterThan(String value) {
            addCriterion("venue >", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueGreaterThanOrEqualTo(String value) {
            addCriterion("venue >=", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueLessThan(String value) {
            addCriterion("venue <", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueLessThanOrEqualTo(String value) {
            addCriterion("venue <=", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueLike(String value) {
            addCriterion("venue like", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotLike(String value) {
            addCriterion("venue not like", value, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueIn(List<String> values) {
            addCriterion("venue in", values, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotIn(List<String> values) {
            addCriterion("venue not in", values, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueBetween(String value1, String value2) {
            addCriterion("venue between", value1, value2, "venue");
            return (Criteria) this;
        }

        public Criteria andVenueNotBetween(String value1, String value2) {
            addCriterion("venue not between", value1, value2, "venue");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNull() {
            addCriterion("event_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIsNotNull() {
            addCriterion("event_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeEqualTo(Date value) {
            addCriterion("event_start_time =", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotEqualTo(Date value) {
            addCriterion("event_start_time <>", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThan(Date value) {
            addCriterion("event_start_time >", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_start_time >=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThan(Date value) {
            addCriterion("event_start_time <", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_start_time <=", value, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeIn(List<Date> values) {
            addCriterion("event_start_time in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotIn(List<Date> values) {
            addCriterion("event_start_time not in", values, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeBetween(Date value1, Date value2) {
            addCriterion("event_start_time between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_start_time not between", value1, value2, "eventStartTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeIsNull() {
            addCriterion("event_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeIsNotNull() {
            addCriterion("event_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeEqualTo(Date value) {
            addCriterion("event_end_time =", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeNotEqualTo(Date value) {
            addCriterion("event_end_time <>", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeGreaterThan(Date value) {
            addCriterion("event_end_time >", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("event_end_time >=", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeLessThan(Date value) {
            addCriterion("event_end_time <", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("event_end_time <=", value, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeIn(List<Date> values) {
            addCriterion("event_end_time in", values, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeNotIn(List<Date> values) {
            addCriterion("event_end_time not in", values, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeBetween(Date value1, Date value2) {
            addCriterion("event_end_time between", value1, value2, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andEventEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("event_end_time not between", value1, value2, "eventEndTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNull() {
            addCriterion("last_edit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIsNotNull() {
            addCriterion("last_edit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeEqualTo(Date value) {
            addCriterion("last_edit_time =", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotEqualTo(Date value) {
            addCriterion("last_edit_time <>", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThan(Date value) {
            addCriterion("last_edit_time >", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_edit_time >=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThan(Date value) {
            addCriterion("last_edit_time <", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_edit_time <=", value, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeIn(List<Date> values) {
            addCriterion("last_edit_time in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotIn(List<Date> values) {
            addCriterion("last_edit_time not in", values, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeBetween(Date value1, Date value2) {
            addCriterion("last_edit_time between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andLastEditTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_edit_time not between", value1, value2, "lastEditTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andLikesNumIsNull() {
            addCriterion("likes_num is null");
            return (Criteria) this;
        }

        public Criteria andLikesNumIsNotNull() {
            addCriterion("likes_num is not null");
            return (Criteria) this;
        }

        public Criteria andLikesNumEqualTo(Integer value) {
            addCriterion("likes_num =", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotEqualTo(Integer value) {
            addCriterion("likes_num <>", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumGreaterThan(Integer value) {
            addCriterion("likes_num >", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes_num >=", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumLessThan(Integer value) {
            addCriterion("likes_num <", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumLessThanOrEqualTo(Integer value) {
            addCriterion("likes_num <=", value, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumIn(List<Integer> values) {
            addCriterion("likes_num in", values, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotIn(List<Integer> values) {
            addCriterion("likes_num not in", values, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumBetween(Integer value1, Integer value2) {
            addCriterion("likes_num between", value1, value2, "likesNum");
            return (Criteria) this;
        }

        public Criteria andLikesNumNotBetween(Integer value1, Integer value2) {
            addCriterion("likes_num not between", value1, value2, "likesNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumIsNull() {
            addCriterion("collections_num is null");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumIsNotNull() {
            addCriterion("collections_num is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumEqualTo(Integer value) {
            addCriterion("collections_num =", value, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumNotEqualTo(Integer value) {
            addCriterion("collections_num <>", value, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumGreaterThan(Integer value) {
            addCriterion("collections_num >", value, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("collections_num >=", value, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumLessThan(Integer value) {
            addCriterion("collections_num <", value, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumLessThanOrEqualTo(Integer value) {
            addCriterion("collections_num <=", value, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumIn(List<Integer> values) {
            addCriterion("collections_num in", values, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumNotIn(List<Integer> values) {
            addCriterion("collections_num not in", values, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumBetween(Integer value1, Integer value2) {
            addCriterion("collections_num between", value1, value2, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andCollectionsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("collections_num not between", value1, value2, "collectionsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumIsNull() {
            addCriterion("reviews_num is null");
            return (Criteria) this;
        }

        public Criteria andReviewsNumIsNotNull() {
            addCriterion("reviews_num is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsNumEqualTo(Integer value) {
            addCriterion("reviews_num =", value, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumNotEqualTo(Integer value) {
            addCriterion("reviews_num <>", value, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumGreaterThan(Integer value) {
            addCriterion("reviews_num >", value, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviews_num >=", value, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumLessThan(Integer value) {
            addCriterion("reviews_num <", value, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumLessThanOrEqualTo(Integer value) {
            addCriterion("reviews_num <=", value, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumIn(List<Integer> values) {
            addCriterion("reviews_num in", values, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumNotIn(List<Integer> values) {
            addCriterion("reviews_num not in", values, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumBetween(Integer value1, Integer value2) {
            addCriterion("reviews_num between", value1, value2, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsNumNotBetween(Integer value1, Integer value2) {
            addCriterion("reviews_num not between", value1, value2, "reviewsNum");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonIsNull() {
            addCriterion("reviews_json is null");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonIsNotNull() {
            addCriterion("reviews_json is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonEqualTo(String value) {
            addCriterion("reviews_json =", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonNotEqualTo(String value) {
            addCriterion("reviews_json <>", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonGreaterThan(String value) {
            addCriterion("reviews_json >", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonGreaterThanOrEqualTo(String value) {
            addCriterion("reviews_json >=", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonLessThan(String value) {
            addCriterion("reviews_json <", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonLessThanOrEqualTo(String value) {
            addCriterion("reviews_json <=", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonLike(String value) {
            addCriterion("reviews_json like", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonNotLike(String value) {
            addCriterion("reviews_json not like", value, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonIn(List<String> values) {
            addCriterion("reviews_json in", values, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonNotIn(List<String> values) {
            addCriterion("reviews_json not in", values, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonBetween(String value1, String value2) {
            addCriterion("reviews_json between", value1, value2, "reviewsJson");
            return (Criteria) this;
        }

        public Criteria andReviewsJsonNotBetween(String value1, String value2) {
            addCriterion("reviews_json not between", value1, value2, "reviewsJson");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}