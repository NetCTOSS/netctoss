package com.netctoss.sys.accountingmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;

public class YearTime {
	private Long id;
	private int year;
	private int yearTime;
	private List<DmssBean> dmsses;
	private Long account_fk_id;
	private String server;
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public YearTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYearTime() {
		return yearTime;
	}
	public void setYearTime(int yearTime) {
		this.yearTime = yearTime;
	}
	public List<DmssBean> getDmsses() {
		return dmsses;
	}
	
	public Long getAccount_fk_id() {
		return account_fk_id;
	}
	public void setDmsses(List<DmssBean> dmsses) {
		this.dmsses = dmsses;
	}
	public void setAccount_fk_id(Long account_fk_id) {
		this.account_fk_id = account_fk_id;
	}
	@Override
	public String toString() {
		return "YearTime [id=" + id + ", year=" + year + ", yearTime=" + yearTime + ", dmsses=" + dmsses
				+ ", account_fk_id=" + account_fk_id + ", server=" + server + "]";
	}
	
	
	
	
}
