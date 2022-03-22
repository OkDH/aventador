package com.ocko.aventador.dao.model.aventador;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ViewInfiniteList {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.member_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Integer memberId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.account_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Integer accountId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.infinite_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Integer infiniteId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.symbol
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private String symbol;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.seed
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal seed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.fees_per
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal feesPer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.infinite_type
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private String infiniteType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.infinite_state
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private String infiniteState;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.infinite_version
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private String infiniteVersion;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.started_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private LocalDate startedDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.registered_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private LocalDateTime registeredDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.done_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private LocalDate doneDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.is_auto_trade
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Boolean isAutoTrade;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.kskyj_seed
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal kskyjSeed;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.kskyj_average_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal kskyjAveragePrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.kskyj_buy_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal kskyjBuyPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.kskyj_holding_quantity
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Integer kskyjHoldingQuantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.kskyj_update_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private LocalDateTime kskyjUpdateDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.is_kskyj
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Boolean isKskyj;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.holding_quantity
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private Integer holdingQuantity;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.total_buy_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal totalBuyPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_list.total_sell_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	private BigDecimal totalSellPrice;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.member_id
	 * @return  the value of aventador.view_infinite_list.member_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Integer getMemberId() {
		return memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.member_id
	 * @param memberId  the value for aventador.view_infinite_list.member_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.account_id
	 * @return  the value of aventador.view_infinite_list.account_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Integer getAccountId() {
		return accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.account_id
	 * @param accountId  the value for aventador.view_infinite_list.account_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.infinite_id
	 * @return  the value of aventador.view_infinite_list.infinite_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Integer getInfiniteId() {
		return infiniteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.infinite_id
	 * @param infiniteId  the value for aventador.view_infinite_list.infinite_id
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setInfiniteId(Integer infiniteId) {
		this.infiniteId = infiniteId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.symbol
	 * @return  the value of aventador.view_infinite_list.symbol
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.symbol
	 * @param symbol  the value for aventador.view_infinite_list.symbol
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.seed
	 * @return  the value of aventador.view_infinite_list.seed
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getSeed() {
		return seed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.seed
	 * @param seed  the value for aventador.view_infinite_list.seed
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setSeed(BigDecimal seed) {
		this.seed = seed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.fees_per
	 * @return  the value of aventador.view_infinite_list.fees_per
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getFeesPer() {
		return feesPer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.fees_per
	 * @param feesPer  the value for aventador.view_infinite_list.fees_per
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setFeesPer(BigDecimal feesPer) {
		this.feesPer = feesPer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.infinite_type
	 * @return  the value of aventador.view_infinite_list.infinite_type
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public String getInfiniteType() {
		return infiniteType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.infinite_type
	 * @param infiniteType  the value for aventador.view_infinite_list.infinite_type
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setInfiniteType(String infiniteType) {
		this.infiniteType = infiniteType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.infinite_state
	 * @return  the value of aventador.view_infinite_list.infinite_state
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public String getInfiniteState() {
		return infiniteState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.infinite_state
	 * @param infiniteState  the value for aventador.view_infinite_list.infinite_state
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setInfiniteState(String infiniteState) {
		this.infiniteState = infiniteState;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.infinite_version
	 * @return  the value of aventador.view_infinite_list.infinite_version
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public String getInfiniteVersion() {
		return infiniteVersion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.infinite_version
	 * @param infiniteVersion  the value for aventador.view_infinite_list.infinite_version
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setInfiniteVersion(String infiniteVersion) {
		this.infiniteVersion = infiniteVersion;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.started_date
	 * @return  the value of aventador.view_infinite_list.started_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public LocalDate getStartedDate() {
		return startedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.started_date
	 * @param startedDate  the value for aventador.view_infinite_list.started_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setStartedDate(LocalDate startedDate) {
		this.startedDate = startedDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.registered_date
	 * @return  the value of aventador.view_infinite_list.registered_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public LocalDateTime getRegisteredDate() {
		return registeredDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.registered_date
	 * @param registeredDate  the value for aventador.view_infinite_list.registered_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setRegisteredDate(LocalDateTime registeredDate) {
		this.registeredDate = registeredDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.done_date
	 * @return  the value of aventador.view_infinite_list.done_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public LocalDate getDoneDate() {
		return doneDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.done_date
	 * @param doneDate  the value for aventador.view_infinite_list.done_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setDoneDate(LocalDate doneDate) {
		this.doneDate = doneDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.is_auto_trade
	 * @return  the value of aventador.view_infinite_list.is_auto_trade
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Boolean getIsAutoTrade() {
		return isAutoTrade;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.is_auto_trade
	 * @param isAutoTrade  the value for aventador.view_infinite_list.is_auto_trade
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setIsAutoTrade(Boolean isAutoTrade) {
		this.isAutoTrade = isAutoTrade;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.kskyj_seed
	 * @return  the value of aventador.view_infinite_list.kskyj_seed
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getKskyjSeed() {
		return kskyjSeed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.kskyj_seed
	 * @param kskyjSeed  the value for aventador.view_infinite_list.kskyj_seed
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setKskyjSeed(BigDecimal kskyjSeed) {
		this.kskyjSeed = kskyjSeed;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.kskyj_average_price
	 * @return  the value of aventador.view_infinite_list.kskyj_average_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getKskyjAveragePrice() {
		return kskyjAveragePrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.kskyj_average_price
	 * @param kskyjAveragePrice  the value for aventador.view_infinite_list.kskyj_average_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setKskyjAveragePrice(BigDecimal kskyjAveragePrice) {
		this.kskyjAveragePrice = kskyjAveragePrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.kskyj_buy_price
	 * @return  the value of aventador.view_infinite_list.kskyj_buy_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getKskyjBuyPrice() {
		return kskyjBuyPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.kskyj_buy_price
	 * @param kskyjBuyPrice  the value for aventador.view_infinite_list.kskyj_buy_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setKskyjBuyPrice(BigDecimal kskyjBuyPrice) {
		this.kskyjBuyPrice = kskyjBuyPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.kskyj_holding_quantity
	 * @return  the value of aventador.view_infinite_list.kskyj_holding_quantity
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Integer getKskyjHoldingQuantity() {
		return kskyjHoldingQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.kskyj_holding_quantity
	 * @param kskyjHoldingQuantity  the value for aventador.view_infinite_list.kskyj_holding_quantity
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setKskyjHoldingQuantity(Integer kskyjHoldingQuantity) {
		this.kskyjHoldingQuantity = kskyjHoldingQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.kskyj_update_date
	 * @return  the value of aventador.view_infinite_list.kskyj_update_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public LocalDateTime getKskyjUpdateDate() {
		return kskyjUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.kskyj_update_date
	 * @param kskyjUpdateDate  the value for aventador.view_infinite_list.kskyj_update_date
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setKskyjUpdateDate(LocalDateTime kskyjUpdateDate) {
		this.kskyjUpdateDate = kskyjUpdateDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.is_kskyj
	 * @return  the value of aventador.view_infinite_list.is_kskyj
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Boolean getIsKskyj() {
		return isKskyj;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.is_kskyj
	 * @param isKskyj  the value for aventador.view_infinite_list.is_kskyj
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setIsKskyj(Boolean isKskyj) {
		this.isKskyj = isKskyj;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.holding_quantity
	 * @return  the value of aventador.view_infinite_list.holding_quantity
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public Integer getHoldingQuantity() {
		return holdingQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.holding_quantity
	 * @param holdingQuantity  the value for aventador.view_infinite_list.holding_quantity
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setHoldingQuantity(Integer holdingQuantity) {
		this.holdingQuantity = holdingQuantity;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.total_buy_price
	 * @return  the value of aventador.view_infinite_list.total_buy_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getTotalBuyPrice() {
		return totalBuyPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.total_buy_price
	 * @param totalBuyPrice  the value for aventador.view_infinite_list.total_buy_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setTotalBuyPrice(BigDecimal totalBuyPrice) {
		this.totalBuyPrice = totalBuyPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_list.total_sell_price
	 * @return  the value of aventador.view_infinite_list.total_sell_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public BigDecimal getTotalSellPrice() {
		return totalSellPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_list.total_sell_price
	 * @param totalSellPrice  the value for aventador.view_infinite_list.total_sell_price
	 * @mbg.generated  Tue Mar 22 20:08:04 KST 2022
	 */
	public void setTotalSellPrice(BigDecimal totalSellPrice) {
		this.totalSellPrice = totalSellPrice;
	}
}