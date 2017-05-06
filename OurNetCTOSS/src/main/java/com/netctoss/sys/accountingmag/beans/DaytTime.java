package com.netctoss.sys.accountingmag.beans;

import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.util.DmssBean;

public class DaytTime {
	private Long id;
	private List<DmssBean> dmss;
	private int day;
	private int dayTime;
	private AccountBean account;
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
	public AccountBean getAccount() {
		return account;
	}
	public void setAccount(AccountBean account) {
		this.account = account;
	}
	public DaytTime(Long id, List<DmssBean> dmss, int day, int dayTime, AccountBean account) {
		super();
		this.id = id;
		this.dmss = dmss;
		this.day = day;
		this.dayTime = dayTime;
		this.account = account;
	}
	public DaytTime() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DaytTime [id=" + id + ", dmss=" + dmss + ", day=" + day + ", dayTime=" + dayTime + ", account="
				+ account + "]";
	}
	
	
	
	
}
