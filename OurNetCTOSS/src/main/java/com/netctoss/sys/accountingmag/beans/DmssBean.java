package com.netctoss.sys.accountingmag.beans;

import java.util.Date;

import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.bussinessmag.beans.BusinessBean;
import com.netctoss.sys.tariffmag.beans.Tariff;

public class DmssBean {
	private Long id;
	private Long osaccount;
	private String server;
	private Date login_in;
	private Date login_out;
	private int time;
	private int year;
	private int month;
	private int day;
	private double cost;
	private Long Business_fk_id;
	public Long getBusiness_fk_id() {
		return Business_fk_id;
	}
	public void setBusiness_fk_id(Long business_fk_id) {
		Business_fk_id = business_fk_id;
	}
	private Long account_fk_id;
	private Long tariff_fk_id;
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getOsaccount() {
		return osaccount;
	}
	public void setOsaccount(Long osaccount) {
		this.osaccount = osaccount;
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
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	public DmssBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
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
	@Override
	public String toString() {
		return "DmssBean [id=" + id + ", osaccount=" + osaccount + ", server=" + server + ", login_in=" + login_in
				+ ", login_out=" + login_out + ", time=" + time + ", year=" + year + ", month=" + month + ", day=" + day
				+ ", cost=" + cost + ", Business_fk_id=" + Business_fk_id + ", account_fk_id=" + account_fk_id
				+ ", tariff_fk_id=" + tariff_fk_id + "]";
	}
	public DmssBean(Long id, Long osaccount, String server, Date login_in, Date login_out, int time, int year,
			int month, int day, double cost, Long business_fk_id, Long account_fk_id, Long tariff_fk_id) {
		super();
		this.id = id;
		this.osaccount = osaccount;
		this.server = server;
		this.login_in = login_in;
		this.login_out = login_out;
		this.time = time;
		this.year = year;
		this.month = month;
		this.day = day;
		this.cost = cost;
		Business_fk_id = business_fk_id;
		this.account_fk_id = account_fk_id;
		this.tariff_fk_id = tariff_fk_id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
