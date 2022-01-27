package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;

public class InfiniteAccountExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public InfiniteAccountExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
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
	 * This class was generated by MyBatis Generator. This class corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
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

		public Criteria andAccountAliasIsNull() {
			addCriterion("account_alias is null");
			return (Criteria) this;
		}

		public Criteria andAccountAliasIsNotNull() {
			addCriterion("account_alias is not null");
			return (Criteria) this;
		}

		public Criteria andAccountAliasEqualTo(String value) {
			addCriterion("account_alias =", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasNotEqualTo(String value) {
			addCriterion("account_alias <>", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasGreaterThan(String value) {
			addCriterion("account_alias >", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasGreaterThanOrEqualTo(String value) {
			addCriterion("account_alias >=", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasLessThan(String value) {
			addCriterion("account_alias <", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasLessThanOrEqualTo(String value) {
			addCriterion("account_alias <=", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasLike(String value) {
			addCriterion("account_alias like", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasNotLike(String value) {
			addCriterion("account_alias not like", value, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasIn(List<String> values) {
			addCriterion("account_alias in", values, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasNotIn(List<String> values) {
			addCriterion("account_alias not in", values, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasBetween(String value1, String value2) {
			addCriterion("account_alias between", value1, value2, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountAliasNotBetween(String value1, String value2) {
			addCriterion("account_alias not between", value1, value2, "accountAlias");
			return (Criteria) this;
		}

		public Criteria andAccountOrderIsNull() {
			addCriterion("account_order is null");
			return (Criteria) this;
		}

		public Criteria andAccountOrderIsNotNull() {
			addCriterion("account_order is not null");
			return (Criteria) this;
		}

		public Criteria andAccountOrderEqualTo(Integer value) {
			addCriterion("account_order =", value, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderNotEqualTo(Integer value) {
			addCriterion("account_order <>", value, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderGreaterThan(Integer value) {
			addCriterion("account_order >", value, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderGreaterThanOrEqualTo(Integer value) {
			addCriterion("account_order >=", value, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderLessThan(Integer value) {
			addCriterion("account_order <", value, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderLessThanOrEqualTo(Integer value) {
			addCriterion("account_order <=", value, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderIn(List<Integer> values) {
			addCriterion("account_order in", values, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderNotIn(List<Integer> values) {
			addCriterion("account_order not in", values, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderBetween(Integer value1, Integer value2) {
			addCriterion("account_order between", value1, value2, "accountOrder");
			return (Criteria) this;
		}

		public Criteria andAccountOrderNotBetween(Integer value1, Integer value2) {
			addCriterion("account_order not between", value1, value2, "accountOrder");
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

		public Criteria andFeesPerIsNull() {
			addCriterion("fees_per is null");
			return (Criteria) this;
		}

		public Criteria andFeesPerIsNotNull() {
			addCriterion("fees_per is not null");
			return (Criteria) this;
		}

		public Criteria andFeesPerEqualTo(BigDecimal value) {
			addCriterion("fees_per =", value, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerNotEqualTo(BigDecimal value) {
			addCriterion("fees_per <>", value, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerGreaterThan(BigDecimal value) {
			addCriterion("fees_per >", value, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("fees_per >=", value, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerLessThan(BigDecimal value) {
			addCriterion("fees_per <", value, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerLessThanOrEqualTo(BigDecimal value) {
			addCriterion("fees_per <=", value, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerIn(List<BigDecimal> values) {
			addCriterion("fees_per in", values, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerNotIn(List<BigDecimal> values) {
			addCriterion("fees_per not in", values, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fees_per between", value1, value2, "feesPer");
			return (Criteria) this;
		}

		public Criteria andFeesPerNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("fees_per not between", value1, value2, "feesPer");
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

		public Criteria andKskyjSeedIsNull() {
			addCriterion("kskyj_seed is null");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedIsNotNull() {
			addCriterion("kskyj_seed is not null");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedEqualTo(BigDecimal value) {
			addCriterion("kskyj_seed =", value, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedNotEqualTo(BigDecimal value) {
			addCriterion("kskyj_seed <>", value, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedGreaterThan(BigDecimal value) {
			addCriterion("kskyj_seed >", value, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedGreaterThanOrEqualTo(BigDecimal value) {
			addCriterion("kskyj_seed >=", value, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedLessThan(BigDecimal value) {
			addCriterion("kskyj_seed <", value, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedLessThanOrEqualTo(BigDecimal value) {
			addCriterion("kskyj_seed <=", value, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedIn(List<BigDecimal> values) {
			addCriterion("kskyj_seed in", values, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedNotIn(List<BigDecimal> values) {
			addCriterion("kskyj_seed not in", values, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("kskyj_seed between", value1, value2, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjSeedNotBetween(BigDecimal value1, BigDecimal value2) {
			addCriterion("kskyj_seed not between", value1, value2, "kskyjSeed");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateIsNull() {
			addCriterion("kskyj_update_date is null");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateIsNotNull() {
			addCriterion("kskyj_update_date is not null");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateEqualTo(LocalDateTime value) {
			addCriterion("kskyj_update_date =", value, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateNotEqualTo(LocalDateTime value) {
			addCriterion("kskyj_update_date <>", value, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateGreaterThan(LocalDateTime value) {
			addCriterion("kskyj_update_date >", value, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("kskyj_update_date >=", value, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateLessThan(LocalDateTime value) {
			addCriterion("kskyj_update_date <", value, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("kskyj_update_date <=", value, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateIn(List<LocalDateTime> values) {
			addCriterion("kskyj_update_date in", values, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateNotIn(List<LocalDateTime> values) {
			addCriterion("kskyj_update_date not in", values, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("kskyj_update_date between", value1, value2, "kskyjUpdateDate");
			return (Criteria) this;
		}

		public Criteria andKskyjUpdateDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("kskyj_update_date not between", value1, value2, "kskyjUpdateDate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Thu Jan 27 18:01:57 KST 2022
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
     * This class corresponds to the database table aventador.infinite_account
     *
     * @mbg.generated do_not_delete_during_merge Thu Dec 02 22:23:22 KST 2021
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}