package com.netctoss.sys.accountingmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.util.DmssBean;

public class YearTime {
	private Long id;
	private Date year;
	private int yearTime;
	private List<DmssBean> dmsses;
	private AccountBean account;
	public YearTime(Long id, Date year, int yearTime, List<DmssBean> dmsses, AccountBean account) {
		super();
		this.id = id;
		this.year = year;
		this.yearTime = yearTime;
		this.dmsses = dmsses;
		this.account = account;
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
	public Date getYear() {
		return year;
	}
	public void setYear(Date year) {
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
	public void setDmsses(List<DmssBean> dmsses) {
		this.dmsses = dmsses;
	}
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "YearTime [id=" + id + ", year=" + year + ", yearTime=" + yearTime + ", dmsses=" + dmsses + ", account="
				+ account + "]";
	}
	
}
