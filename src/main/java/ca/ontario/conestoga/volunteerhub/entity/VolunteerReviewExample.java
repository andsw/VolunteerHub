package ca.ontario.conestoga.volunteerhub.entity;

import java.util.ArrayList;
import java.util.List;

public class VolunteerReviewExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public VolunteerReviewExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
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

        public Criteria andVolunteeridIsNull() {
            addCriterion("volunteerId is null");
            return (Criteria) this;
        }

        public Criteria andVolunteeridIsNotNull() {
            addCriterion("volunteerId is not null");
            return (Criteria) this;
        }

        public Criteria andVolunteeridEqualTo(Integer value) {
            addCriterion("volunteerId =", value, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridNotEqualTo(Integer value) {
            addCriterion("volunteerId <>", value, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridGreaterThan(Integer value) {
            addCriterion("volunteerId >", value, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridGreaterThanOrEqualTo(Integer value) {
            addCriterion("volunteerId >=", value, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridLessThan(Integer value) {
            addCriterion("volunteerId <", value, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridLessThanOrEqualTo(Integer value) {
            addCriterion("volunteerId <=", value, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridIn(List<Integer> values) {
            addCriterion("volunteerId in", values, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridNotIn(List<Integer> values) {
            addCriterion("volunteerId not in", values, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridBetween(Integer value1, Integer value2) {
            addCriterion("volunteerId between", value1, value2, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andVolunteeridNotBetween(Integer value1, Integer value2) {
            addCriterion("volunteerId not between", value1, value2, "volunteerid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNull() {
            addCriterion("organizationId is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("organizationId is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(String value) {
            addCriterion("organizationId =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(String value) {
            addCriterion("organizationId <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(String value) {
            addCriterion("organizationId >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(String value) {
            addCriterion("organizationId >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(String value) {
            addCriterion("organizationId <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(String value) {
            addCriterion("organizationId <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLike(String value) {
            addCriterion("organizationId like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotLike(String value) {
            addCriterion("organizationId not like", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<String> values) {
            addCriterion("organizationId in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<String> values) {
            addCriterion("organizationId not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(String value1, String value2) {
            addCriterion("organizationId between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(String value1, String value2) {
            addCriterion("organizationId not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNull() {
            addCriterion("organizationName is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIsNotNull() {
            addCriterion("organizationName is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameEqualTo(String value) {
            addCriterion("organizationName =", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotEqualTo(String value) {
            addCriterion("organizationName <>", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThan(String value) {
            addCriterion("organizationName >", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameGreaterThanOrEqualTo(String value) {
            addCriterion("organizationName >=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThan(String value) {
            addCriterion("organizationName <", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLessThanOrEqualTo(String value) {
            addCriterion("organizationName <=", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameLike(String value) {
            addCriterion("organizationName like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotLike(String value) {
            addCriterion("organizationName not like", value, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameIn(List<String> values) {
            addCriterion("organizationName in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotIn(List<String> values) {
            addCriterion("organizationName not in", values, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameBetween(String value1, String value2) {
            addCriterion("organizationName between", value1, value2, "organizationname");
            return (Criteria) this;
        }

        public Criteria andOrganizationnameNotBetween(String value1, String value2) {
            addCriterion("organizationName not between", value1, value2, "organizationname");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table volunteer_review
     *
     * @mbg.generated do_not_delete_during_merge Fri Jun 14 13:55:17 EDT 2024
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table volunteer_review
     *
     * @mbg.generated Fri Jun 14 13:55:17 EDT 2024
     */
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