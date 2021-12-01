package com.ocko.aventador.dao.model.aventador;

import java.time.LocalDateTime;

public class MemberInfo {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.member_id
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private Integer memberId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.member_email
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private String memberEmail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.member_status
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private String memberStatus;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.member_roles
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private String memberRoles;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.subscription_date
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private LocalDateTime subscriptionDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.unsubscription_date
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private LocalDateTime unsubscriptionDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.etc_info
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private String etcInfo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column aventador.member_info.member_name
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	private String memberName;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.member_id
	 * @return  the value of aventador.member_info.member_id
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public Integer getMemberId() {
		return memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.member_id
	 * @param memberId  the value for aventador.member_info.member_id
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.member_email
	 * @return  the value of aventador.member_info.member_email
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public String getMemberEmail() {
		return memberEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.member_email
	 * @param memberEmail  the value for aventador.member_info.member_email
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.member_status
	 * @return  the value of aventador.member_info.member_status
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public String getMemberStatus() {
		return memberStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.member_status
	 * @param memberStatus  the value for aventador.member_info.member_status
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setMemberStatus(String memberStatus) {
		this.memberStatus = memberStatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.member_roles
	 * @return  the value of aventador.member_info.member_roles
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public String getMemberRoles() {
		return memberRoles;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.member_roles
	 * @param memberRoles  the value for aventador.member_info.member_roles
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setMemberRoles(String memberRoles) {
		this.memberRoles = memberRoles;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.subscription_date
	 * @return  the value of aventador.member_info.subscription_date
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public LocalDateTime getSubscriptionDate() {
		return subscriptionDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.subscription_date
	 * @param subscriptionDate  the value for aventador.member_info.subscription_date
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setSubscriptionDate(LocalDateTime subscriptionDate) {
		this.subscriptionDate = subscriptionDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.unsubscription_date
	 * @return  the value of aventador.member_info.unsubscription_date
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public LocalDateTime getUnsubscriptionDate() {
		return unsubscriptionDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.unsubscription_date
	 * @param unsubscriptionDate  the value for aventador.member_info.unsubscription_date
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setUnsubscriptionDate(LocalDateTime unsubscriptionDate) {
		this.unsubscriptionDate = unsubscriptionDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.etc_info
	 * @return  the value of aventador.member_info.etc_info
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public String getEtcInfo() {
		return etcInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.etc_info
	 * @param etcInfo  the value for aventador.member_info.etc_info
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setEtcInfo(String etcInfo) {
		this.etcInfo = etcInfo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column aventador.member_info.member_name
	 * @return  the value of aventador.member_info.member_name
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public String getMemberName() {
		return memberName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column aventador.member_info.member_name
	 * @param memberName  the value for aventador.member_info.member_name
	 * @mbg.generated  Wed Dec 01 18:36:45 KST 2021
	 */
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
}