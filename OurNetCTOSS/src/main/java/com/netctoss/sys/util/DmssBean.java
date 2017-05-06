package com.netctoss.sys.util;

import java.util.Date;

import com.netctoss.sys.bussinessmag.beans.BusinessBean;

public class DmssBean {
	private int id;
	private BusinessBean bussiness;
	private String severIp;
	private Date login_inTime;
	private Date login_outTime;
	private int time;
	
	private double cost;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BusinessBean getBussiness() {
		return bussiness;
	}
	public void setBussiness(BusinessBean bussiness) {
		this.bussiness = bussiness;
	}
	public String getSeverIp() {
		return severIp;
	}
	public void setSeverIp(String severIp) {
		this.severIp = severIp;
	}
	public Date getLogin_inTime() {
		return login_inTime;
	}
	public void setLogin_inTime(Date login_inTime) {
		this.login_inTime = login_inTime;
	}
	public Date getLogin_outTime() {
		return login_outTime;
	}
	public void setLogin_outTime(Date login_outTime) {
		this.login_outTime = login_outTime;
	}
	public DmssBean(int id, BusinessBean bussiness, String severIp, Date login_inTime, Date login_outTime) {
		super();
		this.id = id;
		this.bussiness = bussiness;
		this.severIp = severIp;
		this.login_inTime = login_inTime;
		this.login_outTime = login_outTime;
	}
	public DmssBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DmssBean [id=" + id + ", bussiness=" + bussiness + ", severIp=" + severIp + ", login_inTime="
				+ login_inTime + ", login_outTime=" + login_outTime + "]";
	}
	
}
