package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CableQualityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableQualityExample() {
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

        public Criteria andQualityUserIdIsNull() {
            addCriterion("quality_user_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdIsNotNull() {
            addCriterion("quality_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdEqualTo(Integer value) {
            addCriterion("quality_user_id =", value, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdNotEqualTo(Integer value) {
            addCriterion("quality_user_id <>", value, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdGreaterThan(Integer value) {
            addCriterion("quality_user_id >", value, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_user_id >=", value, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdLessThan(Integer value) {
            addCriterion("quality_user_id <", value, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("quality_user_id <=", value, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdIn(List<Integer> values) {
            addCriterion("quality_user_id in", values, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdNotIn(List<Integer> values) {
            addCriterion("quality_user_id not in", values, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdBetween(Integer value1, Integer value2) {
            addCriterion("quality_user_id between", value1, value2, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_user_id not between", value1, value2, "qualityUserId");
            return (Criteria) this;
        }

        public Criteria andQualityQualityIsNull() {
            addCriterion("quality_quality is null");
            return (Criteria) this;
        }

        public Criteria andQualityQualityIsNotNull() {
            addCriterion("quality_quality is not null");
            return (Criteria) this;
        }

        public Criteria andQualityQualityEqualTo(String value) {
            addCriterion("quality_quality =", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityNotEqualTo(String value) {
            addCriterion("quality_quality <>", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityGreaterThan(String value) {
            addCriterion("quality_quality >", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityGreaterThanOrEqualTo(String value) {
            addCriterion("quality_quality >=", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityLessThan(String value) {
            addCriterion("quality_quality <", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityLessThanOrEqualTo(String value) {
            addCriterion("quality_quality <=", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityLike(String value) {
            addCriterion("quality_quality like", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityNotLike(String value) {
            addCriterion("quality_quality not like", value, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityIn(List<String> values) {
            addCriterion("quality_quality in", values, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityNotIn(List<String> values) {
            addCriterion("quality_quality not in", values, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityBetween(String value1, String value2) {
            addCriterion("quality_quality between", value1, value2, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityQualityNotBetween(String value1, String value2) {
            addCriterion("quality_quality not between", value1, value2, "qualityQuality");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIsNull() {
            addCriterion("quality_time is null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIsNotNull() {
            addCriterion("quality_time is not null");
            return (Criteria) this;
        }

        public Criteria andQualityTimeEqualTo(Date value) {
            addCriterion("quality_time =", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotEqualTo(Date value) {
            addCriterion("quality_time <>", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeGreaterThan(Date value) {
            addCriterion("quality_time >", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("quality_time >=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeLessThan(Date value) {
            addCriterion("quality_time <", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeLessThanOrEqualTo(Date value) {
            addCriterion("quality_time <=", value, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeIn(List<Date> values) {
            addCriterion("quality_time in", values, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotIn(List<Date> values) {
            addCriterion("quality_time not in", values, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeBetween(Date value1, Date value2) {
            addCriterion("quality_time between", value1, value2, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityTimeNotBetween(Date value1, Date value2) {
            addCriterion("quality_time not between", value1, value2, "qualityTime");
            return (Criteria) this;
        }

        public Criteria andQualityDescIsNull() {
            addCriterion("quality_desc is null");
            return (Criteria) this;
        }

        public Criteria andQualityDescIsNotNull() {
            addCriterion("quality_desc is not null");
            return (Criteria) this;
        }

        public Criteria andQualityDescEqualTo(String value) {
            addCriterion("quality_desc =", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescNotEqualTo(String value) {
            addCriterion("quality_desc <>", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescGreaterThan(String value) {
            addCriterion("quality_desc >", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescGreaterThanOrEqualTo(String value) {
            addCriterion("quality_desc >=", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescLessThan(String value) {
            addCriterion("quality_desc <", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescLessThanOrEqualTo(String value) {
            addCriterion("quality_desc <=", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescLike(String value) {
            addCriterion("quality_desc like", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescNotLike(String value) {
            addCriterion("quality_desc not like", value, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescIn(List<String> values) {
            addCriterion("quality_desc in", values, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescNotIn(List<String> values) {
            addCriterion("quality_desc not in", values, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescBetween(String value1, String value2) {
            addCriterion("quality_desc between", value1, value2, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDescNotBetween(String value1, String value2) {
            addCriterion("quality_desc not between", value1, value2, "qualityDesc");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteIsNull() {
            addCriterion("quality_delete is null");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteIsNotNull() {
            addCriterion("quality_delete is not null");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteEqualTo(Integer value) {
            addCriterion("quality_delete =", value, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteNotEqualTo(Integer value) {
            addCriterion("quality_delete <>", value, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteGreaterThan(Integer value) {
            addCriterion("quality_delete >", value, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("quality_delete >=", value, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteLessThan(Integer value) {
            addCriterion("quality_delete <", value, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("quality_delete <=", value, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteIn(List<Integer> values) {
            addCriterion("quality_delete in", values, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteNotIn(List<Integer> values) {
            addCriterion("quality_delete not in", values, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteBetween(Integer value1, Integer value2) {
            addCriterion("quality_delete between", value1, value2, "qualityDelete");
            return (Criteria) this;
        }

        public Criteria andQualityDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("quality_delete not between", value1, value2, "qualityDelete");
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