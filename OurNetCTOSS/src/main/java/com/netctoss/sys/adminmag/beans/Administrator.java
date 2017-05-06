package com.netctoss.sys.adminmag.beans;

public class Administrator {
	private Long id;
	private String name;
	private String account;
	private String password;
	private String phoneNumber;
	private String email;
	private Long role_fk_id;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phonenNmber) {
		this.phoneNumber = phonenNmber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getRole_fk_id() {
		return role_fk_id;
	}
	public void setRole_fk_id(Long role_fk_id) {
		this.role_fk_id = role_fk_id;
	}
	public Administrator(Long id, String name, String account, String password, String phoneNumber, String email,
			Long role_fk_id) {
		super();
		this.id = id;
		this.name = name;
		this.account = account;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.role_fk_id = role_fk_id;
	}
	public Administrator() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Administrator [id=" + id + ", name=" + name + ", account=" + account + ", password=" + password
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + ", role_fk_id=" + role_fk_id + "]";
	}
	
}
