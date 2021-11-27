package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDateTime;

public class StockHistory extends StockHistoryKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_high
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float priceHigh;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_low
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float priceLow;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_close
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float priceClose;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.price_open
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float priceOpen;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.prev_close
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float prevClose;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.chg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float chg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.chgp
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float chgp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.volume
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Long volume;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.up_avg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float upAvg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.dw_avg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float dwAvg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.rsi
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private Float rsi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.update_time
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	private LocalDateTime updateTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_high
	 * @return  the value of aventador.stock_history.price_high
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getPriceHigh() {
		return priceHigh;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_high
	 * @param priceHigh  the value for aventador.stock_history.price_high
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setPriceHigh(Float priceHigh) {
		this.priceHigh = priceHigh;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_low
	 * @return  the value of aventador.stock_history.price_low
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getPriceLow() {
		return priceLow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_low
	 * @param priceLow  the value for aventador.stock_history.price_low
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setPriceLow(Float priceLow) {
		this.priceLow = priceLow;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_close
	 * @return  the value of aventador.stock_history.price_close
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getPriceClose() {
		return priceClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_close
	 * @param priceClose  the value for aventador.stock_history.price_close
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setPriceClose(Float priceClose) {
		this.priceClose = priceClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.price_open
	 * @return  the value of aventador.stock_history.price_open
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getPriceOpen() {
		return priceOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.price_open
	 * @param priceOpen  the value for aventador.stock_history.price_open
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setPriceOpen(Float priceOpen) {
		this.priceOpen = priceOpen;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.prev_close
	 * @return  the value of aventador.stock_history.prev_close
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getPrevClose() {
		return prevClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.prev_close
	 * @param prevClose  the value for aventador.stock_history.prev_close
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setPrevClose(Float prevClose) {
		this.prevClose = prevClose;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.chg
	 * @return  the value of aventador.stock_history.chg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getChg() {
		return chg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.chg
	 * @param chg  the value for aventador.stock_history.chg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setChg(Float chg) {
		this.chg = chg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.chgp
	 * @return  the value of aventador.stock_history.chgp
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getChgp() {
		return chgp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.chgp
	 * @param chgp  the value for aventador.stock_history.chgp
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setChgp(Float chgp) {
		this.chgp = chgp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.volume
	 * @return  the value of aventador.stock_history.volume
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Long getVolume() {
		return volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.volume
	 * @param volume  the value for aventador.stock_history.volume
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.up_avg
	 * @return  the value of aventador.stock_history.up_avg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getUpAvg() {
		return upAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.up_avg
	 * @param upAvg  the value for aventador.stock_history.up_avg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setUpAvg(Float upAvg) {
		this.upAvg = upAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.dw_avg
	 * @return  the value of aventador.stock_history.dw_avg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getDwAvg() {
		return dwAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.dw_avg
	 * @param dwAvg  the value for aventador.stock_history.dw_avg
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setDwAvg(Float dwAvg) {
		this.dwAvg = dwAvg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.rsi
	 * @return  the value of aventador.stock_history.rsi
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public Float getRsi() {
		return rsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.rsi
	 * @param rsi  the value for aventador.stock_history.rsi
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setRsi(Float rsi) {
		this.rsi = rsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.update_time
	 * @return  the value of aventador.stock_history.update_time
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.update_time
	 * @param updateTime  the value for aventador.stock_history.update_time
	 * @mbg.generated  Sat Nov 27 16:34:59 KST 2021
	 */
	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
}