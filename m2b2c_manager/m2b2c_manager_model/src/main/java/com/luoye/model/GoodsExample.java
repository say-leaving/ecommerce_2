package com.luoye.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleColorIsNull() {
            addCriterion("title_color is null");
            return (Criteria) this;
        }

        public Criteria andTitleColorIsNotNull() {
            addCriterion("title_color is not null");
            return (Criteria) this;
        }

        public Criteria andTitleColorEqualTo(String value) {
            addCriterion("title_color =", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotEqualTo(String value) {
            addCriterion("title_color <>", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorGreaterThan(String value) {
            addCriterion("title_color >", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorGreaterThanOrEqualTo(String value) {
            addCriterion("title_color >=", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorLessThan(String value) {
            addCriterion("title_color <", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorLessThanOrEqualTo(String value) {
            addCriterion("title_color <=", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorLike(String value) {
            addCriterion("title_color like", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotLike(String value) {
            addCriterion("title_color not like", value, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorIn(List<String> values) {
            addCriterion("title_color in", values, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotIn(List<String> values) {
            addCriterion("title_color not in", values, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorBetween(String value1, String value2) {
            addCriterion("title_color between", value1, value2, "titleColor");
            return (Criteria) this;
        }

        public Criteria andTitleColorNotBetween(String value1, String value2) {
            addCriterion("title_color not between", value1, value2, "titleColor");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginIsNull() {
            addCriterion("place_origin is null");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginIsNotNull() {
            addCriterion("place_origin is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginEqualTo(Integer value) {
            addCriterion("place_origin =", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotEqualTo(Integer value) {
            addCriterion("place_origin <>", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginGreaterThan(Integer value) {
            addCriterion("place_origin >", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginGreaterThanOrEqualTo(Integer value) {
            addCriterion("place_origin >=", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginLessThan(Integer value) {
            addCriterion("place_origin <", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginLessThanOrEqualTo(Integer value) {
            addCriterion("place_origin <=", value, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginIn(List<Integer> values) {
            addCriterion("place_origin in", values, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotIn(List<Integer> values) {
            addCriterion("place_origin not in", values, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginBetween(Integer value1, Integer value2) {
            addCriterion("place_origin between", value1, value2, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andPlaceOriginNotBetween(Integer value1, Integer value2) {
            addCriterion("place_origin not between", value1, value2, "placeOrigin");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitIsNull() {
            addCriterion("inventory_unit is null");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitIsNotNull() {
            addCriterion("inventory_unit is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitEqualTo(String value) {
            addCriterion("inventory_unit =", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitNotEqualTo(String value) {
            addCriterion("inventory_unit <>", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitGreaterThan(String value) {
            addCriterion("inventory_unit >", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_unit >=", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitLessThan(String value) {
            addCriterion("inventory_unit <", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitLessThanOrEqualTo(String value) {
            addCriterion("inventory_unit <=", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitLike(String value) {
            addCriterion("inventory_unit like", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitNotLike(String value) {
            addCriterion("inventory_unit not like", value, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitIn(List<String> values) {
            addCriterion("inventory_unit in", values, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitNotIn(List<String> values) {
            addCriterion("inventory_unit not in", values, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitBetween(String value1, String value2) {
            addCriterion("inventory_unit between", value1, value2, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andInventoryUnitNotBetween(String value1, String value2) {
            addCriterion("inventory_unit not between", value1, value2, "inventoryUnit");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNull() {
            addCriterion("original_price is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIsNotNull() {
            addCriterion("original_price is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceEqualTo(String value) {
            addCriterion("original_price =", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotEqualTo(String value) {
            addCriterion("original_price <>", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThan(String value) {
            addCriterion("original_price >", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceGreaterThanOrEqualTo(String value) {
            addCriterion("original_price >=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThan(String value) {
            addCriterion("original_price <", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLessThanOrEqualTo(String value) {
            addCriterion("original_price <=", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceLike(String value) {
            addCriterion("original_price like", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotLike(String value) {
            addCriterion("original_price not like", value, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceIn(List<String> values) {
            addCriterion("original_price in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotIn(List<String> values) {
            addCriterion("original_price not in", values, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceBetween(String value1, String value2) {
            addCriterion("original_price between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andOriginalPriceNotBetween(String value1, String value2) {
            addCriterion("original_price not between", value1, value2, "originalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceIsNull() {
            addCriterion("min_original_price is null");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceIsNotNull() {
            addCriterion("min_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("min_original_price =", value, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_original_price <>", value, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("min_original_price >", value, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_original_price >=", value, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceLessThan(BigDecimal value) {
            addCriterion("min_original_price <", value, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_original_price <=", value, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("min_original_price in", values, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_original_price not in", values, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_original_price between", value1, value2, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMinOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_original_price not between", value1, value2, "minOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceIsNull() {
            addCriterion("max_original_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceIsNotNull() {
            addCriterion("max_original_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceEqualTo(BigDecimal value) {
            addCriterion("max_original_price =", value, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceNotEqualTo(BigDecimal value) {
            addCriterion("max_original_price <>", value, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceGreaterThan(BigDecimal value) {
            addCriterion("max_original_price >", value, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_original_price >=", value, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceLessThan(BigDecimal value) {
            addCriterion("max_original_price <", value, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_original_price <=", value, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceIn(List<BigDecimal> values) {
            addCriterion("max_original_price in", values, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceNotIn(List<BigDecimal> values) {
            addCriterion("max_original_price not in", values, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_original_price between", value1, value2, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andMaxOriginalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_original_price not between", value1, value2, "maxOriginalPrice");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(BigDecimal value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(BigDecimal value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(BigDecimal value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<BigDecimal> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNull() {
            addCriterion("max_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNotNull() {
            addCriterion("max_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceEqualTo(BigDecimal value) {
            addCriterion("max_price =", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("max_price <>", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThan(BigDecimal value) {
            addCriterion("max_price >", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price >=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThan(BigDecimal value) {
            addCriterion("max_price <", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price <=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIn(List<BigDecimal> values) {
            addCriterion("max_price in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("max_price not in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price not between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralIsNull() {
            addCriterion("give_integral is null");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralIsNotNull() {
            addCriterion("give_integral is not null");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralEqualTo(Integer value) {
            addCriterion("give_integral =", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralNotEqualTo(Integer value) {
            addCriterion("give_integral <>", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralGreaterThan(Integer value) {
            addCriterion("give_integral >", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_integral >=", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralLessThan(Integer value) {
            addCriterion("give_integral <", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("give_integral <=", value, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralIn(List<Integer> values) {
            addCriterion("give_integral in", values, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralNotIn(List<Integer> values) {
            addCriterion("give_integral not in", values, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralBetween(Integer value1, Integer value2) {
            addCriterion("give_integral between", value1, value2, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andGiveIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("give_integral not between", value1, value2, "giveIntegral");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberIsNull() {
            addCriterion("buy_min_number is null");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberIsNotNull() {
            addCriterion("buy_min_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberEqualTo(Integer value) {
            addCriterion("buy_min_number =", value, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberNotEqualTo(Integer value) {
            addCriterion("buy_min_number <>", value, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberGreaterThan(Integer value) {
            addCriterion("buy_min_number >", value, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_min_number >=", value, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberLessThan(Integer value) {
            addCriterion("buy_min_number <", value, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberLessThanOrEqualTo(Integer value) {
            addCriterion("buy_min_number <=", value, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberIn(List<Integer> values) {
            addCriterion("buy_min_number in", values, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberNotIn(List<Integer> values) {
            addCriterion("buy_min_number not in", values, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberBetween(Integer value1, Integer value2) {
            addCriterion("buy_min_number between", value1, value2, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMinNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_min_number not between", value1, value2, "buyMinNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberIsNull() {
            addCriterion("buy_max_number is null");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberIsNotNull() {
            addCriterion("buy_max_number is not null");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberEqualTo(Integer value) {
            addCriterion("buy_max_number =", value, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberNotEqualTo(Integer value) {
            addCriterion("buy_max_number <>", value, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberGreaterThan(Integer value) {
            addCriterion("buy_max_number >", value, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("buy_max_number >=", value, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberLessThan(Integer value) {
            addCriterion("buy_max_number <", value, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberLessThanOrEqualTo(Integer value) {
            addCriterion("buy_max_number <=", value, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberIn(List<Integer> values) {
            addCriterion("buy_max_number in", values, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberNotIn(List<Integer> values) {
            addCriterion("buy_max_number not in", values, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberBetween(Integer value1, Integer value2) {
            addCriterion("buy_max_number between", value1, value2, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andBuyMaxNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("buy_max_number not between", value1, value2, "buyMaxNumber");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryIsNull() {
            addCriterion("is_deduction_inventory is null");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryIsNotNull() {
            addCriterion("is_deduction_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryEqualTo(Byte value) {
            addCriterion("is_deduction_inventory =", value, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryNotEqualTo(Byte value) {
            addCriterion("is_deduction_inventory <>", value, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryGreaterThan(Byte value) {
            addCriterion("is_deduction_inventory >", value, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_deduction_inventory >=", value, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryLessThan(Byte value) {
            addCriterion("is_deduction_inventory <", value, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryLessThanOrEqualTo(Byte value) {
            addCriterion("is_deduction_inventory <=", value, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryIn(List<Byte> values) {
            addCriterion("is_deduction_inventory in", values, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryNotIn(List<Byte> values) {
            addCriterion("is_deduction_inventory not in", values, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryBetween(Byte value1, Byte value2) {
            addCriterion("is_deduction_inventory between", value1, value2, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsDeductionInventoryNotBetween(Byte value1, Byte value2) {
            addCriterion("is_deduction_inventory not between", value1, value2, "isDeductionInventory");
            return (Criteria) this;
        }

        public Criteria andIsShelvesIsNull() {
            addCriterion("is_shelves is null");
            return (Criteria) this;
        }

        public Criteria andIsShelvesIsNotNull() {
            addCriterion("is_shelves is not null");
            return (Criteria) this;
        }

        public Criteria andIsShelvesEqualTo(Byte value) {
            addCriterion("is_shelves =", value, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesNotEqualTo(Byte value) {
            addCriterion("is_shelves <>", value, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesGreaterThan(Byte value) {
            addCriterion("is_shelves >", value, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_shelves >=", value, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesLessThan(Byte value) {
            addCriterion("is_shelves <", value, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesLessThanOrEqualTo(Byte value) {
            addCriterion("is_shelves <=", value, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesIn(List<Byte> values) {
            addCriterion("is_shelves in", values, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesNotIn(List<Byte> values) {
            addCriterion("is_shelves not in", values, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesBetween(Byte value1, Byte value2) {
            addCriterion("is_shelves between", value1, value2, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsShelvesNotBetween(Byte value1, Byte value2) {
            addCriterion("is_shelves not between", value1, value2, "isShelves");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedIsNull() {
            addCriterion("is_home_recommended is null");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedIsNotNull() {
            addCriterion("is_home_recommended is not null");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedEqualTo(Byte value) {
            addCriterion("is_home_recommended =", value, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedNotEqualTo(Byte value) {
            addCriterion("is_home_recommended <>", value, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedGreaterThan(Byte value) {
            addCriterion("is_home_recommended >", value, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_home_recommended >=", value, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedLessThan(Byte value) {
            addCriterion("is_home_recommended <", value, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedLessThanOrEqualTo(Byte value) {
            addCriterion("is_home_recommended <=", value, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedIn(List<Byte> values) {
            addCriterion("is_home_recommended in", values, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedNotIn(List<Byte> values) {
            addCriterion("is_home_recommended not in", values, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedBetween(Byte value1, Byte value2) {
            addCriterion("is_home_recommended between", value1, value2, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andIsHomeRecommendedNotBetween(Byte value1, Byte value2) {
            addCriterion("is_home_recommended not between", value1, value2, "isHomeRecommended");
            return (Criteria) this;
        }

        public Criteria andPhotoCountIsNull() {
            addCriterion("photo_count is null");
            return (Criteria) this;
        }

        public Criteria andPhotoCountIsNotNull() {
            addCriterion("photo_count is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoCountEqualTo(Byte value) {
            addCriterion("photo_count =", value, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountNotEqualTo(Byte value) {
            addCriterion("photo_count <>", value, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountGreaterThan(Byte value) {
            addCriterion("photo_count >", value, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountGreaterThanOrEqualTo(Byte value) {
            addCriterion("photo_count >=", value, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountLessThan(Byte value) {
            addCriterion("photo_count <", value, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountLessThanOrEqualTo(Byte value) {
            addCriterion("photo_count <=", value, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountIn(List<Byte> values) {
            addCriterion("photo_count in", values, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountNotIn(List<Byte> values) {
            addCriterion("photo_count not in", values, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountBetween(Byte value1, Byte value2) {
            addCriterion("photo_count between", value1, value2, "photoCount");
            return (Criteria) this;
        }

        public Criteria andPhotoCountNotBetween(Byte value1, Byte value2) {
            addCriterion("photo_count not between", value1, value2, "photoCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountIsNull() {
            addCriterion("sales_count is null");
            return (Criteria) this;
        }

        public Criteria andSalesCountIsNotNull() {
            addCriterion("sales_count is not null");
            return (Criteria) this;
        }

        public Criteria andSalesCountEqualTo(Integer value) {
            addCriterion("sales_count =", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountNotEqualTo(Integer value) {
            addCriterion("sales_count <>", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountGreaterThan(Integer value) {
            addCriterion("sales_count >", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sales_count >=", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountLessThan(Integer value) {
            addCriterion("sales_count <", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountLessThanOrEqualTo(Integer value) {
            addCriterion("sales_count <=", value, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountIn(List<Integer> values) {
            addCriterion("sales_count in", values, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountNotIn(List<Integer> values) {
            addCriterion("sales_count not in", values, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountBetween(Integer value1, Integer value2) {
            addCriterion("sales_count between", value1, value2, "salesCount");
            return (Criteria) this;
        }

        public Criteria andSalesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("sales_count not between", value1, value2, "salesCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountIsNull() {
            addCriterion("access_count is null");
            return (Criteria) this;
        }

        public Criteria andAccessCountIsNotNull() {
            addCriterion("access_count is not null");
            return (Criteria) this;
        }

        public Criteria andAccessCountEqualTo(Integer value) {
            addCriterion("access_count =", value, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountNotEqualTo(Integer value) {
            addCriterion("access_count <>", value, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountGreaterThan(Integer value) {
            addCriterion("access_count >", value, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("access_count >=", value, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountLessThan(Integer value) {
            addCriterion("access_count <", value, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountLessThanOrEqualTo(Integer value) {
            addCriterion("access_count <=", value, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountIn(List<Integer> values) {
            addCriterion("access_count in", values, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountNotIn(List<Integer> values) {
            addCriterion("access_count not in", values, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountBetween(Integer value1, Integer value2) {
            addCriterion("access_count between", value1, value2, "accessCount");
            return (Criteria) this;
        }

        public Criteria andAccessCountNotBetween(Integer value1, Integer value2) {
            addCriterion("access_count not between", value1, value2, "accessCount");
            return (Criteria) this;
        }

        public Criteria andVideoIsNull() {
            addCriterion("video is null");
            return (Criteria) this;
        }

        public Criteria andVideoIsNotNull() {
            addCriterion("video is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEqualTo(String value) {
            addCriterion("video =", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotEqualTo(String value) {
            addCriterion("video <>", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThan(String value) {
            addCriterion("video >", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoGreaterThanOrEqualTo(String value) {
            addCriterion("video >=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThan(String value) {
            addCriterion("video <", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLessThanOrEqualTo(String value) {
            addCriterion("video <=", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoLike(String value) {
            addCriterion("video like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotLike(String value) {
            addCriterion("video not like", value, "video");
            return (Criteria) this;
        }

        public Criteria andVideoIn(List<String> values) {
            addCriterion("video in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotIn(List<String> values) {
            addCriterion("video not in", values, "video");
            return (Criteria) this;
        }

        public Criteria andVideoBetween(String value1, String value2) {
            addCriterion("video between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andVideoNotBetween(String value1, String value2) {
            addCriterion("video not between", value1, value2, "video");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesIsNull() {
            addCriterion("home_recommended_images is null");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesIsNotNull() {
            addCriterion("home_recommended_images is not null");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesEqualTo(String value) {
            addCriterion("home_recommended_images =", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesNotEqualTo(String value) {
            addCriterion("home_recommended_images <>", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesGreaterThan(String value) {
            addCriterion("home_recommended_images >", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesGreaterThanOrEqualTo(String value) {
            addCriterion("home_recommended_images >=", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesLessThan(String value) {
            addCriterion("home_recommended_images <", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesLessThanOrEqualTo(String value) {
            addCriterion("home_recommended_images <=", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesLike(String value) {
            addCriterion("home_recommended_images like", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesNotLike(String value) {
            addCriterion("home_recommended_images not like", value, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesIn(List<String> values) {
            addCriterion("home_recommended_images in", values, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesNotIn(List<String> values) {
            addCriterion("home_recommended_images not in", values, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesBetween(String value1, String value2) {
            addCriterion("home_recommended_images between", value1, value2, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andHomeRecommendedImagesNotBetween(String value1, String value2) {
            addCriterion("home_recommended_images not between", value1, value2, "homeRecommendedImages");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeIsNull() {
            addCriterion("is_delete_time is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeIsNotNull() {
            addCriterion("is_delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeEqualTo(Integer value) {
            addCriterion("is_delete_time =", value, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeNotEqualTo(Integer value) {
            addCriterion("is_delete_time <>", value, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeGreaterThan(Integer value) {
            addCriterion("is_delete_time >", value, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete_time >=", value, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeLessThan(Integer value) {
            addCriterion("is_delete_time <", value, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete_time <=", value, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeIn(List<Integer> values) {
            addCriterion("is_delete_time in", values, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeNotIn(List<Integer> values) {
            addCriterion("is_delete_time not in", values, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeBetween(Integer value1, Integer value2) {
            addCriterion("is_delete_time between", value1, value2, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete_time not between", value1, value2, "isDeleteTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Integer value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Integer value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Integer value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Integer value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Integer value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Integer> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Integer> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Integer value1, Integer value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
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