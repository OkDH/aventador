package com.ocko.aventador.dao.model.aventador;

import java.math.BigDecimal;

public class ViewInfiniteProfitMonthly {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_profit_monthly.member_id
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	private Integer memberId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_profit_monthly.account_id
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	private Integer accountId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_profit_monthly.monthly
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	private String monthly;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_infinite_profit_monthly.profit
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	private BigDecimal profit;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_profit_monthly.member_id
	 * @return  the value of aventador.view_infinite_profit_monthly.member_id
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public Integer getMemberId() {
		return memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_profit_monthly.member_id
	 * @param memberId  the value for aventador.view_infinite_profit_monthly.member_id
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_profit_monthly.account_id
	 * @return  the value of aventador.view_infinite_profit_monthly.account_id
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public Integer getAccountId() {
		return accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_profit_monthly.account_id
	 * @param accountId  the value for aventador.view_infinite_profit_monthly.account_id
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_profit_monthly.monthly
	 * @return  the value of aventador.view_infinite_profit_monthly.monthly
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public String getMonthly() {
		return monthly;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_profit_monthly.monthly
	 * @param monthly  the value for aventador.view_infinite_profit_monthly.monthly
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public void setMonthly(String monthly) {
		this.monthly = monthly;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_infinite_profit_monthly.profit
	 * @return  the value of aventador.view_infinite_profit_monthly.profit
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public BigDecimal getProfit() {
		return profit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_infinite_profit_monthly.profit
	 * @param profit  the value for aventador.view_infinite_profit_monthly.profit
	 * @mbg.generated  Wed Dec 15 13:59:06 KST 2021
	 */
	public void setProfit(BigDecimal profit) {
		this.profit = profit;
	}
}