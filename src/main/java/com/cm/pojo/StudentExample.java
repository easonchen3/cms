package com.cm.pojo;

import java.util.ArrayList;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andSIdIsNull() {
            addCriterion("s_id is null");
            return (Criteria) this;
        }

        public Criteria andSIdIsNotNull() {
            addCriterion("s_id is not null");
            return (Criteria) this;
        }

        public Criteria andSIdEqualTo(Integer value) {
            addCriterion("s_id =", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotEqualTo(Integer value) {
            addCriterion("s_id <>", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThan(Integer value) {
            addCriterion("s_id >", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_id >=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThan(Integer value) {
            addCriterion("s_id <", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdLessThanOrEqualTo(Integer value) {
            addCriterion("s_id <=", value, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdIn(List<Integer> values) {
            addCriterion("s_id in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotIn(List<Integer> values) {
            addCriterion("s_id not in", values, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdBetween(Integer value1, Integer value2) {
            addCriterion("s_id between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSIdNotBetween(Integer value1, Integer value2) {
            addCriterion("s_id not between", value1, value2, "sId");
            return (Criteria) this;
        }

        public Criteria andSUsernameIsNull() {
            addCriterion("s_username is null");
            return (Criteria) this;
        }

        public Criteria andSUsernameIsNotNull() {
            addCriterion("s_username is not null");
            return (Criteria) this;
        }

        public Criteria andSUsernameEqualTo(String value) {
            addCriterion("s_username =", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotEqualTo(String value) {
            addCriterion("s_username <>", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameGreaterThan(String value) {
            addCriterion("s_username >", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("s_username >=", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameLessThan(String value) {
            addCriterion("s_username <", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameLessThanOrEqualTo(String value) {
            addCriterion("s_username <=", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameLike(String value) {
            addCriterion("s_username like", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotLike(String value) {
            addCriterion("s_username not like", value, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameIn(List<String> values) {
            addCriterion("s_username in", values, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotIn(List<String> values) {
            addCriterion("s_username not in", values, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameBetween(String value1, String value2) {
            addCriterion("s_username between", value1, value2, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSUsernameNotBetween(String value1, String value2) {
            addCriterion("s_username not between", value1, value2, "sUsername");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("s_name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("s_name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("s_name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("s_name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("s_name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("s_name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("s_name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("s_name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("s_name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("s_name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("s_name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("s_name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("s_name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("s_name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNull() {
            addCriterion("s_password is null");
            return (Criteria) this;
        }

        public Criteria andSPasswordIsNotNull() {
            addCriterion("s_password is not null");
            return (Criteria) this;
        }

        public Criteria andSPasswordEqualTo(String value) {
            addCriterion("s_password =", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotEqualTo(String value) {
            addCriterion("s_password <>", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThan(String value) {
            addCriterion("s_password >", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("s_password >=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThan(String value) {
            addCriterion("s_password <", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLessThanOrEqualTo(String value) {
            addCriterion("s_password <=", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordLike(String value) {
            addCriterion("s_password like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotLike(String value) {
            addCriterion("s_password not like", value, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordIn(List<String> values) {
            addCriterion("s_password in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotIn(List<String> values) {
            addCriterion("s_password not in", values, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordBetween(String value1, String value2) {
            addCriterion("s_password between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSPasswordNotBetween(String value1, String value2) {
            addCriterion("s_password not between", value1, value2, "sPassword");
            return (Criteria) this;
        }

        public Criteria andSClassidIsNull() {
            addCriterion("s_classId is null");
            return (Criteria) this;
        }

        public Criteria andSClassidIsNotNull() {
            addCriterion("s_classId is not null");
            return (Criteria) this;
        }

        public Criteria andSClassidEqualTo(Integer value) {
            addCriterion("s_classId =", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidNotEqualTo(Integer value) {
            addCriterion("s_classId <>", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidGreaterThan(Integer value) {
            addCriterion("s_classId >", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_classId >=", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidLessThan(Integer value) {
            addCriterion("s_classId <", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidLessThanOrEqualTo(Integer value) {
            addCriterion("s_classId <=", value, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidIn(List<Integer> values) {
            addCriterion("s_classId in", values, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidNotIn(List<Integer> values) {
            addCriterion("s_classId not in", values, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidBetween(Integer value1, Integer value2) {
            addCriterion("s_classId between", value1, value2, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSClassidNotBetween(Integer value1, Integer value2) {
            addCriterion("s_classId not between", value1, value2, "sClassid");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNull() {
            addCriterion("s_email is null");
            return (Criteria) this;
        }

        public Criteria andSEmailIsNotNull() {
            addCriterion("s_email is not null");
            return (Criteria) this;
        }

        public Criteria andSEmailEqualTo(String value) {
            addCriterion("s_email =", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotEqualTo(String value) {
            addCriterion("s_email <>", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThan(String value) {
            addCriterion("s_email >", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailGreaterThanOrEqualTo(String value) {
            addCriterion("s_email >=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThan(String value) {
            addCriterion("s_email <", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLessThanOrEqualTo(String value) {
            addCriterion("s_email <=", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailLike(String value) {
            addCriterion("s_email like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotLike(String value) {
            addCriterion("s_email not like", value, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailIn(List<String> values) {
            addCriterion("s_email in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotIn(List<String> values) {
            addCriterion("s_email not in", values, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailBetween(String value1, String value2) {
            addCriterion("s_email between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSEmailNotBetween(String value1, String value2) {
            addCriterion("s_email not between", value1, value2, "sEmail");
            return (Criteria) this;
        }

        public Criteria andSGenderIsNull() {
            addCriterion("s_gender is null");
            return (Criteria) this;
        }

        public Criteria andSGenderIsNotNull() {
            addCriterion("s_gender is not null");
            return (Criteria) this;
        }

        public Criteria andSGenderEqualTo(String value) {
            addCriterion("s_gender =", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotEqualTo(String value) {
            addCriterion("s_gender <>", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderGreaterThan(String value) {
            addCriterion("s_gender >", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderGreaterThanOrEqualTo(String value) {
            addCriterion("s_gender >=", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLessThan(String value) {
            addCriterion("s_gender <", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLessThanOrEqualTo(String value) {
            addCriterion("s_gender <=", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderLike(String value) {
            addCriterion("s_gender like", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotLike(String value) {
            addCriterion("s_gender not like", value, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderIn(List<String> values) {
            addCriterion("s_gender in", values, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotIn(List<String> values) {
            addCriterion("s_gender not in", values, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderBetween(String value1, String value2) {
            addCriterion("s_gender between", value1, value2, "sGender");
            return (Criteria) this;
        }

        public Criteria andSGenderNotBetween(String value1, String value2) {
            addCriterion("s_gender not between", value1, value2, "sGender");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNull() {
            addCriterion("s_type is null");
            return (Criteria) this;
        }

        public Criteria andSTypeIsNotNull() {
            addCriterion("s_type is not null");
            return (Criteria) this;
        }

        public Criteria andSTypeEqualTo(Integer value) {
            addCriterion("s_type =", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotEqualTo(Integer value) {
            addCriterion("s_type <>", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThan(Integer value) {
            addCriterion("s_type >", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_type >=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThan(Integer value) {
            addCriterion("s_type <", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeLessThanOrEqualTo(Integer value) {
            addCriterion("s_type <=", value, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeIn(List<Integer> values) {
            addCriterion("s_type in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotIn(List<Integer> values) {
            addCriterion("s_type not in", values, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeBetween(Integer value1, Integer value2) {
            addCriterion("s_type between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("s_type not between", value1, value2, "sType");
            return (Criteria) this;
        }

        public Criteria andSTelIsNull() {
            addCriterion("s_tel is null");
            return (Criteria) this;
        }

        public Criteria andSTelIsNotNull() {
            addCriterion("s_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSTelEqualTo(String value) {
            addCriterion("s_tel =", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotEqualTo(String value) {
            addCriterion("s_tel <>", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThan(String value) {
            addCriterion("s_tel >", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelGreaterThanOrEqualTo(String value) {
            addCriterion("s_tel >=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThan(String value) {
            addCriterion("s_tel <", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLessThanOrEqualTo(String value) {
            addCriterion("s_tel <=", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelLike(String value) {
            addCriterion("s_tel like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotLike(String value) {
            addCriterion("s_tel not like", value, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelIn(List<String> values) {
            addCriterion("s_tel in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotIn(List<String> values) {
            addCriterion("s_tel not in", values, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelBetween(String value1, String value2) {
            addCriterion("s_tel between", value1, value2, "sTel");
            return (Criteria) this;
        }

        public Criteria andSTelNotBetween(String value1, String value2) {
            addCriterion("s_tel not between", value1, value2, "sTel");
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