package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDateTime;
import java.math.BigDecimal;

public class StockHistory extends StockHistoryKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_high
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal priceHigh;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_low
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal priceLow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_close
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal priceClose;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_open
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal priceOpen;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.prev_close
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal prevClose;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.chg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal chg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.chgp
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal chgp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.volume
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private Long volume;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.up_avg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal upAvg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.dw_avg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal dwAvg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.rsi
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private BigDecimal rsi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.update_time
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	private LocalDateTime updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_high
	 * @return  the value of aventador.stock_history.price_high
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getPriceHigh() {
		return priceHigh;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_high
	 * @param priceHigh  the value for aventador.stock_history.price_high
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setPriceHigh(BigDecimal priceHigh) {
		this.priceHigh = priceHigh;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_low
	 * @return  the value of aventador.stock_history.price_low
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getPriceLow() {
		return priceLow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_low
	 * @param priceLow  the value for aventador.stock_history.price_low
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setPriceLow(BigDecimal priceLow) {
		this.priceLow = priceLow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_close
	 * @return  the value of aventador.stock_history.price_close
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getPriceClose() {
		return priceClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_close
	 * @param priceClose  the value for aventador.stock_history.price_close
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setPriceClose(BigDecimal priceClose) {
		this.priceClose = priceClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_open
	 * @return  the value of aventador.stock_history.price_open
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getPriceOpen() {
		return priceOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_open
	 * @param priceOpen  the value for aventador.stock_history.price_open
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setPriceOpen(BigDecimal priceOpen) {
		this.priceOpen = priceOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.prev_close
	 * @return  the value of aventador.stock_history.prev_close
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getPrevClose() {
		return prevClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.prev_close
	 * @param prevClose  the value for aventador.stock_history.prev_close
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setPrevClose(BigDecimal prevClose) {
		this.prevClose = prevClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.chg
	 * @return  the value of aventador.stock_history.chg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getChg() {
		return chg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.chg
	 * @param chg  the value for aventador.stock_history.chg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setChg(BigDecimal chg) {
		this.chg = chg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.chgp
	 * @return  the value of aventador.stock_history.chgp
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getChgp() {
		return chgp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.chgp
	 * @param chgp  the value for aventador.stock_history.chgp
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setChgp(BigDecimal chgp) {
		this.chgp = chgp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.volume
	 * @return  the value of aventador.stock_history.volume
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public Long getVolume() {
		return volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.volume
	 * @param volume  the value for aventador.stock_history.volume
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.up_avg
	 * @return  the value of aventador.stock_history.up_avg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getUpAvg() {
		return upAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.up_avg
	 * @param upAvg  the value for aventador.stock_history.up_avg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setUpAvg(BigDecimal upAvg) {
		this.upAvg = upAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.dw_avg
	 * @return  the value of aventador.stock_history.dw_avg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getDwAvg() {
		return dwAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.dw_avg
	 * @param dwAvg  the value for aventador.stock_history.dw_avg
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setDwAvg(BigDecimal dwAvg) {
		this.dwAvg = dwAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.rsi
	 * @return  the value of aventador.stock_history.rsi
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public BigDecimal getRsi() {
		return rsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.rsi
	 * @param rsi  the value for aventador.stock_history.rsi
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setRsi(BigDecimal rsi) {
		this.rsi = rsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.update_time
	 * @return  the value of aventador.stock_history.update_time
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.update_time
	 * @param updateTime  the value for aventador.stock_history.update_time
	 * @mbg.generated  Wed Dec 15 00:30:27 KST 2021
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
}