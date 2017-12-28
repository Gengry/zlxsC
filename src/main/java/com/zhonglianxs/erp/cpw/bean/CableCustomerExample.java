package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.List;

public class CableCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableCustomerExample() {
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

        public Criteria andCustomerUserIdIsNull() {
            addCriterion("customer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdIsNotNull() {
            addCriterion("customer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdEqualTo(Integer value) {
            addCriterion("customer_user_id =", value, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdNotEqualTo(Integer value) {
            addCriterion("customer_user_id <>", value, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdGreaterThan(Integer value) {
            addCriterion("customer_user_id >", value, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_user_id >=", value, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdLessThan(Integer value) {
            addCriterion("customer_user_id <", value, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_user_id <=", value, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdIn(List<Integer> values) {
            addCriterion("customer_user_id in", values, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdNotIn(List<Integer> values) {
            addCriterion("customer_user_id not in", values, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_user_id between", value1, value2, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_user_id not between", value1, value2, "customerUserId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNull() {
            addCriterion("customer_contact is null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIsNotNull() {
            addCriterion("customer_contact is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerContactEqualTo(String value) {
            addCriterion("customer_contact =", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotEqualTo(String value) {
            addCriterion("customer_contact <>", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThan(String value) {
            addCriterion("customer_contact >", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactGreaterThanOrEqualTo(String value) {
            addCriterion("customer_contact >=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThan(String value) {
            addCriterion("customer_contact <", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLessThanOrEqualTo(String value) {
            addCriterion("customer_contact <=", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactLike(String value) {
            addCriterion("customer_contact like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotLike(String value) {
            addCriterion("customer_contact not like", value, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactIn(List<String> values) {
            addCriterion("customer_contact in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotIn(List<String> values) {
            addCriterion("customer_contact not in", values, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactBetween(String value1, String value2) {
            addCriterion("customer_contact between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerContactNotBetween(String value1, String value2) {
            addCriterion("customer_contact not between", value1, value2, "customerContact");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleIsNull() {
            addCriterion("customer_tele is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleIsNotNull() {
            addCriterion("customer_tele is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleEqualTo(String value) {
            addCriterion("customer_tele =", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleNotEqualTo(String value) {
            addCriterion("customer_tele <>", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleGreaterThan(String value) {
            addCriterion("customer_tele >", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleGreaterThanOrEqualTo(String value) {
            addCriterion("customer_tele >=", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleLessThan(String value) {
            addCriterion("customer_tele <", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleLessThanOrEqualTo(String value) {
            addCriterion("customer_tele <=", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleLike(String value) {
            addCriterion("customer_tele like", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleNotLike(String value) {
            addCriterion("customer_tele not like", value, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleIn(List<String> values) {
            addCriterion("customer_tele in", values, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleNotIn(List<String> values) {
            addCriterion("customer_tele not in", values, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleBetween(String value1, String value2) {
            addCriterion("customer_tele between", value1, value2, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerTeleNotBetween(String value1, String value2) {
            addCriterion("customer_tele not between", value1, value2, "customerTele");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("customer_address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("customer_address =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("customer_address <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("customer_address >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customer_address >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("customer_address <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("customer_address <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("customer_address like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("customer_address not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("customer_address in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("customer_address not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("customer_address between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("customer_address not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseIsNull() {
            addCriterion("customer_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseIsNotNull() {
            addCriterion("customer_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseEqualTo(String value) {
            addCriterion("customer_warehouse =", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseNotEqualTo(String value) {
            addCriterion("customer_warehouse <>", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseGreaterThan(String value) {
            addCriterion("customer_warehouse >", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("customer_warehouse >=", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseLessThan(String value) {
            addCriterion("customer_warehouse <", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseLessThanOrEqualTo(String value) {
            addCriterion("customer_warehouse <=", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseLike(String value) {
            addCriterion("customer_warehouse like", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseNotLike(String value) {
            addCriterion("customer_warehouse not like", value, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseIn(List<String> values) {
            addCriterion("customer_warehouse in", values, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseNotIn(List<String> values) {
            addCriterion("customer_warehouse not in", values, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseBetween(String value1, String value2) {
            addCriterion("customer_warehouse between", value1, value2, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerWarehouseNotBetween(String value1, String value2) {
            addCriterion("customer_warehouse not between", value1, value2, "customerWarehouse");
            return (Criteria) this;
        }

        public Criteria andCustomerDescIsNull() {
            addCriterion("customer_desc is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDescIsNotNull() {
            addCriterion("customer_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDescEqualTo(String value) {
            addCriterion("customer_desc =", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotEqualTo(String value) {
            addCriterion("customer_desc <>", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescGreaterThan(String value) {
            addCriterion("customer_desc >", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescGreaterThanOrEqualTo(String value) {
            addCriterion("customer_desc >=", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescLessThan(String value) {
            addCriterion("customer_desc <", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescLessThanOrEqualTo(String value) {
            addCriterion("customer_desc <=", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescLike(String value) {
            addCriterion("customer_desc like", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotLike(String value) {
            addCriterion("customer_desc not like", value, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescIn(List<String> values) {
            addCriterion("customer_desc in", values, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotIn(List<String> values) {
            addCriterion("customer_desc not in", values, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescBetween(String value1, String value2) {
            addCriterion("customer_desc between", value1, value2, "customerDesc");
            return (Criteria) this;
        }

        public Criteria andCustomerDescNotBetween(String value1, String value2) {
            addCriterion("customer_desc not between", value1, value2, "customerDesc");
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