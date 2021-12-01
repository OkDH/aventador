package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class InfiniteHistoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table {0}
     *
     * @mbggenerated
     */
    private Integer limit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table {0}
     *
     * @mbggenerated
     */
    private Integer offset;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public InfiniteHistoryExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table {0}
     *
     * @mbggenerated
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andInfiniteHistoryIdIsNull() {
            addCriterion("infinite_history_id is null");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdIsNotNull() {
            addCriterion("infinite_history_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdEqualTo(Integer value) {
            addCriterion("infinite_history_id =", value, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdNotEqualTo(Integer value) {
            addCriterion("infinite_history_id <>", value, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdGreaterThan(Integer value) {
            addCriterion("infinite_history_id >", value, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("infinite_history_id >=", value, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdLessThan(Integer value) {
            addCriterion("infinite_history_id <", value, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("infinite_history_id <=", value, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdIn(List<Integer> values) {
            addCriterion("infinite_history_id in", values, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdNotIn(List<Integer> values) {
            addCriterion("infinite_history_id not in", values, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdBetween(Integer value1, Integer value2) {
            addCriterion("infinite_history_id between", value1, value2, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteHistoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("infinite_history_id not between", value1, value2, "infiniteHistoryId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdIsNull() {
            addCriterion("infinite_id is null");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdIsNotNull() {
            addCriterion("infinite_id is not null");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdEqualTo(Integer value) {
            addCriterion("infinite_id =", value, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdNotEqualTo(Integer value) {
            addCriterion("infinite_id <>", value, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdGreaterThan(Integer value) {
            addCriterion("infinite_id >", value, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("infinite_id >=", value, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdLessThan(Integer value) {
            addCriterion("infinite_id <", value, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdLessThanOrEqualTo(Integer value) {
            addCriterion("infinite_id <=", value, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdIn(List<Integer> values) {
            addCriterion("infinite_id in", values, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdNotIn(List<Integer> values) {
            addCriterion("infinite_id not in", values, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdBetween(Integer value1, Integer value2) {
            addCriterion("infinite_id between", value1, value2, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andInfiniteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("infinite_id not between", value1, value2, "infiniteId");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNull() {
            addCriterion("trade_date is null");
            return (Criteria) this;
        }

        public Criteria andTradeDateIsNotNull() {
            addCriterion("trade_date is not null");
            return (Criteria) this;
        }

        public Criteria andTradeDateEqualTo(LocalDate value) {
            addCriterion("trade_date =", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotEqualTo(LocalDate value) {
            addCriterion("trade_date <>", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThan(LocalDate value) {
            addCriterion("trade_date >", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateGreaterThanOrEqualTo(LocalDate value) {
            addCriterion("trade_date >=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThan(LocalDate value) {
            addCriterion("trade_date <", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateLessThanOrEqualTo(LocalDate value) {
            addCriterion("trade_date <=", value, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateIn(List<LocalDate> values) {
            addCriterion("trade_date in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotIn(List<LocalDate> values) {
            addCriterion("trade_date not in", values, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateBetween(LocalDate value1, LocalDate value2) {
            addCriterion("trade_date between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeDateNotBetween(LocalDate value1, LocalDate value2) {
            addCriterion("trade_date not between", value1, value2, "tradeDate");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNull() {
            addCriterion("trade_type is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("trade_type is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(String value) {
            addCriterion("trade_type =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(String value) {
            addCriterion("trade_type <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(String value) {
            addCriterion("trade_type >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("trade_type >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(String value) {
            addCriterion("trade_type <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(String value) {
            addCriterion("trade_type <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLike(String value) {
            addCriterion("trade_type like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotLike(String value) {
            addCriterion("trade_type not like", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<String> values) {
            addCriterion("trade_type in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<String> values) {
            addCriterion("trade_type not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(String value1, String value2) {
            addCriterion("trade_type between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(String value1, String value2) {
            addCriterion("trade_type not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(Float value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(Float value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(Float value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(Float value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(Float value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<Float> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<Float> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(Float value1, Float value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(Float value1, Float value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andFeesIsNull() {
            addCriterion("fees is null");
            return (Criteria) this;
        }

        public Criteria andFeesIsNotNull() {
            addCriterion("fees is not null");
            return (Criteria) this;
        }

        public Criteria andFeesEqualTo(Float value) {
            addCriterion("fees =", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesNotEqualTo(Float value) {
            addCriterion("fees <>", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesGreaterThan(Float value) {
            addCriterion("fees >", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesGreaterThanOrEqualTo(Float value) {
            addCriterion("fees >=", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesLessThan(Float value) {
            addCriterion("fees <", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesLessThanOrEqualTo(Float value) {
            addCriterion("fees <=", value, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesIn(List<Float> values) {
            addCriterion("fees in", values, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesNotIn(List<Float> values) {
            addCriterion("fees not in", values, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesBetween(Float value1, Float value2) {
            addCriterion("fees between", value1, value2, "fees");
            return (Criteria) this;
        }

        public Criteria andFeesNotBetween(Float value1, Float value2) {
            addCriterion("fees not between", value1, value2, "fees");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeIsNull() {
            addCriterion("registered_type is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeIsNotNull() {
            addCriterion("registered_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeEqualTo(String value) {
            addCriterion("registered_type =", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeNotEqualTo(String value) {
            addCriterion("registered_type <>", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeGreaterThan(String value) {
            addCriterion("registered_type >", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeGreaterThanOrEqualTo(String value) {
            addCriterion("registered_type >=", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeLessThan(String value) {
            addCriterion("registered_type <", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeLessThanOrEqualTo(String value) {
            addCriterion("registered_type <=", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeLike(String value) {
            addCriterion("registered_type like", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeNotLike(String value) {
            addCriterion("registered_type not like", value, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeIn(List<String> values) {
            addCriterion("registered_type in", values, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeNotIn(List<String> values) {
            addCriterion("registered_type not in", values, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeBetween(String value1, String value2) {
            addCriterion("registered_type between", value1, value2, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredTypeNotBetween(String value1, String value2) {
            addCriterion("registered_type not between", value1, value2, "registeredType");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateIsNull() {
            addCriterion("registered_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateIsNotNull() {
            addCriterion("registered_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateEqualTo(LocalDateTime value) {
            addCriterion("registered_date =", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateNotEqualTo(LocalDateTime value) {
            addCriterion("registered_date <>", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateGreaterThan(LocalDateTime value) {
            addCriterion("registered_date >", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("registered_date >=", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateLessThan(LocalDateTime value) {
            addCriterion("registered_date <", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("registered_date <=", value, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateIn(List<LocalDateTime> values) {
            addCriterion("registered_date in", values, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateNotIn(List<LocalDateTime> values) {
            addCriterion("registered_date not in", values, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("registered_date between", value1, value2, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andRegisteredDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("registered_date not between", value1, value2, "registeredDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updated_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(LocalDateTime value) {
            addCriterion("updated_date =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(LocalDateTime value) {
            addCriterion("updated_date <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(LocalDateTime value) {
            addCriterion("updated_date >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_date >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(LocalDateTime value) {
            addCriterion("updated_date <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("updated_date <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<LocalDateTime> values) {
            addCriterion("updated_date in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<LocalDateTime> values) {
            addCriterion("updated_date not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_date between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("updated_date not between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated do_not_delete_during_merge Wed Dec 01 18:36:45 KST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.infinite_history
     *
     * @mbg.generated Wed Dec 01 18:36:45 KST 2021
     */
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