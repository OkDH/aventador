package com.ocko.aventador.dao.persistence.aventador;

import com.ocko.aventador.dao.model.aventador.StockHistory;
import com.ocko.aventador.dao.model.aventador.StockHistoryExample;
import com.ocko.aventador.dao.model.aventador.StockHistoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

public interface StockHistoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	long countByExample(StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.stock_history.
	 * @mbggenerated
	 */
	void truncate();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int deleteByExample(StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int deleteByPrimaryKey(StockHistoryKey key);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.stock_history.
	 * @mbggenerated
	 */
	int insertIgnore(StockHistory record);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.stock_history.
	 * @mbggenerated
	 */
	int upsert(StockHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int insert(StockHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int insertSelective(StockHistory record);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.stock_history.
	 * @mbggenerated
	 */
	Cursor<StockHistory> cursorByExample(StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.stock_history.
	 * @mbggenerated
	 */
	List<List<StockHistory>> selectPksByExample(StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	List<StockHistory> selectByExample(StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	StockHistory selectByPrimaryKey(StockHistoryKey key);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int updateByExampleSelective(@Param("record") StockHistory record, @Param("example") StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int updateByExample(@Param("record") StockHistory record, @Param("example") StockHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int updateByPrimaryKeySelective(StockHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.stock_history
	 * @mbg.generated  Sat Nov 27 16:40:02 KST 2021
	 */
	int updateByPrimaryKey(StockHistory record);
}