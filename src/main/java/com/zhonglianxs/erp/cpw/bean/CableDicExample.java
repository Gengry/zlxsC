package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.List;

public class CableDicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableDicExample() {
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

        public Criteria andCableDicEngineIsNull() {
            addCriterion("cable_dic_ENGINE is null");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineIsNotNull() {
            addCriterion("cable_dic_ENGINE is not null");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineEqualTo(Integer value) {
            addCriterion("cable_dic_ENGINE =", value, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineNotEqualTo(Integer value) {
            addCriterion("cable_dic_ENGINE <>", value, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineGreaterThan(Integer value) {
            addCriterion("cable_dic_ENGINE >", value, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineGreaterThanOrEqualTo(Integer value) {
            addCriterion("cable_dic_ENGINE >=", value, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineLessThan(Integer value) {
            addCriterion("cable_dic_ENGINE <", value, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineLessThanOrEqualTo(Integer value) {
            addCriterion("cable_dic_ENGINE <=", value, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineIn(List<Integer> values) {
            addCriterion("cable_dic_ENGINE in", values, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineNotIn(List<Integer> values) {
            addCriterion("cable_dic_ENGINE not in", values, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineBetween(Integer value1, Integer value2) {
            addCriterion("cable_dic_ENGINE between", value1, value2, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicEngineNotBetween(Integer value1, Integer value2) {
            addCriterion("cable_dic_ENGINE not between", value1, value2, "cableDicEngine");
            return (Criteria) this;
        }

        public Criteria andCableDicNameIsNull() {
            addCriterion("cable_dic_name is null");
            return (Criteria) this;
        }

        public Criteria andCableDicNameIsNotNull() {
            addCriterion("cable_dic_name is not null");
            return (Criteria) this;
        }

        public Criteria andCableDicNameEqualTo(String value) {
            addCriterion("cable_dic_name =", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameNotEqualTo(String value) {
            addCriterion("cable_dic_name <>", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameGreaterThan(String value) {
            addCriterion("cable_dic_name >", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameGreaterThanOrEqualTo(String value) {
            addCriterion("cable_dic_name >=", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameLessThan(String value) {
            addCriterion("cable_dic_name <", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameLessThanOrEqualTo(String value) {
            addCriterion("cable_dic_name <=", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameLike(String value) {
            addCriterion("cable_dic_name like", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameNotLike(String value) {
            addCriterion("cable_dic_name not like", value, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameIn(List<String> values) {
            addCriterion("cable_dic_name in", values, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameNotIn(List<String> values) {
            addCriterion("cable_dic_name not in", values, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameBetween(String value1, String value2) {
            addCriterion("cable_dic_name between", value1, value2, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicNameNotBetween(String value1, String value2) {
            addCriterion("cable_dic_name not between", value1, value2, "cableDicName");
            return (Criteria) this;
        }

        public Criteria andCableDicDescIsNull() {
            addCriterion("cable_dic_desc is null");
            return (Criteria) this;
        }

        public Criteria andCableDicDescIsNotNull() {
            addCriterion("cable_dic_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCableDicDescEqualTo(String value) {
            addCriterion("cable_dic_desc =", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescNotEqualTo(String value) {
            addCriterion("cable_dic_desc <>", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescGreaterThan(String value) {
            addCriterion("cable_dic_desc >", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescGreaterThanOrEqualTo(String value) {
            addCriterion("cable_dic_desc >=", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescLessThan(String value) {
            addCriterion("cable_dic_desc <", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescLessThanOrEqualTo(String value) {
            addCriterion("cable_dic_desc <=", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescLike(String value) {
            addCriterion("cable_dic_desc like", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescNotLike(String value) {
            addCriterion("cable_dic_desc not like", value, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescIn(List<String> values) {
            addCriterion("cable_dic_desc in", values, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescNotIn(List<String> values) {
            addCriterion("cable_dic_desc not in", values, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescBetween(String value1, String value2) {
            addCriterion("cable_dic_desc between", value1, value2, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDescNotBetween(String value1, String value2) {
            addCriterion("cable_dic_desc not between", value1, value2, "cableDicDesc");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteIsNull() {
            addCriterion("cable_dic_delete is null");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteIsNotNull() {
            addCriterion("cable_dic_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteEqualTo(Integer value) {
            addCriterion("cable_dic_delete =", value, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteNotEqualTo(Integer value) {
            addCriterion("cable_dic_delete <>", value, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteGreaterThan(Integer value) {
            addCriterion("cable_dic_delete >", value, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("cable_dic_delete >=", value, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteLessThan(Integer value) {
            addCriterion("cable_dic_delete <", value, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("cable_dic_delete <=", value, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteIn(List<Integer> values) {
            addCriterion("cable_dic_delete in", values, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteNotIn(List<Integer> values) {
            addCriterion("cable_dic_delete not in", values, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteBetween(Integer value1, Integer value2) {
            addCriterion("cable_dic_delete between", value1, value2, "cableDicDelete");
            return (Criteria) this;
        }

        public Criteria andCableDicDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("cable_dic_delete not between", value1, value2, "cableDicDelete");
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