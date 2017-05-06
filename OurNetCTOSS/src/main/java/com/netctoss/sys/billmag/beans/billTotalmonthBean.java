package com.netctoss.sys.billmag.beans;

import java.io.Serializable;
import java.util.Date;

import com.netctoss.sys.accountmag.beans.AccountBean;

public class billTotalmonthBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6652752208248393622L;
	private Long id;
	private Date month;
	private double monthCost;
	private String pay_type;
	private String pay_satus;
	private AccountBean account;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public double getMonthCost() {
		return monthCost;
	}
	public void setMonthCost(double monthCost) {
		this.monthCost = monthCost;
	}
	public String getPay_type() {
		return pay_type;
	}
	public void setPay_type(String pay_type) {
		this.pay_type = pay_type;
	}
	public String getPay_satus() {
		return pay_satus;
	}
	public void setPay_satus(String pay_satus) {
		this.pay_satus = pay_satus;
	}
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public billTotalmonthBean(Long id, Date month, double monthCost, String pay_type, String pay_satus,
			AccountBean account) {
		super();
		this.id = id;
		this.month = month;
		this.monthCost = monthCost;
		this.pay_type = pay_type;
		this.pay_satus = pay_satus;
		this.account = account;
	}
	public billTotalmonthBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "billTotalmonthBean [id=" + id + ", month=" + month + ", monthCost=" + monthCost + ", pay_type="
				+ pay_type + ", pay_satus=" + pay_satus + ", account=" + account + "]";
	}
	
	
}
