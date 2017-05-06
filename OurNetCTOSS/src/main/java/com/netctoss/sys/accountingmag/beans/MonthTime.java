package com.netctoss.sys.accountingmag.beans;

import java.util.Date;

import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.util.DmssBean;

public class MonthTime {
	private Long id;
	private DmssBean dmss;
	private Date month;
	private int monthTime;
	private AccountBean account;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public DmssBean getDmss() {
		return dmss;
	}
	public void setDmss(DmssBean dmss) {
		this.dmss = dmss;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public int getMonthTime() {
		return monthTime;
	}
	public void setMonthTime(int monthTime) {
		this.monthTime = monthTime;
	}
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	public MonthTime(Long id, DmssBean dmss, Date month, int monthTime, AccountBean account) {
		super();
		this.id = id;
		this.dmss = dmss;
		this.month = month;
		this.monthTime = monthTime;
		this.account = account;
	}
	public MonthTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MonthTime [id=" + id + ", dmss=" + dmss + ", month=" + month + ", monthTime=" + monthTime + ", account="
				+ account + "]";
	}
	
}
