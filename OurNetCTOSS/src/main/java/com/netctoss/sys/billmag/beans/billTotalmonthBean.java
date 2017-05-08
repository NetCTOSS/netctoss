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
	private int year;
	private int month;
	private double monthCost;
	private String pay_type;
	@Override
	public String toString() {
		return "billTotalmonthBean [id=" + id + ", year=" + year + ", month=" + month + ", monthCost=" + monthCost
				+ ", pay_type=" + pay_type + ", pay_satus=" + pay_satus + ", account_fk_id=" + account_fk_id
				+ ", tariff_fk_id=" + tariff_fk_id + "]";
	}
	public billTotalmonthBean(Long id, int year, int month, double monthCost, String pay_type, String pay_satus,
			Long account_fk_id, Long tariff_fk_id) {
		super();
		this.id = id;
		this.year = year;
		this.month = month;
		this.monthCost = monthCost;
		this.pay_type = pay_type;
		this.pay_satus = pay_satus;
		this.account_fk_id = account_fk_id;
		this.tariff_fk_id = tariff_fk_id;
	}
	public Long getAccount_fk_id() {
		return account_fk_id;
	}
	public void setAccount_fk_id(Long account_fk_id) {
		this.account_fk_id = account_fk_id;
	}
	public Long getTariff_fk_id() {
		return tariff_fk_id;
	}
	public void setTariff_fk_id(Long tariff_fk_id) {
		this.tariff_fk_id = tariff_fk_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String pay_satus;
	private Long  account_fk_id;
	private Long tariff_fk_id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	
	public billTotalmonthBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
}
