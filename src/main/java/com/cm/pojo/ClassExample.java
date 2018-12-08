package com.cm.pojo;

import java.util.ArrayList;
import java.util.List;

public class ClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassExample() {
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

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("c_name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("c_name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("c_name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("c_name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("c_name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("c_name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("c_name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("c_name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("c_name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("c_name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("c_name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("c_name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("c_name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("c_name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCDepartIsNull() {
            addCriterion("c_depart is null");
            return (Criteria) this;
        }

        public Criteria andCDepartIsNotNull() {
            addCriterion("c_depart is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartEqualTo(String value) {
            addCriterion("c_depart =", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartNotEqualTo(String value) {
            addCriterion("c_depart <>", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartGreaterThan(String value) {
            addCriterion("c_depart >", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartGreaterThanOrEqualTo(String value) {
            addCriterion("c_depart >=", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartLessThan(String value) {
            addCriterion("c_depart <", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartLessThanOrEqualTo(String value) {
            addCriterion("c_depart <=", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartLike(String value) {
            addCriterion("c_depart like", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartNotLike(String value) {
            addCriterion("c_depart not like", value, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartIn(List<String> values) {
            addCriterion("c_depart in", values, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartNotIn(List<String> values) {
            addCriterion("c_depart not in", values, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartBetween(String value1, String value2) {
            addCriterion("c_depart between", value1, value2, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCDepartNotBetween(String value1, String value2) {
            addCriterion("c_depart not between", value1, value2, "cDepart");
            return (Criteria) this;
        }

        public Criteria andCCourtIsNull() {
            addCriterion("c_court is null");
            return (Criteria) this;
        }

        public Criteria andCCourtIsNotNull() {
            addCriterion("c_court is not null");
            return (Criteria) this;
        }

        public Criteria andCCourtEqualTo(String value) {
            addCriterion("c_court =", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtNotEqualTo(String value) {
            addCriterion("c_court <>", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtGreaterThan(String value) {
            addCriterion("c_court >", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtGreaterThanOrEqualTo(String value) {
            addCriterion("c_court >=", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtLessThan(String value) {
            addCriterion("c_court <", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtLessThanOrEqualTo(String value) {
            addCriterion("c_court <=", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtLike(String value) {
            addCriterion("c_court like", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtNotLike(String value) {
            addCriterion("c_court not like", value, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtIn(List<String> values) {
            addCriterion("c_court in", values, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtNotIn(List<String> values) {
            addCriterion("c_court not in", values, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtBetween(String value1, String value2) {
            addCriterion("c_court between", value1, value2, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCCourtNotBetween(String value1, String value2) {
            addCriterion("c_court not between", value1, value2, "cCourt");
            return (Criteria) this;
        }

        public Criteria andCDescIsNull() {
            addCriterion("c_desc is null");
            return (Criteria) this;
        }

        public Criteria andCDescIsNotNull() {
            addCriterion("c_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCDescEqualTo(String value) {
            addCriterion("c_desc =", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotEqualTo(String value) {
            addCriterion("c_desc <>", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescGreaterThan(String value) {
            addCriterion("c_desc >", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescGreaterThanOrEqualTo(String value) {
            addCriterion("c_desc >=", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescLessThan(String value) {
            addCriterion("c_desc <", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescLessThanOrEqualTo(String value) {
            addCriterion("c_desc <=", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescLike(String value) {
            addCriterion("c_desc like", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotLike(String value) {
            addCriterion("c_desc not like", value, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescIn(List<String> values) {
            addCriterion("c_desc in", values, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotIn(List<String> values) {
            addCriterion("c_desc not in", values, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescBetween(String value1, String value2) {
            addCriterion("c_desc between", value1, value2, "cDesc");
            return (Criteria) this;
        }

        public Criteria andCDescNotBetween(String value1, String value2) {
            addCriterion("c_desc not between", value1, value2, "cDesc");
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