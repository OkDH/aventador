package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.math.BigDecimal;

public class ViewTodayStock {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.symbol
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private String symbol;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.stock_date
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private LocalDate stockDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.price_high
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal priceHigh;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.price_low
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal priceLow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.price_close
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal priceClose;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.price_open
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal priceOpen;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.prev_close
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal prevClose;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.chg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal chg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.chgp
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal chgp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.volume
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private Long volume;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.up_avg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal upAvg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.dw_avg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal dwAvg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.rsi
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private BigDecimal rsi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.view_today_stock.update_time
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	private LocalDateTime updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.symbol
	 * @return  the value of aventador.view_today_stock.symbol
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.symbol
	 * @param symbol  the value for aventador.view_today_stock.symbol
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.stock_date
	 * @return  the value of aventador.view_today_stock.stock_date
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public LocalDate getStockDate() {
		return stockDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.stock_date
	 * @param stockDate  the value for aventador.view_today_stock.stock_date
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setStockDate(LocalDate stockDate) {
		this.stockDate = stockDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.price_high
	 * @return  the value of aventador.view_today_stock.price_high
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getPriceHigh() {
		return priceHigh;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.price_high
	 * @param priceHigh  the value for aventador.view_today_stock.price_high
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setPriceHigh(BigDecimal priceHigh) {
		this.priceHigh = priceHigh;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.price_low
	 * @return  the value of aventador.view_today_stock.price_low
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getPriceLow() {
		return priceLow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.price_low
	 * @param priceLow  the value for aventador.view_today_stock.price_low
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setPriceLow(BigDecimal priceLow) {
		this.priceLow = priceLow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.price_close
	 * @return  the value of aventador.view_today_stock.price_close
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getPriceClose() {
		return priceClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.price_close
	 * @param priceClose  the value for aventador.view_today_stock.price_close
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setPriceClose(BigDecimal priceClose) {
		this.priceClose = priceClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.price_open
	 * @return  the value of aventador.view_today_stock.price_open
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getPriceOpen() {
		return priceOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.price_open
	 * @param priceOpen  the value for aventador.view_today_stock.price_open
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setPriceOpen(BigDecimal priceOpen) {
		this.priceOpen = priceOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.prev_close
	 * @return  the value of aventador.view_today_stock.prev_close
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getPrevClose() {
		return prevClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.prev_close
	 * @param prevClose  the value for aventador.view_today_stock.prev_close
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setPrevClose(BigDecimal prevClose) {
		this.prevClose = prevClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.chg
	 * @return  the value of aventador.view_today_stock.chg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getChg() {
		return chg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.chg
	 * @param chg  the value for aventador.view_today_stock.chg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setChg(BigDecimal chg) {
		this.chg = chg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.chgp
	 * @return  the value of aventador.view_today_stock.chgp
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getChgp() {
		return chgp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.chgp
	 * @param chgp  the value for aventador.view_today_stock.chgp
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setChgp(BigDecimal chgp) {
		this.chgp = chgp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.volume
	 * @return  the value of aventador.view_today_stock.volume
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public Long getVolume() {
		return volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.volume
	 * @param volume  the value for aventador.view_today_stock.volume
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.up_avg
	 * @return  the value of aventador.view_today_stock.up_avg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getUpAvg() {
		return upAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.up_avg
	 * @param upAvg  the value for aventador.view_today_stock.up_avg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setUpAvg(BigDecimal upAvg) {
		this.upAvg = upAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.dw_avg
	 * @return  the value of aventador.view_today_stock.dw_avg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getDwAvg() {
		return dwAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.dw_avg
	 * @param dwAvg  the value for aventador.view_today_stock.dw_avg
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setDwAvg(BigDecimal dwAvg) {
		this.dwAvg = dwAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.rsi
	 * @return  the value of aventador.view_today_stock.rsi
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public BigDecimal getRsi() {
		return rsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.rsi
	 * @param rsi  the value for aventador.view_today_stock.rsi
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setRsi(BigDecimal rsi) {
		this.rsi = rsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.view_today_stock.update_time
	 * @return  the value of aventador.view_today_stock.update_time
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.view_today_stock.update_time
	 * @param updateTime  the value for aventador.view_today_stock.update_time
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
}