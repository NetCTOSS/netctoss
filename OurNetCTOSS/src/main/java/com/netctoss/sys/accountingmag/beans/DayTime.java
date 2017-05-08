package com.netctoss.sys.accountingmag.beans;

import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;

public class DayTime {
	private Long id;
	private List<DmssBean> dmss;
	private int month;
	private int year;
	private int day;
	private int dayTime;
	private Long accountId;
	private String server;
	public DayTime(Long id, List<DmssBean> dmss, int month, int year, int day, int dayTime, Long accountId,
			String server) {
		super();
		this.id = id;
		this.dmss = dmss;
		this.month = month;
		this.year = year;
		this.day = day;
		this.dayTime = dayTime;
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
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getDayTime() {
		return dayTime;
	}
	public void setDayTime(int dayTime) {
		this.dayTime = dayTime;
	}
	
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public DayTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public DayTime(Long id, List<DmssBean> dmss, int month, int year, int day, int dayTime, Long accountId) {
		super();
		this.id = id;
		this.dmss = dmss;
		this.month = month;
		this.year = year;
		this.day = day;
		this.dayTime = dayTime;
		this.accountId = accountId;
	}
	@Override
	public String toString() {
		return "DayTime [id=" + id + ", dmss=" + dmss + ", month=" + month + ", year=" + year + ", day=" + day
				+ ", dayTime=" + dayTime + ", accountId=" + accountId + "]";
	}
	
		
	
	
	
}
