package com.netctoss.sys.frontlogmag.beans;

import java.util.Date;

public class ActionLog {
	private Long id;
	private String userName;
	private Date changeTime;
	private String action;//什么动作
	private String data;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Date changeTime) {
		this.changeTime = changeTime;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ActionLog [id=" + id + ", userName=" + userName + ", changeTime=" + changeTime + ", action=" + action
				+ ", data=" + data + "]";
	}
	public ActionLog(Long id, String userName, Date changeTime, String action, String data) {
		super();
		this.id = id;
		this.userName = userName;
		this.changeTime = changeTime;
		this.action = action;
		this.data = data;
	}
	public ActionLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
