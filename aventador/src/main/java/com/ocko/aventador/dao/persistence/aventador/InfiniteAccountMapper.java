package com.ocko.aventador.dao.persistence.aventador;

import com.ocko.aventador.dao.model.aventador.InfiniteAccount;
import com.ocko.aventador.dao.model.aventador.InfiniteAccountExample;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.cursor.Cursor;

public interface InfiniteAccountMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	long countByExample(InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_account.
	 * @mbggenerated
	 */
	void truncate();

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int deleteByExample(InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int deleteByPrimaryKey(Integer accountId);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_account.
	 * @mbggenerated
	 */
	int insertIgnore(InfiniteAccount record);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_account.
	 * @mbggenerated
	 */
	int upsert(InfiniteAccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int insert(InfiniteAccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int insertSelective(InfiniteAccount record);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_account.
	 * @mbggenerated
	 */
	Cursor<InfiniteAccount> cursorByExample(InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator Soov Plugins. This method corresponds to the database table aventador.infinite_account.
	 * @mbggenerated
	 */
	List<List<InfiniteAccount>> selectPksByExample(InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	List<InfiniteAccount> selectByExample(InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	InfiniteAccount selectByPrimaryKey(Integer accountId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int updateByExampleSelective(@Param("record") InfiniteAccount record,
			@Param("example") InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int updateByExample(@Param("record") InfiniteAccount record, @Param("example") InfiniteAccountExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int updateByPrimaryKeySelective(InfiniteAccount record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table aventador.infinite_account
	 * @mbg.generated  Tue Mar 22 15:03:57 KST 2022
	 */
	int updateByPrimaryKey(InfiniteAccount record);

	/**
	 * 계좌 ?���? 총합
	 * @param query
	 * @return
	 */
	BigDecimal sumByAccountSeed(Map<String, Object> query);
}