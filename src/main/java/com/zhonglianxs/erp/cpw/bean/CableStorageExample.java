package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CableStorageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableStorageExample() {
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

        public Criteria andStorageUserIdIsNull() {
            addCriterion("storage_user_id is null");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdIsNotNull() {
            addCriterion("storage_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdEqualTo(Integer value) {
            addCriterion("storage_user_id =", value, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdNotEqualTo(Integer value) {
            addCriterion("storage_user_id <>", value, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdGreaterThan(Integer value) {
            addCriterion("storage_user_id >", value, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("storage_user_id >=", value, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdLessThan(Integer value) {
            addCriterion("storage_user_id <", value, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("storage_user_id <=", value, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdIn(List<Integer> values) {
            addCriterion("storage_user_id in", values, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdNotIn(List<Integer> values) {
            addCriterion("storage_user_id not in", values, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdBetween(Integer value1, Integer value2) {
            addCriterion("storage_user_id between", value1, value2, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("storage_user_id not between", value1, value2, "storageUserId");
            return (Criteria) this;
        }

        public Criteria andStorageModelIsNull() {
            addCriterion("storage_model is null");
            return (Criteria) this;
        }

        public Criteria andStorageModelIsNotNull() {
            addCriterion("storage_model is not null");
            return (Criteria) this;
        }

        public Criteria andStorageModelEqualTo(String value) {
            addCriterion("storage_model =", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelNotEqualTo(String value) {
            addCriterion("storage_model <>", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelGreaterThan(String value) {
            addCriterion("storage_model >", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelGreaterThanOrEqualTo(String value) {
            addCriterion("storage_model >=", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelLessThan(String value) {
            addCriterion("storage_model <", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelLessThanOrEqualTo(String value) {
            addCriterion("storage_model <=", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelLike(String value) {
            addCriterion("storage_model like", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelNotLike(String value) {
            addCriterion("storage_model not like", value, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelIn(List<String> values) {
            addCriterion("storage_model in", values, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelNotIn(List<String> values) {
            addCriterion("storage_model not in", values, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelBetween(String value1, String value2) {
            addCriterion("storage_model between", value1, value2, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageModelNotBetween(String value1, String value2) {
            addCriterion("storage_model not between", value1, value2, "storageModel");
            return (Criteria) this;
        }

        public Criteria andStorageSpecIsNull() {
            addCriterion("storage_spec is null");
            return (Criteria) this;
        }

        public Criteria andStorageSpecIsNotNull() {
            addCriterion("storage_spec is not null");
            return (Criteria) this;
        }

        public Criteria andStorageSpecEqualTo(String value) {
            addCriterion("storage_spec =", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecNotEqualTo(String value) {
            addCriterion("storage_spec <>", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecGreaterThan(String value) {
            addCriterion("storage_spec >", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecGreaterThanOrEqualTo(String value) {
            addCriterion("storage_spec >=", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecLessThan(String value) {
            addCriterion("storage_spec <", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecLessThanOrEqualTo(String value) {
            addCriterion("storage_spec <=", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecLike(String value) {
            addCriterion("storage_spec like", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecNotLike(String value) {
            addCriterion("storage_spec not like", value, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecIn(List<String> values) {
            addCriterion("storage_spec in", values, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecNotIn(List<String> values) {
            addCriterion("storage_spec not in", values, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecBetween(String value1, String value2) {
            addCriterion("storage_spec between", value1, value2, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageSpecNotBetween(String value1, String value2) {
            addCriterion("storage_spec not between", value1, value2, "storageSpec");
            return (Criteria) this;
        }

        public Criteria andStorageUnitIsNull() {
            addCriterion("storage_unit is null");
            return (Criteria) this;
        }

        public Criteria andStorageUnitIsNotNull() {
            addCriterion("storage_unit is not null");
            return (Criteria) this;
        }

        public Criteria andStorageUnitEqualTo(String value) {
            addCriterion("storage_unit =", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitNotEqualTo(String value) {
            addCriterion("storage_unit <>", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitGreaterThan(String value) {
            addCriterion("storage_unit >", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitGreaterThanOrEqualTo(String value) {
            addCriterion("storage_unit >=", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitLessThan(String value) {
            addCriterion("storage_unit <", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitLessThanOrEqualTo(String value) {
            addCriterion("storage_unit <=", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitLike(String value) {
            addCriterion("storage_unit like", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitNotLike(String value) {
            addCriterion("storage_unit not like", value, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitIn(List<String> values) {
            addCriterion("storage_unit in", values, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitNotIn(List<String> values) {
            addCriterion("storage_unit not in", values, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitBetween(String value1, String value2) {
            addCriterion("storage_unit between", value1, value2, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageUnitNotBetween(String value1, String value2) {
            addCriterion("storage_unit not between", value1, value2, "storageUnit");
            return (Criteria) this;
        }

        public Criteria andStorageNumberIsNull() {
            addCriterion("storage_number is null");
            return (Criteria) this;
        }

        public Criteria andStorageNumberIsNotNull() {
            addCriterion("storage_number is not null");
            return (Criteria) this;
        }

        public Criteria andStorageNumberEqualTo(BigDecimal value) {
            addCriterion("storage_number =", value, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberNotEqualTo(BigDecimal value) {
            addCriterion("storage_number <>", value, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberGreaterThan(BigDecimal value) {
            addCriterion("storage_number >", value, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("storage_number >=", value, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberLessThan(BigDecimal value) {
            addCriterion("storage_number <", value, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("storage_number <=", value, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberIn(List<BigDecimal> values) {
            addCriterion("storage_number in", values, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberNotIn(List<BigDecimal> values) {
            addCriterion("storage_number not in", values, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("storage_number between", value1, value2, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("storage_number not between", value1, value2, "storageNumber");
            return (Criteria) this;
        }

        public Criteria andStorageQualityIsNull() {
            addCriterion("storage_quality is null");
            return (Criteria) this;
        }

        public Criteria andStorageQualityIsNotNull() {
            addCriterion("storage_quality is not null");
            return (Criteria) this;
        }

        public Criteria andStorageQualityEqualTo(String value) {
            addCriterion("storage_quality =", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityNotEqualTo(String value) {
            addCriterion("storage_quality <>", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityGreaterThan(String value) {
            addCriterion("storage_quality >", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityGreaterThanOrEqualTo(String value) {
            addCriterion("storage_quality >=", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityLessThan(String value) {
            addCriterion("storage_quality <", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityLessThanOrEqualTo(String value) {
            addCriterion("storage_quality <=", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityLike(String value) {
            addCriterion("storage_quality like", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityNotLike(String value) {
            addCriterion("storage_quality not like", value, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityIn(List<String> values) {
            addCriterion("storage_quality in", values, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityNotIn(List<String> values) {
            addCriterion("storage_quality not in", values, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityBetween(String value1, String value2) {
            addCriterion("storage_quality between", value1, value2, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageQualityNotBetween(String value1, String value2) {
            addCriterion("storage_quality not between", value1, value2, "storageQuality");
            return (Criteria) this;
        }

        public Criteria andStorageColorIsNull() {
            addCriterion("storage_color is null");
            return (Criteria) this;
        }

        public Criteria andStorageColorIsNotNull() {
            addCriterion("storage_color is not null");
            return (Criteria) this;
        }

        public Criteria andStorageColorEqualTo(String value) {
            addCriterion("storage_color =", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorNotEqualTo(String value) {
            addCriterion("storage_color <>", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorGreaterThan(String value) {
            addCriterion("storage_color >", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorGreaterThanOrEqualTo(String value) {
            addCriterion("storage_color >=", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorLessThan(String value) {
            addCriterion("storage_color <", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorLessThanOrEqualTo(String value) {
            addCriterion("storage_color <=", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorLike(String value) {
            addCriterion("storage_color like", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorNotLike(String value) {
            addCriterion("storage_color not like", value, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorIn(List<String> values) {
            addCriterion("storage_color in", values, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorNotIn(List<String> values) {
            addCriterion("storage_color not in", values, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorBetween(String value1, String value2) {
            addCriterion("storage_color between", value1, value2, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageColorNotBetween(String value1, String value2) {
            addCriterion("storage_color not between", value1, value2, "storageColor");
            return (Criteria) this;
        }

        public Criteria andStorageProviderIsNull() {
            addCriterion("storage_provider is null");
            return (Criteria) this;
        }

        public Criteria andStorageProviderIsNotNull() {
            addCriterion("storage_provider is not null");
            return (Criteria) this;
        }

        public Criteria andStorageProviderEqualTo(String value) {
            addCriterion("storage_provider =", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderNotEqualTo(String value) {
            addCriterion("storage_provider <>", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderGreaterThan(String value) {
            addCriterion("storage_provider >", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderGreaterThanOrEqualTo(String value) {
            addCriterion("storage_provider >=", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderLessThan(String value) {
            addCriterion("storage_provider <", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderLessThanOrEqualTo(String value) {
            addCriterion("storage_provider <=", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderLike(String value) {
            addCriterion("storage_provider like", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderNotLike(String value) {
            addCriterion("storage_provider not like", value, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderIn(List<String> values) {
            addCriterion("storage_provider in", values, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderNotIn(List<String> values) {
            addCriterion("storage_provider not in", values, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderBetween(String value1, String value2) {
            addCriterion("storage_provider between", value1, value2, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageProviderNotBetween(String value1, String value2) {
            addCriterion("storage_provider not between", value1, value2, "storageProvider");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeIsNull() {
            addCriterion("storage_update_time is null");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeIsNotNull() {
            addCriterion("storage_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeEqualTo(Date value) {
            addCriterion("storage_update_time =", value, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeNotEqualTo(Date value) {
            addCriterion("storage_update_time <>", value, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeGreaterThan(Date value) {
            addCriterion("storage_update_time >", value, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("storage_update_time >=", value, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeLessThan(Date value) {
            addCriterion("storage_update_time <", value, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("storage_update_time <=", value, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeIn(List<Date> values) {
            addCriterion("storage_update_time in", values, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeNotIn(List<Date> values) {
            addCriterion("storage_update_time not in", values, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("storage_update_time between", value1, value2, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("storage_update_time not between", value1, value2, "storageUpdateTime");
            return (Criteria) this;
        }

        public Criteria andStorageHouseIsNull() {
            addCriterion("storage_house is null");
            return (Criteria) this;
        }

        public Criteria andStorageHouseIsNotNull() {
            addCriterion("storage_house is not null");
            return (Criteria) this;
        }

        public Criteria andStorageHouseEqualTo(String value) {
            addCriterion("storage_house =", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseNotEqualTo(String value) {
            addCriterion("storage_house <>", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseGreaterThan(String value) {
            addCriterion("storage_house >", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseGreaterThanOrEqualTo(String value) {
            addCriterion("storage_house >=", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseLessThan(String value) {
            addCriterion("storage_house <", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseLessThanOrEqualTo(String value) {
            addCriterion("storage_house <=", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseLike(String value) {
            addCriterion("storage_house like", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseNotLike(String value) {
            addCriterion("storage_house not like", value, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseIn(List<String> values) {
            addCriterion("storage_house in", values, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseNotIn(List<String> values) {
            addCriterion("storage_house not in", values, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseBetween(String value1, String value2) {
            addCriterion("storage_house between", value1, value2, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageHouseNotBetween(String value1, String value2) {
            addCriterion("storage_house not between", value1, value2, "storageHouse");
            return (Criteria) this;
        }

        public Criteria andStorageDescIsNull() {
            addCriterion("storage_desc is null");
            return (Criteria) this;
        }

        public Criteria andStorageDescIsNotNull() {
            addCriterion("storage_desc is not null");
            return (Criteria) this;
        }

        public Criteria andStorageDescEqualTo(String value) {
            addCriterion("storage_desc =", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescNotEqualTo(String value) {
            addCriterion("storage_desc <>", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescGreaterThan(String value) {
            addCriterion("storage_desc >", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescGreaterThanOrEqualTo(String value) {
            addCriterion("storage_desc >=", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescLessThan(String value) {
            addCriterion("storage_desc <", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescLessThanOrEqualTo(String value) {
            addCriterion("storage_desc <=", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescLike(String value) {
            addCriterion("storage_desc like", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescNotLike(String value) {
            addCriterion("storage_desc not like", value, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescIn(List<String> values) {
            addCriterion("storage_desc in", values, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescNotIn(List<String> values) {
            addCriterion("storage_desc not in", values, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescBetween(String value1, String value2) {
            addCriterion("storage_desc between", value1, value2, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDescNotBetween(String value1, String value2) {
            addCriterion("storage_desc not between", value1, value2, "storageDesc");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteIsNull() {
            addCriterion("storage_delete is null");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteIsNotNull() {
            addCriterion("storage_delete is not null");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteEqualTo(Integer value) {
            addCriterion("storage_delete =", value, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteNotEqualTo(Integer value) {
            addCriterion("storage_delete <>", value, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteGreaterThan(Integer value) {
            addCriterion("storage_delete >", value, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("storage_delete >=", value, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteLessThan(Integer value) {
            addCriterion("storage_delete <", value, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("storage_delete <=", value, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteIn(List<Integer> values) {
            addCriterion("storage_delete in", values, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteNotIn(List<Integer> values) {
            addCriterion("storage_delete not in", values, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteBetween(Integer value1, Integer value2) {
            addCriterion("storage_delete between", value1, value2, "storageDelete");
            return (Criteria) this;
        }

        public Criteria andStorageDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("storage_delete not between", value1, value2, "storageDelete");
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