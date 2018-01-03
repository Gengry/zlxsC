package com.zhonglianxs.erp.cpw.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CableOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CableOrderItemExample() {
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

        public Criteria andItemUserIdIsNull() {
            addCriterion("item_user_id is null");
            return (Criteria) this;
        }

        public Criteria andItemUserIdIsNotNull() {
            addCriterion("item_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemUserIdEqualTo(Integer value) {
            addCriterion("item_user_id =", value, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdNotEqualTo(Integer value) {
            addCriterion("item_user_id <>", value, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdGreaterThan(Integer value) {
            addCriterion("item_user_id >", value, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_user_id >=", value, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdLessThan(Integer value) {
            addCriterion("item_user_id <", value, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_user_id <=", value, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdIn(List<Integer> values) {
            addCriterion("item_user_id in", values, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdNotIn(List<Integer> values) {
            addCriterion("item_user_id not in", values, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdBetween(Integer value1, Integer value2) {
            addCriterion("item_user_id between", value1, value2, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_user_id not between", value1, value2, "itemUserId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdIsNull() {
            addCriterion("item_order_id is null");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdIsNotNull() {
            addCriterion("item_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdEqualTo(Integer value) {
            addCriterion("item_order_id =", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdNotEqualTo(Integer value) {
            addCriterion("item_order_id <>", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdGreaterThan(Integer value) {
            addCriterion("item_order_id >", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_order_id >=", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdLessThan(Integer value) {
            addCriterion("item_order_id <", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_order_id <=", value, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdIn(List<Integer> values) {
            addCriterion("item_order_id in", values, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdNotIn(List<Integer> values) {
            addCriterion("item_order_id not in", values, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("item_order_id between", value1, value2, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_order_id not between", value1, value2, "itemOrderId");
            return (Criteria) this;
        }

        public Criteria andItemModelIsNull() {
            addCriterion("item_model is null");
            return (Criteria) this;
        }

        public Criteria andItemModelIsNotNull() {
            addCriterion("item_model is not null");
            return (Criteria) this;
        }

        public Criteria andItemModelEqualTo(String value) {
            addCriterion("item_model =", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotEqualTo(String value) {
            addCriterion("item_model <>", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelGreaterThan(String value) {
            addCriterion("item_model >", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelGreaterThanOrEqualTo(String value) {
            addCriterion("item_model >=", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelLessThan(String value) {
            addCriterion("item_model <", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelLessThanOrEqualTo(String value) {
            addCriterion("item_model <=", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelLike(String value) {
            addCriterion("item_model like", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotLike(String value) {
            addCriterion("item_model not like", value, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelIn(List<String> values) {
            addCriterion("item_model in", values, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotIn(List<String> values) {
            addCriterion("item_model not in", values, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelBetween(String value1, String value2) {
            addCriterion("item_model between", value1, value2, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemModelNotBetween(String value1, String value2) {
            addCriterion("item_model not between", value1, value2, "itemModel");
            return (Criteria) this;
        }

        public Criteria andItemSpecIsNull() {
            addCriterion("item_spec is null");
            return (Criteria) this;
        }

        public Criteria andItemSpecIsNotNull() {
            addCriterion("item_spec is not null");
            return (Criteria) this;
        }

        public Criteria andItemSpecEqualTo(String value) {
            addCriterion("item_spec =", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotEqualTo(String value) {
            addCriterion("item_spec <>", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecGreaterThan(String value) {
            addCriterion("item_spec >", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecGreaterThanOrEqualTo(String value) {
            addCriterion("item_spec >=", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecLessThan(String value) {
            addCriterion("item_spec <", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecLessThanOrEqualTo(String value) {
            addCriterion("item_spec <=", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecLike(String value) {
            addCriterion("item_spec like", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotLike(String value) {
            addCriterion("item_spec not like", value, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecIn(List<String> values) {
            addCriterion("item_spec in", values, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotIn(List<String> values) {
            addCriterion("item_spec not in", values, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecBetween(String value1, String value2) {
            addCriterion("item_spec between", value1, value2, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemSpecNotBetween(String value1, String value2) {
            addCriterion("item_spec not between", value1, value2, "itemSpec");
            return (Criteria) this;
        }

        public Criteria andItemQualityIsNull() {
            addCriterion("item_quality is null");
            return (Criteria) this;
        }

        public Criteria andItemQualityIsNotNull() {
            addCriterion("item_quality is not null");
            return (Criteria) this;
        }

        public Criteria andItemQualityEqualTo(String value) {
            addCriterion("item_quality =", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityNotEqualTo(String value) {
            addCriterion("item_quality <>", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityGreaterThan(String value) {
            addCriterion("item_quality >", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityGreaterThanOrEqualTo(String value) {
            addCriterion("item_quality >=", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityLessThan(String value) {
            addCriterion("item_quality <", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityLessThanOrEqualTo(String value) {
            addCriterion("item_quality <=", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityLike(String value) {
            addCriterion("item_quality like", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityNotLike(String value) {
            addCriterion("item_quality not like", value, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityIn(List<String> values) {
            addCriterion("item_quality in", values, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityNotIn(List<String> values) {
            addCriterion("item_quality not in", values, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityBetween(String value1, String value2) {
            addCriterion("item_quality between", value1, value2, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemQualityNotBetween(String value1, String value2) {
            addCriterion("item_quality not between", value1, value2, "itemQuality");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNull() {
            addCriterion("item_unit is null");
            return (Criteria) this;
        }

        public Criteria andItemUnitIsNotNull() {
            addCriterion("item_unit is not null");
            return (Criteria) this;
        }

        public Criteria andItemUnitEqualTo(String value) {
            addCriterion("item_unit =", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotEqualTo(String value) {
            addCriterion("item_unit <>", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThan(String value) {
            addCriterion("item_unit >", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitGreaterThanOrEqualTo(String value) {
            addCriterion("item_unit >=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThan(String value) {
            addCriterion("item_unit <", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLessThanOrEqualTo(String value) {
            addCriterion("item_unit <=", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitLike(String value) {
            addCriterion("item_unit like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotLike(String value) {
            addCriterion("item_unit not like", value, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitIn(List<String> values) {
            addCriterion("item_unit in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotIn(List<String> values) {
            addCriterion("item_unit not in", values, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitBetween(String value1, String value2) {
            addCriterion("item_unit between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemUnitNotBetween(String value1, String value2) {
            addCriterion("item_unit not between", value1, value2, "itemUnit");
            return (Criteria) this;
        }

        public Criteria andItemColorIsNull() {
            addCriterion("item_color is null");
            return (Criteria) this;
        }

        public Criteria andItemColorIsNotNull() {
            addCriterion("item_color is not null");
            return (Criteria) this;
        }

        public Criteria andItemColorEqualTo(String value) {
            addCriterion("item_color =", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorNotEqualTo(String value) {
            addCriterion("item_color <>", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorGreaterThan(String value) {
            addCriterion("item_color >", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorGreaterThanOrEqualTo(String value) {
            addCriterion("item_color >=", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorLessThan(String value) {
            addCriterion("item_color <", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorLessThanOrEqualTo(String value) {
            addCriterion("item_color <=", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorLike(String value) {
            addCriterion("item_color like", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorNotLike(String value) {
            addCriterion("item_color not like", value, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorIn(List<String> values) {
            addCriterion("item_color in", values, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorNotIn(List<String> values) {
            addCriterion("item_color not in", values, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorBetween(String value1, String value2) {
            addCriterion("item_color between", value1, value2, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemColorNotBetween(String value1, String value2) {
            addCriterion("item_color not between", value1, value2, "itemColor");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNull() {
            addCriterion("item_number is null");
            return (Criteria) this;
        }

        public Criteria andItemNumberIsNotNull() {
            addCriterion("item_number is not null");
            return (Criteria) this;
        }

        public Criteria andItemNumberEqualTo(BigDecimal value) {
            addCriterion("item_number =", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotEqualTo(BigDecimal value) {
            addCriterion("item_number <>", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThan(BigDecimal value) {
            addCriterion("item_number >", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_number >=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThan(BigDecimal value) {
            addCriterion("item_number <", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_number <=", value, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberIn(List<BigDecimal> values) {
            addCriterion("item_number in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotIn(List<BigDecimal> values) {
            addCriterion("item_number not in", values, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_number between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemNumberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_number not between", value1, value2, "itemNumber");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNull() {
            addCriterion("item_price is null");
            return (Criteria) this;
        }

        public Criteria andItemPriceIsNotNull() {
            addCriterion("item_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemPriceEqualTo(BigDecimal value) {
            addCriterion("item_price =", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotEqualTo(BigDecimal value) {
            addCriterion("item_price <>", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThan(BigDecimal value) {
            addCriterion("item_price >", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_price >=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThan(BigDecimal value) {
            addCriterion("item_price <", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_price <=", value, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceIn(List<BigDecimal> values) {
            addCriterion("item_price in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotIn(List<BigDecimal> values) {
            addCriterion("item_price not in", values, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_price between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_price not between", value1, value2, "itemPrice");
            return (Criteria) this;
        }

        public Criteria andItemDiscountIsNull() {
            addCriterion("item_discount is null");
            return (Criteria) this;
        }

        public Criteria andItemDiscountIsNotNull() {
            addCriterion("item_discount is not null");
            return (Criteria) this;
        }

        public Criteria andItemDiscountEqualTo(BigDecimal value) {
            addCriterion("item_discount =", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountNotEqualTo(BigDecimal value) {
            addCriterion("item_discount <>", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountGreaterThan(BigDecimal value) {
            addCriterion("item_discount >", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_discount >=", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountLessThan(BigDecimal value) {
            addCriterion("item_discount <", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_discount <=", value, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountIn(List<BigDecimal> values) {
            addCriterion("item_discount in", values, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountNotIn(List<BigDecimal> values) {
            addCriterion("item_discount not in", values, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_discount between", value1, value2, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_discount not between", value1, value2, "itemDiscount");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceIsNull() {
            addCriterion("item_totle_price is null");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceIsNotNull() {
            addCriterion("item_totle_price is not null");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceEqualTo(BigDecimal value) {
            addCriterion("item_totle_price =", value, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceNotEqualTo(BigDecimal value) {
            addCriterion("item_totle_price <>", value, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceGreaterThan(BigDecimal value) {
            addCriterion("item_totle_price >", value, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("item_totle_price >=", value, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceLessThan(BigDecimal value) {
            addCriterion("item_totle_price <", value, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("item_totle_price <=", value, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceIn(List<BigDecimal> values) {
            addCriterion("item_totle_price in", values, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceNotIn(List<BigDecimal> values) {
            addCriterion("item_totle_price not in", values, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_totle_price between", value1, value2, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemTotlePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("item_totle_price not between", value1, value2, "itemTotlePrice");
            return (Criteria) this;
        }

        public Criteria andItemHouseIsNull() {
            addCriterion("item_house is null");
            return (Criteria) this;
        }

        public Criteria andItemHouseIsNotNull() {
            addCriterion("item_house is not null");
            return (Criteria) this;
        }

        public Criteria andItemHouseEqualTo(String value) {
            addCriterion("item_house =", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseNotEqualTo(String value) {
            addCriterion("item_house <>", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseGreaterThan(String value) {
            addCriterion("item_house >", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseGreaterThanOrEqualTo(String value) {
            addCriterion("item_house >=", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseLessThan(String value) {
            addCriterion("item_house <", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseLessThanOrEqualTo(String value) {
            addCriterion("item_house <=", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseLike(String value) {
            addCriterion("item_house like", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseNotLike(String value) {
            addCriterion("item_house not like", value, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseIn(List<String> values) {
            addCriterion("item_house in", values, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseNotIn(List<String> values) {
            addCriterion("item_house not in", values, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseBetween(String value1, String value2) {
            addCriterion("item_house between", value1, value2, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemHouseNotBetween(String value1, String value2) {
            addCriterion("item_house not between", value1, value2, "itemHouse");
            return (Criteria) this;
        }

        public Criteria andItemDeleteIsNull() {
            addCriterion("item_delete is null");
            return (Criteria) this;
        }

        public Criteria andItemDeleteIsNotNull() {
            addCriterion("item_delete is not null");
            return (Criteria) this;
        }

        public Criteria andItemDeleteEqualTo(Integer value) {
            addCriterion("item_delete =", value, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteNotEqualTo(Integer value) {
            addCriterion("item_delete <>", value, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteGreaterThan(Integer value) {
            addCriterion("item_delete >", value, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_delete >=", value, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteLessThan(Integer value) {
            addCriterion("item_delete <", value, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("item_delete <=", value, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteIn(List<Integer> values) {
            addCriterion("item_delete in", values, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteNotIn(List<Integer> values) {
            addCriterion("item_delete not in", values, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteBetween(Integer value1, Integer value2) {
            addCriterion("item_delete between", value1, value2, "itemDelete");
            return (Criteria) this;
        }

        public Criteria andItemDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("item_delete not between", value1, value2, "itemDelete");
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