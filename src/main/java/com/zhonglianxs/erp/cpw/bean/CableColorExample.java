package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CableColorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableColorExample() {
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

        public Criteria andColorUserIdIsNull() {
            addCriterion("color_user_id is null");
            return (Criteria) this;
        }

        public Criteria andColorUserIdIsNotNull() {
            addCriterion("color_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorUserIdEqualTo(Integer value) {
            addCriterion("color_user_id =", value, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdNotEqualTo(Integer value) {
            addCriterion("color_user_id <>", value, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdGreaterThan(Integer value) {
            addCriterion("color_user_id >", value, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("color_user_id >=", value, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdLessThan(Integer value) {
            addCriterion("color_user_id <", value, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("color_user_id <=", value, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdIn(List<Integer> values) {
            addCriterion("color_user_id in", values, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdNotIn(List<Integer> values) {
            addCriterion("color_user_id not in", values, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdBetween(Integer value1, Integer value2) {
            addCriterion("color_user_id between", value1, value2, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("color_user_id not between", value1, value2, "colorUserId");
            return (Criteria) this;
        }

        public Criteria andColorColorIsNull() {
            addCriterion("color_color is null");
            return (Criteria) this;
        }

        public Criteria andColorColorIsNotNull() {
            addCriterion("color_color is not null");
            return (Criteria) this;
        }

        public Criteria andColorColorEqualTo(String value) {
            addCriterion("color_color =", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorNotEqualTo(String value) {
            addCriterion("color_color <>", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorGreaterThan(String value) {
            addCriterion("color_color >", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorGreaterThanOrEqualTo(String value) {
            addCriterion("color_color >=", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorLessThan(String value) {
            addCriterion("color_color <", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorLessThanOrEqualTo(String value) {
            addCriterion("color_color <=", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorLike(String value) {
            addCriterion("color_color like", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorNotLike(String value) {
            addCriterion("color_color not like", value, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorIn(List<String> values) {
            addCriterion("color_color in", values, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorNotIn(List<String> values) {
            addCriterion("color_color not in", values, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorBetween(String value1, String value2) {
            addCriterion("color_color between", value1, value2, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorColorNotBetween(String value1, String value2) {
            addCriterion("color_color not between", value1, value2, "colorColor");
            return (Criteria) this;
        }

        public Criteria andColorTimeIsNull() {
            addCriterion("color_time is null");
            return (Criteria) this;
        }

        public Criteria andColorTimeIsNotNull() {
            addCriterion("color_time is not null");
            return (Criteria) this;
        }

        public Criteria andColorTimeEqualTo(Date value) {
            addCriterion("color_time =", value, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeNotEqualTo(Date value) {
            addCriterion("color_time <>", value, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeGreaterThan(Date value) {
            addCriterion("color_time >", value, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("color_time >=", value, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeLessThan(Date value) {
            addCriterion("color_time <", value, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeLessThanOrEqualTo(Date value) {
            addCriterion("color_time <=", value, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeIn(List<Date> values) {
            addCriterion("color_time in", values, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeNotIn(List<Date> values) {
            addCriterion("color_time not in", values, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeBetween(Date value1, Date value2) {
            addCriterion("color_time between", value1, value2, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorTimeNotBetween(Date value1, Date value2) {
            addCriterion("color_time not between", value1, value2, "colorTime");
            return (Criteria) this;
        }

        public Criteria andColorDescIsNull() {
            addCriterion("color_desc is null");
            return (Criteria) this;
        }

        public Criteria andColorDescIsNotNull() {
            addCriterion("color_desc is not null");
            return (Criteria) this;
        }

        public Criteria andColorDescEqualTo(String value) {
            addCriterion("color_desc =", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotEqualTo(String value) {
            addCriterion("color_desc <>", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescGreaterThan(String value) {
            addCriterion("color_desc >", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescGreaterThanOrEqualTo(String value) {
            addCriterion("color_desc >=", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescLessThan(String value) {
            addCriterion("color_desc <", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescLessThanOrEqualTo(String value) {
            addCriterion("color_desc <=", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescLike(String value) {
            addCriterion("color_desc like", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotLike(String value) {
            addCriterion("color_desc not like", value, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescIn(List<String> values) {
            addCriterion("color_desc in", values, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotIn(List<String> values) {
            addCriterion("color_desc not in", values, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescBetween(String value1, String value2) {
            addCriterion("color_desc between", value1, value2, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDescNotBetween(String value1, String value2) {
            addCriterion("color_desc not between", value1, value2, "colorDesc");
            return (Criteria) this;
        }

        public Criteria andColorDeleteIsNull() {
            addCriterion("color_delete is null");
            return (Criteria) this;
        }

        public Criteria andColorDeleteIsNotNull() {
            addCriterion("color_delete is not null");
            return (Criteria) this;
        }

        public Criteria andColorDeleteEqualTo(Integer value) {
            addCriterion("color_delete =", value, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteNotEqualTo(Integer value) {
            addCriterion("color_delete <>", value, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteGreaterThan(Integer value) {
            addCriterion("color_delete >", value, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("color_delete >=", value, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteLessThan(Integer value) {
            addCriterion("color_delete <", value, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("color_delete <=", value, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteIn(List<Integer> values) {
            addCriterion("color_delete in", values, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteNotIn(List<Integer> values) {
            addCriterion("color_delete not in", values, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteBetween(Integer value1, Integer value2) {
            addCriterion("color_delete between", value1, value2, "colorDelete");
            return (Criteria) this;
        }

        public Criteria andColorDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("color_delete not between", value1, value2, "colorDelete");
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