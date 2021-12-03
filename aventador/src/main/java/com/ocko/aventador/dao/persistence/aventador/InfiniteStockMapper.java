package com.ocko.aventador.dao.persistence.aventador;

import com.ocko.aventador.dao.model.aventador.InfiniteStock;
import com.ocko.aventador.dao.model.aventador.InfiniteStockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

public interface InfiniteStockMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	long countByExample(InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_stock.
	 * @mbggenerated
	 */
	void truncate();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int deleteByExample(InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int deleteByPrimaryKey(Integer infiniteId);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_stock.
	 * @mbggenerated
	 */
	int insertIgnore(InfiniteStock record);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_stock.
	 * @mbggenerated
	 */
	int upsert(InfiniteStock record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int insert(InfiniteStock record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int insertSelective(InfiniteStock record);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_stock.
	 * @mbggenerated
	 */
	Cursor<InfiniteStock> cursorByExample(InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_stock.
	 * @mbggenerated
	 */
	List<List<InfiniteStock>> selectPksByExample(InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	List<InfiniteStock> selectByExample(InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	InfiniteStock selectByPrimaryKey(Integer infiniteId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int updateByExampleSelective(@Param("record") InfiniteStock record, @Param("example") InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int updateByExample(@Param("record") InfiniteStock record, @Param("example") InfiniteStockExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int updateByPrimaryKeySelective(InfiniteStock record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_stock
	 * @mbg.generated  Fri Dec 03 16:33:09 KST 2021
	 */
	int updateByPrimaryKey(InfiniteStock record);
}