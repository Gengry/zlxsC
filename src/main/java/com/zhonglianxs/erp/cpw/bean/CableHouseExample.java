package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.List;

public class CableHouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableHouseExample() {
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

        public Criteria andCableHouseUserIdIsNull() {
            addCriterion("cable_house_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdIsNotNull() {
            addCriterion("cable_house_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdEqualTo(Integer value) {
            addCriterion("cable_house_user_id =", value, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdNotEqualTo(Integer value) {
            addCriterion("cable_house_user_id <>", value, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdGreaterThan(Integer value) {
            addCriterion("cable_house_user_id >", value, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cable_house_user_id >=", value, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdLessThan(Integer value) {
            addCriterion("cable_house_user_id <", value, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("cable_house_user_id <=", value, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdIn(List<Integer> values) {
            addCriterion("cable_house_user_id in", values, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdNotIn(List<Integer> values) {
            addCriterion("cable_house_user_id not in", values, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdBetween(Integer value1, Integer value2) {
            addCriterion("cable_house_user_id between", value1, value2, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cable_house_user_id not between", value1, value2, "cableHouseUserId");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameIsNull() {
            addCriterion("cable_house_name is null");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameIsNotNull() {
            addCriterion("cable_house_name is not null");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameEqualTo(String value) {
            addCriterion("cable_house_name =", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameNotEqualTo(String value) {
            addCriterion("cable_house_name <>", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameGreaterThan(String value) {
            addCriterion("cable_house_name >", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("cable_house_name >=", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameLessThan(String value) {
            addCriterion("cable_house_name <", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameLessThanOrEqualTo(String value) {
            addCriterion("cable_house_name <=", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameLike(String value) {
            addCriterion("cable_house_name like", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameNotLike(String value) {
            addCriterion("cable_house_name not like", value, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameIn(List<String> values) {
            addCriterion("cable_house_name in", values, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameNotIn(List<String> values) {
            addCriterion("cable_house_name not in", values, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameBetween(String value1, String value2) {
            addCriterion("cable_house_name between", value1, value2, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseNameNotBetween(String value1, String value2) {
            addCriterion("cable_house_name not between", value1, value2, "cableHouseName");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressIsNull() {
            addCriterion("cable_house_address is null");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressIsNotNull() {
            addCriterion("cable_house_address is not null");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressEqualTo(String value) {
            addCriterion("cable_house_address =", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressNotEqualTo(String value) {
            addCriterion("cable_house_address <>", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressGreaterThan(String value) {
            addCriterion("cable_house_address >", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cable_house_address >=", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressLessThan(String value) {
            addCriterion("cable_house_address <", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("cable_house_address <=", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressLike(String value) {
            addCriterion("cable_house_address like", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressNotLike(String value) {
            addCriterion("cable_house_address not like", value, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressIn(List<String> values) {
            addCriterion("cable_house_address in", values, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressNotIn(List<String> values) {
            addCriterion("cable_house_address not in", values, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressBetween(String value1, String value2) {
            addCriterion("cable_house_address between", value1, value2, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseAddressNotBetween(String value1, String value2) {
            addCriterion("cable_house_address not between", value1, value2, "cableHouseAddress");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactIsNull() {
            addCriterion("cable_house_contact is null");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactIsNotNull() {
            addCriterion("cable_house_contact is not null");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactEqualTo(String value) {
            addCriterion("cable_house_contact =", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactNotEqualTo(String value) {
            addCriterion("cable_house_contact <>", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactGreaterThan(String value) {
            addCriterion("cable_house_contact >", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactGreaterThanOrEqualTo(String value) {
            addCriterion("cable_house_contact >=", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactLessThan(String value) {
            addCriterion("cable_house_contact <", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactLessThanOrEqualTo(String value) {
            addCriterion("cable_house_contact <=", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactLike(String value) {
            addCriterion("cable_house_contact like", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactNotLike(String value) {
            addCriterion("cable_house_contact not like", value, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactIn(List<String> values) {
            addCriterion("cable_house_contact in", values, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactNotIn(List<String> values) {
            addCriterion("cable_house_contact not in", values, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactBetween(String value1, String value2) {
            addCriterion("cable_house_contact between", value1, value2, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseContactNotBetween(String value1, String value2) {
            addCriterion("cable_house_contact not between", value1, value2, "cableHouseContact");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleIsNull() {
            addCriterion("cable_house_tele is null");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleIsNotNull() {
            addCriterion("cable_house_tele is not null");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleEqualTo(String value) {
            addCriterion("cable_house_tele =", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleNotEqualTo(String value) {
            addCriterion("cable_house_tele <>", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleGreaterThan(String value) {
            addCriterion("cable_house_tele >", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleGreaterThanOrEqualTo(String value) {
            addCriterion("cable_house_tele >=", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleLessThan(String value) {
            addCriterion("cable_house_tele <", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleLessThanOrEqualTo(String value) {
            addCriterion("cable_house_tele <=", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleLike(String value) {
            addCriterion("cable_house_tele like", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleNotLike(String value) {
            addCriterion("cable_house_tele not like", value, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleIn(List<String> values) {
            addCriterion("cable_house_tele in", values, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleNotIn(List<String> values) {
            addCriterion("cable_house_tele not in", values, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleBetween(String value1, String value2) {
            addCriterion("cable_house_tele between", value1, value2, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseTeleNotBetween(String value1, String value2) {
            addCriterion("cable_house_tele not between", value1, value2, "cableHouseTele");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteIsNull() {
            addCriterion("cable_house_delete is null");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteIsNotNull() {
            addCriterion("cable_house_delete is not null");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteEqualTo(Integer value) {
            addCriterion("cable_house_delete =", value, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteNotEqualTo(Integer value) {
            addCriterion("cable_house_delete <>", value, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteGreaterThan(Integer value) {
            addCriterion("cable_house_delete >", value, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("cable_house_delete >=", value, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteLessThan(Integer value) {
            addCriterion("cable_house_delete <", value, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("cable_house_delete <=", value, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteIn(List<Integer> values) {
            addCriterion("cable_house_delete in", values, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteNotIn(List<Integer> values) {
            addCriterion("cable_house_delete not in", values, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteBetween(Integer value1, Integer value2) {
            addCriterion("cable_house_delete between", value1, value2, "cableHouseDelete");
            return (Criteria) this;
        }

        public Criteria andCableHouseDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("cable_house_delete not between", value1, value2, "cableHouseDelete");
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