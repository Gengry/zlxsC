package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CableUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableUnitExample() {
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

        public Criteria andUnitUserIdIsNull() {
            addCriterion("unit_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdIsNotNull() {
            addCriterion("unit_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdEqualTo(Integer value) {
            addCriterion("unit_user_id =", value, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdNotEqualTo(Integer value) {
            addCriterion("unit_user_id <>", value, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdGreaterThan(Integer value) {
            addCriterion("unit_user_id >", value, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_user_id >=", value, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdLessThan(Integer value) {
            addCriterion("unit_user_id <", value, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("unit_user_id <=", value, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdIn(List<Integer> values) {
            addCriterion("unit_user_id in", values, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdNotIn(List<Integer> values) {
            addCriterion("unit_user_id not in", values, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdBetween(Integer value1, Integer value2) {
            addCriterion("unit_user_id between", value1, value2, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_user_id not between", value1, value2, "unitUserId");
            return (Criteria) this;
        }

        public Criteria andUnitUnitIsNull() {
            addCriterion("unit_unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitUnitIsNotNull() {
            addCriterion("unit_unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitUnitEqualTo(String value) {
            addCriterion("unit_unit =", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitNotEqualTo(String value) {
            addCriterion("unit_unit <>", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitGreaterThan(String value) {
            addCriterion("unit_unit >", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit_unit >=", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitLessThan(String value) {
            addCriterion("unit_unit <", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitLessThanOrEqualTo(String value) {
            addCriterion("unit_unit <=", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitLike(String value) {
            addCriterion("unit_unit like", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitNotLike(String value) {
            addCriterion("unit_unit not like", value, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitIn(List<String> values) {
            addCriterion("unit_unit in", values, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitNotIn(List<String> values) {
            addCriterion("unit_unit not in", values, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitBetween(String value1, String value2) {
            addCriterion("unit_unit between", value1, value2, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitUnitNotBetween(String value1, String value2) {
            addCriterion("unit_unit not between", value1, value2, "unitUnit");
            return (Criteria) this;
        }

        public Criteria andUnitTimeIsNull() {
            addCriterion("unit_time is null");
            return (Criteria) this;
        }

        public Criteria andUnitTimeIsNotNull() {
            addCriterion("unit_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnitTimeEqualTo(Date value) {
            addCriterion("unit_time =", value, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeNotEqualTo(Date value) {
            addCriterion("unit_time <>", value, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeGreaterThan(Date value) {
            addCriterion("unit_time >", value, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unit_time >=", value, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeLessThan(Date value) {
            addCriterion("unit_time <", value, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeLessThanOrEqualTo(Date value) {
            addCriterion("unit_time <=", value, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeIn(List<Date> values) {
            addCriterion("unit_time in", values, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeNotIn(List<Date> values) {
            addCriterion("unit_time not in", values, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeBetween(Date value1, Date value2) {
            addCriterion("unit_time between", value1, value2, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitTimeNotBetween(Date value1, Date value2) {
            addCriterion("unit_time not between", value1, value2, "unitTime");
            return (Criteria) this;
        }

        public Criteria andUnitDescIsNull() {
            addCriterion("unit_desc is null");
            return (Criteria) this;
        }

        public Criteria andUnitDescIsNotNull() {
            addCriterion("unit_desc is not null");
            return (Criteria) this;
        }

        public Criteria andUnitDescEqualTo(String value) {
            addCriterion("unit_desc =", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescNotEqualTo(String value) {
            addCriterion("unit_desc <>", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescGreaterThan(String value) {
            addCriterion("unit_desc >", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescGreaterThanOrEqualTo(String value) {
            addCriterion("unit_desc >=", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescLessThan(String value) {
            addCriterion("unit_desc <", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescLessThanOrEqualTo(String value) {
            addCriterion("unit_desc <=", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescLike(String value) {
            addCriterion("unit_desc like", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescNotLike(String value) {
            addCriterion("unit_desc not like", value, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescIn(List<String> values) {
            addCriterion("unit_desc in", values, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescNotIn(List<String> values) {
            addCriterion("unit_desc not in", values, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescBetween(String value1, String value2) {
            addCriterion("unit_desc between", value1, value2, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDescNotBetween(String value1, String value2) {
            addCriterion("unit_desc not between", value1, value2, "unitDesc");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteIsNull() {
            addCriterion("unit_delete is null");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteIsNotNull() {
            addCriterion("unit_delete is not null");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteEqualTo(Integer value) {
            addCriterion("unit_delete =", value, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteNotEqualTo(Integer value) {
            addCriterion("unit_delete <>", value, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteGreaterThan(Integer value) {
            addCriterion("unit_delete >", value, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit_delete >=", value, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteLessThan(Integer value) {
            addCriterion("unit_delete <", value, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("unit_delete <=", value, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteIn(List<Integer> values) {
            addCriterion("unit_delete in", values, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteNotIn(List<Integer> values) {
            addCriterion("unit_delete not in", values, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteBetween(Integer value1, Integer value2) {
            addCriterion("unit_delete between", value1, value2, "unitDelete");
            return (Criteria) this;
        }

        public Criteria andUnitDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("unit_delete not between", value1, value2, "unitDelete");
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