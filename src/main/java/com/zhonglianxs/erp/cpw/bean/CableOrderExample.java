package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CableOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableOrderExample() {
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

        public Criteria andOrderUserIdIsNull() {
            addCriterion("order_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIsNotNull() {
            addCriterion("order_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdEqualTo(Integer value) {
            addCriterion("order_user_id =", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotEqualTo(Integer value) {
            addCriterion("order_user_id <>", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThan(Integer value) {
            addCriterion("order_user_id >", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_user_id >=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThan(Integer value) {
            addCriterion("order_user_id <", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_user_id <=", value, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdIn(List<Integer> values) {
            addCriterion("order_user_id in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotIn(List<Integer> values) {
            addCriterion("order_user_id not in", values, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_user_id not between", value1, value2, "orderUserId");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNull() {
            addCriterion("order_code is null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIsNotNull() {
            addCriterion("order_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCodeEqualTo(String value) {
            addCriterion("order_code =", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("order_code <>", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("order_code >", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("order_code >=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThan(String value) {
            addCriterion("order_code <", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("order_code <=", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeLike(String value) {
            addCriterion("order_code like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotLike(String value) {
            addCriterion("order_code not like", value, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeIn(List<String> values) {
            addCriterion("order_code in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("order_code not in", values, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("order_code between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("order_code not between", value1, value2, "orderCode");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdIsNull() {
            addCriterion("order_other_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdIsNotNull() {
            addCriterion("order_other_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdEqualTo(Integer value) {
            addCriterion("order_other_id =", value, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdNotEqualTo(Integer value) {
            addCriterion("order_other_id <>", value, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdGreaterThan(Integer value) {
            addCriterion("order_other_id >", value, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_other_id >=", value, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdLessThan(Integer value) {
            addCriterion("order_other_id <", value, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_other_id <=", value, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdIn(List<Integer> values) {
            addCriterion("order_other_id in", values, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdNotIn(List<Integer> values) {
            addCriterion("order_other_id not in", values, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdBetween(Integer value1, Integer value2) {
            addCriterion("order_other_id between", value1, value2, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_other_id not between", value1, value2, "orderOtherId");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameIsNull() {
            addCriterion("order_other_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameIsNotNull() {
            addCriterion("order_other_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameEqualTo(String value) {
            addCriterion("order_other_name =", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameNotEqualTo(String value) {
            addCriterion("order_other_name <>", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameGreaterThan(String value) {
            addCriterion("order_other_name >", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_other_name >=", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameLessThan(String value) {
            addCriterion("order_other_name <", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameLessThanOrEqualTo(String value) {
            addCriterion("order_other_name <=", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameLike(String value) {
            addCriterion("order_other_name like", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameNotLike(String value) {
            addCriterion("order_other_name not like", value, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameIn(List<String> values) {
            addCriterion("order_other_name in", values, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameNotIn(List<String> values) {
            addCriterion("order_other_name not in", values, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameBetween(String value1, String value2) {
            addCriterion("order_other_name between", value1, value2, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherNameNotBetween(String value1, String value2) {
            addCriterion("order_other_name not between", value1, value2, "orderOtherName");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactIsNull() {
            addCriterion("order_other_contact is null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactIsNotNull() {
            addCriterion("order_other_contact is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactEqualTo(String value) {
            addCriterion("order_other_contact =", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactNotEqualTo(String value) {
            addCriterion("order_other_contact <>", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactGreaterThan(String value) {
            addCriterion("order_other_contact >", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactGreaterThanOrEqualTo(String value) {
            addCriterion("order_other_contact >=", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactLessThan(String value) {
            addCriterion("order_other_contact <", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactLessThanOrEqualTo(String value) {
            addCriterion("order_other_contact <=", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactLike(String value) {
            addCriterion("order_other_contact like", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactNotLike(String value) {
            addCriterion("order_other_contact not like", value, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactIn(List<String> values) {
            addCriterion("order_other_contact in", values, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactNotIn(List<String> values) {
            addCriterion("order_other_contact not in", values, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactBetween(String value1, String value2) {
            addCriterion("order_other_contact between", value1, value2, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherContactNotBetween(String value1, String value2) {
            addCriterion("order_other_contact not between", value1, value2, "orderOtherContact");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleIsNull() {
            addCriterion("order_other_tele is null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleIsNotNull() {
            addCriterion("order_other_tele is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleEqualTo(String value) {
            addCriterion("order_other_tele =", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleNotEqualTo(String value) {
            addCriterion("order_other_tele <>", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleGreaterThan(String value) {
            addCriterion("order_other_tele >", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleGreaterThanOrEqualTo(String value) {
            addCriterion("order_other_tele >=", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleLessThan(String value) {
            addCriterion("order_other_tele <", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleLessThanOrEqualTo(String value) {
            addCriterion("order_other_tele <=", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleLike(String value) {
            addCriterion("order_other_tele like", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleNotLike(String value) {
            addCriterion("order_other_tele not like", value, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleIn(List<String> values) {
            addCriterion("order_other_tele in", values, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleNotIn(List<String> values) {
            addCriterion("order_other_tele not in", values, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleBetween(String value1, String value2) {
            addCriterion("order_other_tele between", value1, value2, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherTeleNotBetween(String value1, String value2) {
            addCriterion("order_other_tele not between", value1, value2, "orderOtherTele");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressIsNull() {
            addCriterion("order_other_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressIsNotNull() {
            addCriterion("order_other_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressEqualTo(String value) {
            addCriterion("order_other_address =", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressNotEqualTo(String value) {
            addCriterion("order_other_address <>", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressGreaterThan(String value) {
            addCriterion("order_other_address >", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_other_address >=", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressLessThan(String value) {
            addCriterion("order_other_address <", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressLessThanOrEqualTo(String value) {
            addCriterion("order_other_address <=", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressLike(String value) {
            addCriterion("order_other_address like", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressNotLike(String value) {
            addCriterion("order_other_address not like", value, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressIn(List<String> values) {
            addCriterion("order_other_address in", values, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressNotIn(List<String> values) {
            addCriterion("order_other_address not in", values, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressBetween(String value1, String value2) {
            addCriterion("order_other_address between", value1, value2, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherAddressNotBetween(String value1, String value2) {
            addCriterion("order_other_address not between", value1, value2, "orderOtherAddress");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseIsNull() {
            addCriterion("order_other_house is null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseIsNotNull() {
            addCriterion("order_other_house is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseEqualTo(String value) {
            addCriterion("order_other_house =", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseNotEqualTo(String value) {
            addCriterion("order_other_house <>", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseGreaterThan(String value) {
            addCriterion("order_other_house >", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseGreaterThanOrEqualTo(String value) {
            addCriterion("order_other_house >=", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseLessThan(String value) {
            addCriterion("order_other_house <", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseLessThanOrEqualTo(String value) {
            addCriterion("order_other_house <=", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseLike(String value) {
            addCriterion("order_other_house like", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseNotLike(String value) {
            addCriterion("order_other_house not like", value, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseIn(List<String> values) {
            addCriterion("order_other_house in", values, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseNotIn(List<String> values) {
            addCriterion("order_other_house not in", values, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseBetween(String value1, String value2) {
            addCriterion("order_other_house between", value1, value2, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderOtherHouseNotBetween(String value1, String value2) {
            addCriterion("order_other_house not between", value1, value2, "orderOtherHouse");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNull() {
            addCriterion("order_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIsNotNull() {
            addCriterion("order_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTimeEqualTo(Date value) {
            addCriterion("order_time =", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotEqualTo(Date value) {
            addCriterion("order_time <>", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThan(Date value) {
            addCriterion("order_time >", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("order_time >=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThan(Date value) {
            addCriterion("order_time <", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeLessThanOrEqualTo(Date value) {
            addCriterion("order_time <=", value, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeIn(List<Date> values) {
            addCriterion("order_time in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotIn(List<Date> values) {
            addCriterion("order_time not in", values, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeBetween(Date value1, Date value2) {
            addCriterion("order_time between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTimeNotBetween(Date value1, Date value2) {
            addCriterion("order_time not between", value1, value2, "orderTime");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceIsNull() {
            addCriterion("order_totalprice is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceIsNotNull() {
            addCriterion("order_totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceEqualTo(BigDecimal value) {
            addCriterion("order_totalprice =", value, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceNotEqualTo(BigDecimal value) {
            addCriterion("order_totalprice <>", value, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceGreaterThan(BigDecimal value) {
            addCriterion("order_totalprice >", value, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_totalprice >=", value, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceLessThan(BigDecimal value) {
            addCriterion("order_totalprice <", value, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_totalprice <=", value, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceIn(List<BigDecimal> values) {
            addCriterion("order_totalprice in", values, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceNotIn(List<BigDecimal> values) {
            addCriterion("order_totalprice not in", values, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_totalprice between", value1, value2, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_totalprice not between", value1, value2, "orderTotalprice");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNull() {
            addCriterion("order_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("order_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("order_desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("order_desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("order_desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("order_desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("order_desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("order_desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("order_desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("order_desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("order_desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("order_desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("order_desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("order_desc not between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteIsNull() {
            addCriterion("order_delete is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteIsNotNull() {
            addCriterion("order_delete is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteEqualTo(Integer value) {
            addCriterion("order_delete =", value, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteNotEqualTo(Integer value) {
            addCriterion("order_delete <>", value, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteGreaterThan(Integer value) {
            addCriterion("order_delete >", value, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_delete >=", value, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteLessThan(Integer value) {
            addCriterion("order_delete <", value, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("order_delete <=", value, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteIn(List<Integer> values) {
            addCriterion("order_delete in", values, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteNotIn(List<Integer> values) {
            addCriterion("order_delete not in", values, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteBetween(Integer value1, Integer value2) {
            addCriterion("order_delete between", value1, value2, "orderDelete");
            return (Criteria) this;
        }

        public Criteria andOrderDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("order_delete not between", value1, value2, "orderDelete");
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