package com.zhonglianxs.erp.cpw.bean;

import java.util.ArrayList;
import java.util.List;

public class CableProviderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableProviderExample() {
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

        public Criteria andProviderUserIdIsNull() {
            addCriterion("provider_user_id is null");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdIsNotNull() {
            addCriterion("provider_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdEqualTo(Integer value) {
            addCriterion("provider_user_id =", value, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdNotEqualTo(Integer value) {
            addCriterion("provider_user_id <>", value, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdGreaterThan(Integer value) {
            addCriterion("provider_user_id >", value, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("provider_user_id >=", value, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdLessThan(Integer value) {
            addCriterion("provider_user_id <", value, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("provider_user_id <=", value, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdIn(List<Integer> values) {
            addCriterion("provider_user_id in", values, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdNotIn(List<Integer> values) {
            addCriterion("provider_user_id not in", values, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdBetween(Integer value1, Integer value2) {
            addCriterion("provider_user_id between", value1, value2, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("provider_user_id not between", value1, value2, "providerUserId");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNull() {
            addCriterion("provider_name is null");
            return (Criteria) this;
        }

        public Criteria andProviderNameIsNotNull() {
            addCriterion("provider_name is not null");
            return (Criteria) this;
        }

        public Criteria andProviderNameEqualTo(String value) {
            addCriterion("provider_name =", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("provider_name <>", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThan(String value) {
            addCriterion("provider_name >", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("provider_name >=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThan(String value) {
            addCriterion("provider_name <", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("provider_name <=", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameLike(String value) {
            addCriterion("provider_name like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotLike(String value) {
            addCriterion("provider_name not like", value, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameIn(List<String> values) {
            addCriterion("provider_name in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("provider_name not in", values, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("provider_name between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("provider_name not between", value1, value2, "providerName");
            return (Criteria) this;
        }

        public Criteria andProviderContactIsNull() {
            addCriterion("provider_contact is null");
            return (Criteria) this;
        }

        public Criteria andProviderContactIsNotNull() {
            addCriterion("provider_contact is not null");
            return (Criteria) this;
        }

        public Criteria andProviderContactEqualTo(String value) {
            addCriterion("provider_contact =", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactNotEqualTo(String value) {
            addCriterion("provider_contact <>", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactGreaterThan(String value) {
            addCriterion("provider_contact >", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactGreaterThanOrEqualTo(String value) {
            addCriterion("provider_contact >=", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactLessThan(String value) {
            addCriterion("provider_contact <", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactLessThanOrEqualTo(String value) {
            addCriterion("provider_contact <=", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactLike(String value) {
            addCriterion("provider_contact like", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactNotLike(String value) {
            addCriterion("provider_contact not like", value, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactIn(List<String> values) {
            addCriterion("provider_contact in", values, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactNotIn(List<String> values) {
            addCriterion("provider_contact not in", values, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactBetween(String value1, String value2) {
            addCriterion("provider_contact between", value1, value2, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderContactNotBetween(String value1, String value2) {
            addCriterion("provider_contact not between", value1, value2, "providerContact");
            return (Criteria) this;
        }

        public Criteria andProviderTeleIsNull() {
            addCriterion("provider_tele is null");
            return (Criteria) this;
        }

        public Criteria andProviderTeleIsNotNull() {
            addCriterion("provider_tele is not null");
            return (Criteria) this;
        }

        public Criteria andProviderTeleEqualTo(String value) {
            addCriterion("provider_tele =", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleNotEqualTo(String value) {
            addCriterion("provider_tele <>", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleGreaterThan(String value) {
            addCriterion("provider_tele >", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleGreaterThanOrEqualTo(String value) {
            addCriterion("provider_tele >=", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleLessThan(String value) {
            addCriterion("provider_tele <", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleLessThanOrEqualTo(String value) {
            addCriterion("provider_tele <=", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleLike(String value) {
            addCriterion("provider_tele like", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleNotLike(String value) {
            addCriterion("provider_tele not like", value, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleIn(List<String> values) {
            addCriterion("provider_tele in", values, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleNotIn(List<String> values) {
            addCriterion("provider_tele not in", values, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleBetween(String value1, String value2) {
            addCriterion("provider_tele between", value1, value2, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderTeleNotBetween(String value1, String value2) {
            addCriterion("provider_tele not between", value1, value2, "providerTele");
            return (Criteria) this;
        }

        public Criteria andProviderAddressIsNull() {
            addCriterion("provider_address is null");
            return (Criteria) this;
        }

        public Criteria andProviderAddressIsNotNull() {
            addCriterion("provider_address is not null");
            return (Criteria) this;
        }

        public Criteria andProviderAddressEqualTo(String value) {
            addCriterion("provider_address =", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotEqualTo(String value) {
            addCriterion("provider_address <>", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressGreaterThan(String value) {
            addCriterion("provider_address >", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressGreaterThanOrEqualTo(String value) {
            addCriterion("provider_address >=", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressLessThan(String value) {
            addCriterion("provider_address <", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressLessThanOrEqualTo(String value) {
            addCriterion("provider_address <=", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressLike(String value) {
            addCriterion("provider_address like", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotLike(String value) {
            addCriterion("provider_address not like", value, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressIn(List<String> values) {
            addCriterion("provider_address in", values, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotIn(List<String> values) {
            addCriterion("provider_address not in", values, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressBetween(String value1, String value2) {
            addCriterion("provider_address between", value1, value2, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderAddressNotBetween(String value1, String value2) {
            addCriterion("provider_address not between", value1, value2, "providerAddress");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseIsNull() {
            addCriterion("provider_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseIsNotNull() {
            addCriterion("provider_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseEqualTo(String value) {
            addCriterion("provider_warehouse =", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseNotEqualTo(String value) {
            addCriterion("provider_warehouse <>", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseGreaterThan(String value) {
            addCriterion("provider_warehouse >", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseGreaterThanOrEqualTo(String value) {
            addCriterion("provider_warehouse >=", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseLessThan(String value) {
            addCriterion("provider_warehouse <", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseLessThanOrEqualTo(String value) {
            addCriterion("provider_warehouse <=", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseLike(String value) {
            addCriterion("provider_warehouse like", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseNotLike(String value) {
            addCriterion("provider_warehouse not like", value, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseIn(List<String> values) {
            addCriterion("provider_warehouse in", values, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseNotIn(List<String> values) {
            addCriterion("provider_warehouse not in", values, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseBetween(String value1, String value2) {
            addCriterion("provider_warehouse between", value1, value2, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderWarehouseNotBetween(String value1, String value2) {
            addCriterion("provider_warehouse not between", value1, value2, "providerWarehouse");
            return (Criteria) this;
        }

        public Criteria andProviderDescIsNull() {
            addCriterion("provider_desc is null");
            return (Criteria) this;
        }

        public Criteria andProviderDescIsNotNull() {
            addCriterion("provider_desc is not null");
            return (Criteria) this;
        }

        public Criteria andProviderDescEqualTo(String value) {
            addCriterion("provider_desc =", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescNotEqualTo(String value) {
            addCriterion("provider_desc <>", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescGreaterThan(String value) {
            addCriterion("provider_desc >", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescGreaterThanOrEqualTo(String value) {
            addCriterion("provider_desc >=", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescLessThan(String value) {
            addCriterion("provider_desc <", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescLessThanOrEqualTo(String value) {
            addCriterion("provider_desc <=", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescLike(String value) {
            addCriterion("provider_desc like", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescNotLike(String value) {
            addCriterion("provider_desc not like", value, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescIn(List<String> values) {
            addCriterion("provider_desc in", values, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescNotIn(List<String> values) {
            addCriterion("provider_desc not in", values, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescBetween(String value1, String value2) {
            addCriterion("provider_desc between", value1, value2, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDescNotBetween(String value1, String value2) {
            addCriterion("provider_desc not between", value1, value2, "providerDesc");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteIsNull() {
            addCriterion("provider_delete is null");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteIsNotNull() {
            addCriterion("provider_delete is not null");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteEqualTo(Integer value) {
            addCriterion("provider_delete =", value, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteNotEqualTo(Integer value) {
            addCriterion("provider_delete <>", value, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteGreaterThan(Integer value) {
            addCriterion("provider_delete >", value, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("provider_delete >=", value, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteLessThan(Integer value) {
            addCriterion("provider_delete <", value, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("provider_delete <=", value, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteIn(List<Integer> values) {
            addCriterion("provider_delete in", values, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteNotIn(List<Integer> values) {
            addCriterion("provider_delete not in", values, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteBetween(Integer value1, Integer value2) {
            addCriterion("provider_delete between", value1, value2, "providerDelete");
            return (Criteria) this;
        }

        public Criteria andProviderDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("provider_delete not between", value1, value2, "providerDelete");
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