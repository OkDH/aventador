package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDate;

public class StockHistoryKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.symbol
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	private String symbol;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.stock_history.stock_date
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	private LocalDate stockDate;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.symbol
	 * @return  the value of aventador.stock_history.symbol
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.symbol
	 * @param symbol  the value for aventador.stock_history.symbol
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.stock_history.stock_date
	 * @return  the value of aventador.stock_history.stock_date
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	public LocalDate getStockDate() {
		return stockDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.stock_history.stock_date
	 * @param stockDate  the value for aventador.stock_history.stock_date
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	public void setStockDate(LocalDate stockDate) {
		this.stockDate = stockDate;
	}
}