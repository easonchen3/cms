package com.cm.pojo;

import java.util.ArrayList;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMNameIsNull() {
            addCriterion("m_name is null");
            return (Criteria) this;
        }

        public Criteria andMNameIsNotNull() {
            addCriterion("m_name is not null");
            return (Criteria) this;
        }

        public Criteria andMNameEqualTo(String value) {
            addCriterion("m_name =", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotEqualTo(String value) {
            addCriterion("m_name <>", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThan(String value) {
            addCriterion("m_name >", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameGreaterThanOrEqualTo(String value) {
            addCriterion("m_name >=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThan(String value) {
            addCriterion("m_name <", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLessThanOrEqualTo(String value) {
            addCriterion("m_name <=", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameLike(String value) {
            addCriterion("m_name like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotLike(String value) {
            addCriterion("m_name not like", value, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameIn(List<String> values) {
            addCriterion("m_name in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotIn(List<String> values) {
            addCriterion("m_name not in", values, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameBetween(String value1, String value2) {
            addCriterion("m_name between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMNameNotBetween(String value1, String value2) {
            addCriterion("m_name not between", value1, value2, "mName");
            return (Criteria) this;
        }

        public Criteria andMDescIsNull() {
            addCriterion("m_desc is null");
            return (Criteria) this;
        }

        public Criteria andMDescIsNotNull() {
            addCriterion("m_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMDescEqualTo(String value) {
            addCriterion("m_desc =", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotEqualTo(String value) {
            addCriterion("m_desc <>", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescGreaterThan(String value) {
            addCriterion("m_desc >", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescGreaterThanOrEqualTo(String value) {
            addCriterion("m_desc >=", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescLessThan(String value) {
            addCriterion("m_desc <", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescLessThanOrEqualTo(String value) {
            addCriterion("m_desc <=", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescLike(String value) {
            addCriterion("m_desc like", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotLike(String value) {
            addCriterion("m_desc not like", value, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescIn(List<String> values) {
            addCriterion("m_desc in", values, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotIn(List<String> values) {
            addCriterion("m_desc not in", values, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescBetween(String value1, String value2) {
            addCriterion("m_desc between", value1, value2, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMDescNotBetween(String value1, String value2) {
            addCriterion("m_desc not between", value1, value2, "mDesc");
            return (Criteria) this;
        }

        public Criteria andMSidIsNull() {
            addCriterion("m_sId is null");
            return (Criteria) this;
        }

        public Criteria andMSidIsNotNull() {
            addCriterion("m_sId is not null");
            return (Criteria) this;
        }

        public Criteria andMSidEqualTo(Integer value) {
            addCriterion("m_sId =", value, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidNotEqualTo(Integer value) {
            addCriterion("m_sId <>", value, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidGreaterThan(Integer value) {
            addCriterion("m_sId >", value, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_sId >=", value, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidLessThan(Integer value) {
            addCriterion("m_sId <", value, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidLessThanOrEqualTo(Integer value) {
            addCriterion("m_sId <=", value, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidIn(List<Integer> values) {
            addCriterion("m_sId in", values, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidNotIn(List<Integer> values) {
            addCriterion("m_sId not in", values, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidBetween(Integer value1, Integer value2) {
            addCriterion("m_sId between", value1, value2, "mSid");
            return (Criteria) this;
        }

        public Criteria andMSidNotBetween(Integer value1, Integer value2) {
            addCriterion("m_sId not between", value1, value2, "mSid");
            return (Criteria) this;
        }

        public Criteria andMDateIsNull() {
            addCriterion("m_date is null");
            return (Criteria) this;
        }

        public Criteria andMDateIsNotNull() {
            addCriterion("m_date is not null");
            return (Criteria) this;
        }

        public Criteria andMDateEqualTo(String value) {
            addCriterion("m_date =", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotEqualTo(String value) {
            addCriterion("m_date <>", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThan(String value) {
            addCriterion("m_date >", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateGreaterThanOrEqualTo(String value) {
            addCriterion("m_date >=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThan(String value) {
            addCriterion("m_date <", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLessThanOrEqualTo(String value) {
            addCriterion("m_date <=", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateLike(String value) {
            addCriterion("m_date like", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotLike(String value) {
            addCriterion("m_date not like", value, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateIn(List<String> values) {
            addCriterion("m_date in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotIn(List<String> values) {
            addCriterion("m_date not in", values, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateBetween(String value1, String value2) {
            addCriterion("m_date between", value1, value2, "mDate");
            return (Criteria) this;
        }

        public Criteria andMDateNotBetween(String value1, String value2) {
            addCriterion("m_date not between", value1, value2, "mDate");
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