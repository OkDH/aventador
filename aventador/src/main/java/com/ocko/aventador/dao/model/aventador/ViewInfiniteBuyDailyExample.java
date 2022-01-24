package com.ocko.aventador.dao.model.aventador;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ViewInfiniteBuyDailyExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	protected List<Criteria> oredCriteria;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table {0}
	 * @mbggenerated
	 */
	private Integer limit;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table {0}
	 * @mbggenerated
	 */
	private Integer offset;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public ViewInfiniteBuyDailyExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table {0}
	 * @mbggenerated
	 */
	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table {0}
	 * @mbggenerated
	 */
	public Integer getLimit() {
		return limit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table {0}
	 * @mbggenerated
	 */
	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table {0}
	 * @mbggenerated
	 */
	public Integer getOffset() {
		return offset;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
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

		public Criteria andMemberIdIsNull() {
			addCriterion("member_id is null");
			return (Criteria) this;
		}

		public Criteria andMemberIdIsNotNull() {
			addCriterion("member_id is not null");
			return (Criteria) this;
		}

		public Criteria andMemberIdEqualTo(Integer value) {
			addCriterion("member_id =", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotEqualTo(Integer value) {
			addCriterion("member_id <>", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThan(Integer value) {
			addCriterion("member_id >", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("member_id >=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThan(Integer value) {
			addCriterion("member_id <", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
			addCriterion("member_id <=", value, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdIn(List<Integer> values) {
			addCriterion("member_id in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotIn(List<Integer> values) {
			addCriterion("member_id not in", values, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdBetween(Integer value1, Integer value2) {
			addCriterion("member_id between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
			addCriterion("member_id not between", value1, value2, "memberId");
			return (Criteria) this;
		}

		public Criteria andAccountIdIsNull() {
			addCriterion("account_id is null");
			return (Criteria) this;
		}

		public Criteria andAccountIdIsNotNull() {
			addCriterion("account_id is not null");
			return (Criteria) this;
		}

		public Criteria andAccountIdEqualTo(Integer value) {
			addCriterion("account_id =", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdNotEqualTo(Integer value) {
			addCriterion("account_id <>", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdGreaterThan(Integer value) {
			addCriterion("account_id >", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("account_id >=", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdLessThan(Integer value) {
			addCriterion("account_id <", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
			addCriterion("account_id <=", value, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdIn(List<Integer> values) {
			addCriterion("account_id in", values, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdNotIn(List<Integer> values) {
			addCriterion("account_id not in", values, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdBetween(Integer value1, Integer value2) {
			addCriterion("account_id between", value1, value2, "accountId");
			return (Criteria) this;
		}

		public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
			addCriterion("account_id not between", value1, value2, "accountId");
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

		public Criteria andSymbolIsNull() {
			addCriterion("symbol is null");
			return (Criteria) this;
		}

		public Criteria andSymbolIsNotNull() {
			addCriterion("symbol is not null");
			return (Criteria) this;
		}

		public Criteria andSymbolEqualTo(String value) {
			addCriterion("symbol =", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolNotEqualTo(String value) {
			addCriterion("symbol <>", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolGreaterThan(String value) {
			addCriterion("symbol >", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolGreaterThanOrEqualTo(String value) {
			addCriterion("symbol >=", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolLessThan(String value) {
			addCriterion("symbol <", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolLessThanOrEqualTo(String value) {
			addCriterion("symbol <=", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolLike(String value) {
			addCriterion("symbol like", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolNotLike(String value) {
			addCriterion("symbol not like", value, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolIn(List<String> values) {
			addCriterion("symbol in", values, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolNotIn(List<String> values) {
			addCriterion("symbol not in", values, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolBetween(String value1, String value2) {
			addCriterion("symbol between", value1, value2, "symbol");
			return (Criteria) this;
		}

		public Criteria andSymbolNotBetween(String value1, String value2) {
			addCriterion("symbol not between", value1, value2, "symbol");
			return (Criteria) this;
		}

		public Criteria andSeedIsNull() {
			addCriterion("seed is null");
			return (Criteria) this;
		}

		public Criteria andSeedIsNotNull() {
			addCriterion("seed is not null");
			return (Criteria) this;
		}

		public Criteria andSeedEqualTo(BigDecimal value) {
			addCriterion("seed =", value, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedNotEqualTo(BigDecimal value) {
			addCriterion("seed <>", value, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedGreaterThan(BigDecimal value) {
			addCriterion("seed >", value, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("seed >=", value, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedLessThan(BigDecimal value) {
			addCriterion("seed <", value, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedLessThanOrEqualTo(BigDecimal value) {
			addCriterion("seed <=", value, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedIn(List<BigDecimal> values) {
			addCriterion("seed in", values, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedNotIn(List<BigDecimal> values) {
			addCriterion("seed not in", values, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("seed between", value1, value2, "seed");
			return (Criteria) this;
		}

		public Criteria andSeedNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("seed not between", value1, value2, "seed");
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

		public Criteria andTradePriceIsNull() {
			addCriterion("trade_price is null");
			return (Criteria) this;
		}

		public Criteria andTradePriceIsNotNull() {
			addCriterion("trade_price is not null");
			return (Criteria) this;
		}

		public Criteria andTradePriceEqualTo(BigDecimal value) {
			addCriterion("trade_price =", value, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceNotEqualTo(BigDecimal value) {
			addCriterion("trade_price <>", value, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceGreaterThan(BigDecimal value) {
			addCriterion("trade_price >", value, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("trade_price >=", value, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceLessThan(BigDecimal value) {
			addCriterion("trade_price <", value, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceLessThanOrEqualTo(BigDecimal value) {
			addCriterion("trade_price <=", value, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceIn(List<BigDecimal> values) {
			addCriterion("trade_price in", values, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceNotIn(List<BigDecimal> values) {
			addCriterion("trade_price not in", values, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("trade_price between", value1, value2, "tradePrice");
			return (Criteria) this;
		}

		public Criteria andTradePriceNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("trade_price not between", value1, value2, "tradePrice");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table aventador.view_infinite_buy_daily
	 * @mbg.generated  Mon Jan 24 16:34:42 KST 2022
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table aventador.view_infinite_buy_daily
     *
     * @mbg.generated do_not_delete_during_merge Mon Jan 24 12:09:52 KST 2022
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}