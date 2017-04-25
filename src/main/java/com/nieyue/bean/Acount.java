package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 账户
 * @author 聂跃
 * @date 2017年4月12日
 */
public class Acount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 账户id
	 */
	private Integer acountId;
	/**
	 * 电话
	 */
	private String phone;
	/**
	 * email
	 */
	private String email;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 身份证
	 */
	private String identityCards;
	/**
	 * QQ
	 */
	private String qq;
	/**
	 * 微信号
	 */
	private String wechat;
	/**
	 * 微博
	 */
	private String microblog;
	/**
	 * 创建时间
	 */
	private Date createDate;
	/**
	 * 登陆时间
	 */
	private Date loginDate;
	/**
	 * 角色id外键
	 */
	private Integer roleId;
	public Integer getAcountId() {
		return acountId;
	}
	public void setAcountId(Integer acountId) {
		this.acountId = acountId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentityCards() {
		return identityCards;
	}
	public void setIdentityCards(String identityCards) {
		this.identityCards = identityCards;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getMicroblog() {
		return microblog;
	}
	public void setMicroblog(String microblog) {
		this.microblog = microblog;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Acount(Integer acountId, String phone, String email, String password, String identityCards, String qq,
			String wechat, String microblog, Date createDate, Date loginDate, Integer roleId) {
		super();
		this.acountId = acountId;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.identityCards = identityCards;
		this.qq = qq;
		this.wechat = wechat;
		this.microblog = microblog;
		this.createDate = createDate;
		this.loginDate = loginDate;
		this.roleId = roleId;
	}
	public Acount() {
		super();
	}
	
	
	
}
