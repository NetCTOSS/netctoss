package com.netctoss.sys.billmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.bussinessmag.beans.BusinessBean;
import com.netctoss.sys.tariffmag.beans.Tariff;

public class billBussinessDetail {
	private Long id;
	private Long business_fk_id;
	private int year;
	private int month;
	private double cost;
	private Long  account_fk_id;
	private Long tariff_fk_id;
	private int time;
	private String server;
	private Date login_in;
	private Date login_out;
	private String tariffType;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBusiness_fk_id() {
		return business_fk_id;
	}
	public void setBusiness_fk_id(Long business_fk_id) {
		this.business_fk_id = business_fk_id;
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
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
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
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public Date getLogin_in() {
		return login_in;
	}
	public void setLogin_in(Date login_in) {
		this.login_in = login_in;
	}
	public Date getLogin_out() {
		return login_out;
	}
	public void setLogin_out(Date login_out) {
		this.login_out = login_out;
	}
	public String getTariffType() {
		return tariffType;
	}
	public void setTariffType(String tariffType) {
		this.tariffType = tariffType;
	}
	public billBussinessDetail(Long id, Long business_fk_id, int year, int month, double cost, Long account_fk_id,
			Long tariff_fk_id, int time, String server, Date login_in, Date login_out, String tariffType) {
		super();
		this.id = id;
		this.business_fk_id = business_fk_id;
		this.year = year;
		this.month = month;
		this.cost = cost;
		this.account_fk_id = account_fk_id;
		this.tariff_fk_id = tariff_fk_id;
		this.time = time;
		this.server = server;
		this.login_in = login_in;
		this.login_out = login_out;
		this.tariffType = tariffType;
	}
	public billBussinessDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "billBussinessDetail [id=" + id + ", business_fk_id=" + business_fk_id + ", year=" + year + ", month="
				+ month + ", cost=" + cost + ", account_fk_id=" + account_fk_id + ", tariff_fk_id=" + tariff_fk_id
				+ ", time=" + time + ", server=" + server + ", login_in=" + login_in + ", login_out=" + login_out
				+ ", tariffType=" + tariffType + "]";
	}
	
	
}
