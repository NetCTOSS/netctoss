package com.netctoss.sys.accountingmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;

public class MonthTime {
	private Long id;
	private List<DmssBean> dmss;
	private int year;
	private int month;
	private int monthTime;
	private Long accountId;
	private String server;
	@Override
	public String toString() {
		return "MonthTime [id=" + id + ", dmss=" + dmss + ", year=" + year + ", month=" + month + ", monthTime="
				+ monthTime + ", accountId=" + accountId + ", server=" + server + "]";
	}
	public MonthTime(Long id, List<DmssBean> dmss, int year, int month, int monthTime, Long accountId, String server) {
		super();
		this.id = id;
		this.dmss = dmss;
		this.year = year;
		this.month = month;
		this.monthTime = monthTime;
		this.accountId = accountId;
		this.server = server;
	}
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public List<DmssBean> getDmss() {
		return dmss;
	}
	public void setDmss(List<DmssBean> dmss) {
		this.dmss = dmss;
	}
	public int getMonthTime() {
		return monthTime;
	}
	public void setMonthTime(int monthTime) {
		this.monthTime = monthTime;
	}
	
	public MonthTime() {
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
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	
	
	
}
