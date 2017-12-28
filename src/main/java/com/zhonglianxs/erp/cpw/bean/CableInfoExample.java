package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CableInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableInfoExample() {
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

        public Criteria andCableUserIdIsNull() {
            addCriterion("cable_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCableUserIdIsNotNull() {
            addCriterion("cable_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCableUserIdEqualTo(Integer value) {
            addCriterion("cable_user_id =", value, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdNotEqualTo(Integer value) {
            addCriterion("cable_user_id <>", value, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdGreaterThan(Integer value) {
            addCriterion("cable_user_id >", value, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cable_user_id >=", value, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdLessThan(Integer value) {
            addCriterion("cable_user_id <", value, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("cable_user_id <=", value, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdIn(List<Integer> values) {
            addCriterion("cable_user_id in", values, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdNotIn(List<Integer> values) {
            addCriterion("cable_user_id not in", values, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdBetween(Integer value1, Integer value2) {
            addCriterion("cable_user_id between", value1, value2, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cable_user_id not between", value1, value2, "cableUserId");
            return (Criteria) this;
        }

        public Criteria andCableModelIsNull() {
            addCriterion("cable_model is null");
            return (Criteria) this;
        }

        public Criteria andCableModelIsNotNull() {
            addCriterion("cable_model is not null");
            return (Criteria) this;
        }

        public Criteria andCableModelEqualTo(String value) {
            addCriterion("cable_model =", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelNotEqualTo(String value) {
            addCriterion("cable_model <>", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelGreaterThan(String value) {
            addCriterion("cable_model >", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelGreaterThanOrEqualTo(String value) {
            addCriterion("cable_model >=", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelLessThan(String value) {
            addCriterion("cable_model <", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelLessThanOrEqualTo(String value) {
            addCriterion("cable_model <=", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelLike(String value) {
            addCriterion("cable_model like", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelNotLike(String value) {
            addCriterion("cable_model not like", value, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelIn(List<String> values) {
            addCriterion("cable_model in", values, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelNotIn(List<String> values) {
            addCriterion("cable_model not in", values, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelBetween(String value1, String value2) {
            addCriterion("cable_model between", value1, value2, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableModelNotBetween(String value1, String value2) {
            addCriterion("cable_model not between", value1, value2, "cableModel");
            return (Criteria) this;
        }

        public Criteria andCableSpecIsNull() {
            addCriterion("cable_spec is null");
            return (Criteria) this;
        }

        public Criteria andCableSpecIsNotNull() {
            addCriterion("cable_spec is not null");
            return (Criteria) this;
        }

        public Criteria andCableSpecEqualTo(String value) {
            addCriterion("cable_spec =", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecNotEqualTo(String value) {
            addCriterion("cable_spec <>", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecGreaterThan(String value) {
            addCriterion("cable_spec >", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecGreaterThanOrEqualTo(String value) {
            addCriterion("cable_spec >=", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecLessThan(String value) {
            addCriterion("cable_spec <", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecLessThanOrEqualTo(String value) {
            addCriterion("cable_spec <=", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecLike(String value) {
            addCriterion("cable_spec like", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecNotLike(String value) {
            addCriterion("cable_spec not like", value, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecIn(List<String> values) {
            addCriterion("cable_spec in", values, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecNotIn(List<String> values) {
            addCriterion("cable_spec not in", values, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecBetween(String value1, String value2) {
            addCriterion("cable_spec between", value1, value2, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableSpecNotBetween(String value1, String value2) {
            addCriterion("cable_spec not between", value1, value2, "cableSpec");
            return (Criteria) this;
        }

        public Criteria andCableDescIsNull() {
            addCriterion("cable_desc is null");
            return (Criteria) this;
        }

        public Criteria andCableDescIsNotNull() {
            addCriterion("cable_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCableDescEqualTo(String value) {
            addCriterion("cable_desc =", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescNotEqualTo(String value) {
            addCriterion("cable_desc <>", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescGreaterThan(String value) {
            addCriterion("cable_desc >", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescGreaterThanOrEqualTo(String value) {
            addCriterion("cable_desc >=", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescLessThan(String value) {
            addCriterion("cable_desc <", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescLessThanOrEqualTo(String value) {
            addCriterion("cable_desc <=", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescLike(String value) {
            addCriterion("cable_desc like", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescNotLike(String value) {
            addCriterion("cable_desc not like", value, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescIn(List<String> values) {
            addCriterion("cable_desc in", values, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescNotIn(List<String> values) {
            addCriterion("cable_desc not in", values, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescBetween(String value1, String value2) {
            addCriterion("cable_desc between", value1, value2, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCableDescNotBetween(String value1, String value2) {
            addCriterion("cable_desc not between", value1, value2, "cableDesc");
            return (Criteria) this;
        }

        public Criteria andCablePriceIsNull() {
            addCriterion("cable_price is null");
            return (Criteria) this;
        }

        public Criteria andCablePriceIsNotNull() {
            addCriterion("cable_price is not null");
            return (Criteria) this;
        }

        public Criteria andCablePriceEqualTo(BigDecimal value) {
            addCriterion("cable_price =", value, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceNotEqualTo(BigDecimal value) {
            addCriterion("cable_price <>", value, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceGreaterThan(BigDecimal value) {
            addCriterion("cable_price >", value, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cable_price >=", value, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceLessThan(BigDecimal value) {
            addCriterion("cable_price <", value, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cable_price <=", value, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceIn(List<BigDecimal> values) {
            addCriterion("cable_price in", values, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceNotIn(List<BigDecimal> values) {
            addCriterion("cable_price not in", values, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cable_price between", value1, value2, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCablePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cable_price not between", value1, value2, "cablePrice");
            return (Criteria) this;
        }

        public Criteria andCableDeleteIsNull() {
            addCriterion("cable_delete is null");
            return (Criteria) this;
        }

        public Criteria andCableDeleteIsNotNull() {
            addCriterion("cable_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCableDeleteEqualTo(Short value) {
            addCriterion("cable_delete =", value, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteNotEqualTo(Short value) {
            addCriterion("cable_delete <>", value, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteGreaterThan(Short value) {
            addCriterion("cable_delete >", value, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("cable_delete >=", value, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteLessThan(Short value) {
            addCriterion("cable_delete <", value, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteLessThanOrEqualTo(Short value) {
            addCriterion("cable_delete <=", value, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteIn(List<Short> values) {
            addCriterion("cable_delete in", values, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteNotIn(List<Short> values) {
            addCriterion("cable_delete not in", values, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteBetween(Short value1, Short value2) {
            addCriterion("cable_delete between", value1, value2, "cableDelete");
            return (Criteria) this;
        }

        public Criteria andCableDeleteNotBetween(Short value1, Short value2) {
            addCriterion("cable_delete not between", value1, value2, "cableDelete");
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