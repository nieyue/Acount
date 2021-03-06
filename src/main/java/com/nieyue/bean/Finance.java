package com.nieyue.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 财务
 * @author 聂跃
 * @date 2017年4月12日
 */
public class Finance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 财务id
	 */
	private Integer financeId;
	/**
	 * 余额
	 */
	private Double money;
	/**
	 * 充值金额
	 */
	private Double recharge;
	/**
	 * 消费金额
	 */
	private Double consume;
	/**
	 * 开户人
	 */
	private String bankUserName;
	/**
	 * 开户银行
	 */
	private String bankName;
	/**
	 * 银行账号
	 */
	private String bankAccount;
	/**
	 * 开户银行地址
	 */
	private String bankAddress;
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * 账户id外键
	 */
	private Integer acountId;
	public Integer getFinanceId() {
		return financeId;
	}
	public void setFinanceId(Integer financeId) {
		this.financeId = financeId;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getRecharge() {
		return recharge;
	}
	public void setRecharge(Double recharge) {
		this.recharge = recharge;
	}
	public Double getConsume() {
		return consume;
	}
	public void setConsume(Double consume) {
		this.consume = consume;
	}
	public String getBankUserName() {
		return bankUserName;
	}
	public void setBankUserName(String bankUserName) {
		this.bankUserName = bankUserName;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccount() {
		return bankAccount;
	}
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public Integer getAcountId() {
		return acountId;
	}
	public void setAcountId(Integer acountId) {
		this.acountId = acountId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Finance(Integer financeId, Double money, Double recharge, Double consume, String bankUserName,
			String bankName, String bankAccount, String bankAddress, Date updateDate, Integer acountId) {
		super();
		this.financeId = financeId;
		this.money = money;
		this.recharge = recharge;
		this.consume = consume;
		this.bankUserName = bankUserName;
		this.bankName = bankName;
		this.bankAccount = bankAccount;
		this.bankAddress = bankAddress;
		this.updateDate = updateDate;
		this.acountId = acountId;
	}
	public Finance() {
		super();
	}
	
	
	
}
