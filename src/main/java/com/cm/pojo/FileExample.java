package com.cm.pojo;

import java.util.ArrayList;
import java.util.List;

public class FileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileExample() {
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFPathIsNull() {
            addCriterion("f_path is null");
            return (Criteria) this;
        }

        public Criteria andFPathIsNotNull() {
            addCriterion("f_path is not null");
            return (Criteria) this;
        }

        public Criteria andFPathEqualTo(String value) {
            addCriterion("f_path =", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotEqualTo(String value) {
            addCriterion("f_path <>", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathGreaterThan(String value) {
            addCriterion("f_path >", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathGreaterThanOrEqualTo(String value) {
            addCriterion("f_path >=", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathLessThan(String value) {
            addCriterion("f_path <", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathLessThanOrEqualTo(String value) {
            addCriterion("f_path <=", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathLike(String value) {
            addCriterion("f_path like", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotLike(String value) {
            addCriterion("f_path not like", value, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathIn(List<String> values) {
            addCriterion("f_path in", values, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotIn(List<String> values) {
            addCriterion("f_path not in", values, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathBetween(String value1, String value2) {
            addCriterion("f_path between", value1, value2, "fPath");
            return (Criteria) this;
        }

        public Criteria andFPathNotBetween(String value1, String value2) {
            addCriterion("f_path not between", value1, value2, "fPath");
            return (Criteria) this;
        }

        public Criteria andFDescIsNull() {
            addCriterion("f_desc is null");
            return (Criteria) this;
        }

        public Criteria andFDescIsNotNull() {
            addCriterion("f_desc is not null");
            return (Criteria) this;
        }

        public Criteria andFDescEqualTo(String value) {
            addCriterion("f_desc =", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotEqualTo(String value) {
            addCriterion("f_desc <>", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThan(String value) {
            addCriterion("f_desc >", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescGreaterThanOrEqualTo(String value) {
            addCriterion("f_desc >=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThan(String value) {
            addCriterion("f_desc <", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLessThanOrEqualTo(String value) {
            addCriterion("f_desc <=", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescLike(String value) {
            addCriterion("f_desc like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotLike(String value) {
            addCriterion("f_desc not like", value, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescIn(List<String> values) {
            addCriterion("f_desc in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotIn(List<String> values) {
            addCriterion("f_desc not in", values, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescBetween(String value1, String value2) {
            addCriterion("f_desc between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFDescNotBetween(String value1, String value2) {
            addCriterion("f_desc not between", value1, value2, "fDesc");
            return (Criteria) this;
        }

        public Criteria andFSidIsNull() {
            addCriterion("f_sId is null");
            return (Criteria) this;
        }

        public Criteria andFSidIsNotNull() {
            addCriterion("f_sId is not null");
            return (Criteria) this;
        }

        public Criteria andFSidEqualTo(Integer value) {
            addCriterion("f_sId =", value, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidNotEqualTo(Integer value) {
            addCriterion("f_sId <>", value, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidGreaterThan(Integer value) {
            addCriterion("f_sId >", value, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_sId >=", value, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidLessThan(Integer value) {
            addCriterion("f_sId <", value, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidLessThanOrEqualTo(Integer value) {
            addCriterion("f_sId <=", value, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidIn(List<Integer> values) {
            addCriterion("f_sId in", values, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidNotIn(List<Integer> values) {
            addCriterion("f_sId not in", values, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidBetween(Integer value1, Integer value2) {
            addCriterion("f_sId between", value1, value2, "fSid");
            return (Criteria) this;
        }

        public Criteria andFSidNotBetween(Integer value1, Integer value2) {
            addCriterion("f_sId not between", value1, value2, "fSid");
            return (Criteria) this;
        }

        public Criteria andFDateIsNull() {
            addCriterion("f_date is null");
            return (Criteria) this;
        }

        public Criteria andFDateIsNotNull() {
            addCriterion("f_date is not null");
            return (Criteria) this;
        }

        public Criteria andFDateEqualTo(String value) {
            addCriterion("f_date =", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotEqualTo(String value) {
            addCriterion("f_date <>", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThan(String value) {
            addCriterion("f_date >", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateGreaterThanOrEqualTo(String value) {
            addCriterion("f_date >=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThan(String value) {
            addCriterion("f_date <", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLessThanOrEqualTo(String value) {
            addCriterion("f_date <=", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateLike(String value) {
            addCriterion("f_date like", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotLike(String value) {
            addCriterion("f_date not like", value, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateIn(List<String> values) {
            addCriterion("f_date in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotIn(List<String> values) {
            addCriterion("f_date not in", values, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateBetween(String value1, String value2) {
            addCriterion("f_date between", value1, value2, "fDate");
            return (Criteria) this;
        }

        public Criteria andFDateNotBetween(String value1, String value2) {
            addCriterion("f_date not between", value1, value2, "fDate");
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