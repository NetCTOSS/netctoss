package com.netctoss.sys.frontlogmag.beans;

import java.util.Date;

public class loginLog {
	private Long id;
	private String userName;
	private Date login_in;
	private Date login_out;
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
	public loginLog(Long id, String userName, Date login_in, Date login_out) {
		super();
		this.id = id;
		this.userName = userName;
		this.login_in = login_in;
		this.login_out = login_out;
	}
	public loginLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "loginLog [id=" + id + ", userName=" + userName + ", login_in=" + login_in + ", login_out=" + login_out
				+ "]";
	}
	
	
}
