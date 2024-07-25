package ca.ontario.conestoga.volunteer_hub.entity;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andMinAgeIsNull() {
            addCriterion("min_age is null");
            return (Criteria) this;
        }

        public Criteria andMinAgeIsNotNull() {
            addCriterion("min_age is not null");
            return (Criteria) this;
        }

        public Criteria andMinAgeEqualTo(Integer value) {
            addCriterion("min_age =", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotEqualTo(Integer value) {
            addCriterion("min_age <>", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeGreaterThan(Integer value) {
            addCriterion("min_age >", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_age >=", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeLessThan(Integer value) {
            addCriterion("min_age <", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeLessThanOrEqualTo(Integer value) {
            addCriterion("min_age <=", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeIn(List<Integer> values) {
            addCriterion("min_age in", values, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotIn(List<Integer> values) {
            addCriterion("min_age not in", values, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeBetween(Integer value1, Integer value2) {
            addCriterion("min_age between", value1, value2, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("min_age not between", value1, value2, "minAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIsNull() {
            addCriterion("max_age is null");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIsNotNull() {
            addCriterion("max_age is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAgeEqualTo(Integer value) {
            addCriterion("max_age =", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotEqualTo(Integer value) {
            addCriterion("max_age <>", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeGreaterThan(Integer value) {
            addCriterion("max_age >", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_age >=", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeLessThan(Integer value) {
            addCriterion("max_age <", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeLessThanOrEqualTo(Integer value) {
            addCriterion("max_age <=", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIn(List<Integer> values) {
            addCriterion("max_age in", values, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotIn(List<Integer> values) {
            addCriterion("max_age not in", values, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeBetween(Integer value1, Integer value2) {
            addCriterion("max_age between", value1, value2, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("max_age not between", value1, value2, "maxAge");
            return (Criteria) this;
        }

        public Criteria andIdealForIsNull() {
            addCriterion("ideal_for is null");
            return (Criteria) this;
        }

        public Criteria andIdealForIsNotNull() {
            addCriterion("ideal_for is not null");
            return (Criteria) this;
        }

        public Criteria andIdealForEqualTo(String value) {
            addCriterion("ideal_for =", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForNotEqualTo(String value) {
            addCriterion("ideal_for <>", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForGreaterThan(String value) {
            addCriterion("ideal_for >", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForGreaterThanOrEqualTo(String value) {
            addCriterion("ideal_for >=", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForLessThan(String value) {
            addCriterion("ideal_for <", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForLessThanOrEqualTo(String value) {
            addCriterion("ideal_for <=", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForLike(String value) {
            addCriterion("ideal_for like", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForNotLike(String value) {
            addCriterion("ideal_for not like", value, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForIn(List<String> values) {
            addCriterion("ideal_for in", values, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForNotIn(List<String> values) {
            addCriterion("ideal_for not in", values, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForBetween(String value1, String value2) {
            addCriterion("ideal_for between", value1, value2, "idealFor");
            return (Criteria) this;
        }

        public Criteria andIdealForNotBetween(String value1, String value2) {
            addCriterion("ideal_for not between", value1, value2, "idealFor");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNull() {
            addCriterion("contact_email is null");
            return (Criteria) this;
        }

        public Criteria andContactEmailIsNotNull() {
            addCriterion("contact_email is not null");
            return (Criteria) this;
        }

        public Criteria andContactEmailEqualTo(String value) {
            addCriterion("contact_email =", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotEqualTo(String value) {
            addCriterion("contact_email <>", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThan(String value) {
            addCriterion("contact_email >", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailGreaterThanOrEqualTo(String value) {
            addCriterion("contact_email >=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThan(String value) {
            addCriterion("contact_email <", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLessThanOrEqualTo(String value) {
            addCriterion("contact_email <=", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailLike(String value) {
            addCriterion("contact_email like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotLike(String value) {
            addCriterion("contact_email not like", value, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailIn(List<String> values) {
            addCriterion("contact_email in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotIn(List<String> values) {
            addCriterion("contact_email not in", values, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailBetween(String value1, String value2) {
            addCriterion("contact_email between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andContactEmailNotBetween(String value1, String value2) {
            addCriterion("contact_email not between", value1, value2, "contactEmail");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNull() {
            addCriterion("event_id is null");
            return (Criteria) this;
        }

        public Criteria andEventIdIsNotNull() {
            addCriterion("event_id is not null");
            return (Criteria) this;
        }

        public Criteria andEventIdEqualTo(Integer value) {
            addCriterion("event_id =", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotEqualTo(Integer value) {
            addCriterion("event_id <>", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThan(Integer value) {
            addCriterion("event_id >", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_id >=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThan(Integer value) {
            addCriterion("event_id <", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdLessThanOrEqualTo(Integer value) {
            addCriterion("event_id <=", value, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdIn(List<Integer> values) {
            addCriterion("event_id in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotIn(List<Integer> values) {
            addCriterion("event_id not in", values, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdBetween(Integer value1, Integer value2) {
            addCriterion("event_id between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andEventIdNotBetween(Integer value1, Integer value2) {
            addCriterion("event_id not between", value1, value2, "eventId");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNull() {
            addCriterion("recruit_num is null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIsNotNull() {
            addCriterion("recruit_num is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitNumEqualTo(Integer value) {
            addCriterion("recruit_num =", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotEqualTo(Integer value) {
            addCriterion("recruit_num <>", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThan(Integer value) {
            addCriterion("recruit_num >", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("recruit_num >=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThan(Integer value) {
            addCriterion("recruit_num <", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumLessThanOrEqualTo(Integer value) {
            addCriterion("recruit_num <=", value, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumIn(List<Integer> values) {
            addCriterion("recruit_num in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotIn(List<Integer> values) {
            addCriterion("recruit_num not in", values, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumBetween(Integer value1, Integer value2) {
            addCriterion("recruit_num between", value1, value2, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andRecruitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("recruit_num not between", value1, value2, "recruitNum");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailIsNull() {
            addCriterion("training_detail is null");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailIsNotNull() {
            addCriterion("training_detail is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailEqualTo(String value) {
            addCriterion("training_detail =", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailNotEqualTo(String value) {
            addCriterion("training_detail <>", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailGreaterThan(String value) {
            addCriterion("training_detail >", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailGreaterThanOrEqualTo(String value) {
            addCriterion("training_detail >=", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailLessThan(String value) {
            addCriterion("training_detail <", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailLessThanOrEqualTo(String value) {
            addCriterion("training_detail <=", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailLike(String value) {
            addCriterion("training_detail like", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailNotLike(String value) {
            addCriterion("training_detail not like", value, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailIn(List<String> values) {
            addCriterion("training_detail in", values, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailNotIn(List<String> values) {
            addCriterion("training_detail not in", values, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailBetween(String value1, String value2) {
            addCriterion("training_detail between", value1, value2, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andTrainingDetailNotBetween(String value1, String value2) {
            addCriterion("training_detail not between", value1, value2, "trainingDetail");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionIsNull() {
            addCriterion("working_condition is null");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionIsNotNull() {
            addCriterion("working_condition is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionEqualTo(String value) {
            addCriterion("working_condition =", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotEqualTo(String value) {
            addCriterion("working_condition <>", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionGreaterThan(String value) {
            addCriterion("working_condition >", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionGreaterThanOrEqualTo(String value) {
            addCriterion("working_condition >=", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionLessThan(String value) {
            addCriterion("working_condition <", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionLessThanOrEqualTo(String value) {
            addCriterion("working_condition <=", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionLike(String value) {
            addCriterion("working_condition like", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotLike(String value) {
            addCriterion("working_condition not like", value, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionIn(List<String> values) {
            addCriterion("working_condition in", values, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotIn(List<String> values) {
            addCriterion("working_condition not in", values, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionBetween(String value1, String value2) {
            addCriterion("working_condition between", value1, value2, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andWorkingConditionNotBetween(String value1, String value2) {
            addCriterion("working_condition not between", value1, value2, "workingCondition");
            return (Criteria) this;
        }

        public Criteria andAccessibilityIsNull() {
            addCriterion("accessibility is null");
            return (Criteria) this;
        }

        public Criteria andAccessibilityIsNotNull() {
            addCriterion("accessibility is not null");
            return (Criteria) this;
        }

        public Criteria andAccessibilityEqualTo(String value) {
            addCriterion("accessibility =", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityNotEqualTo(String value) {
            addCriterion("accessibility <>", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityGreaterThan(String value) {
            addCriterion("accessibility >", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityGreaterThanOrEqualTo(String value) {
            addCriterion("accessibility >=", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityLessThan(String value) {
            addCriterion("accessibility <", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityLessThanOrEqualTo(String value) {
            addCriterion("accessibility <=", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityLike(String value) {
            addCriterion("accessibility like", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityNotLike(String value) {
            addCriterion("accessibility not like", value, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityIn(List<String> values) {
            addCriterion("accessibility in", values, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityNotIn(List<String> values) {
            addCriterion("accessibility not in", values, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityBetween(String value1, String value2) {
            addCriterion("accessibility between", value1, value2, "accessibility");
            return (Criteria) this;
        }

        public Criteria andAccessibilityNotBetween(String value1, String value2) {
            addCriterion("accessibility not between", value1, value2, "accessibility");
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