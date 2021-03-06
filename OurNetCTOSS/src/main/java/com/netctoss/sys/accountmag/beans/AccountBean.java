package com.netctoss.sys.accountmag.beans;

import java.io.Serializable;
import java.util.List;

import com.netctoss.sys.bussinessmag.beans.BusinessBean;

public class AccountBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4163377823059586022L;

	private Long id;
	private String name;
	private String Gender;
	private String IDcard;
	private String AccountId;
	private String pwd;
	private String phone;
	private String Address;
	private int Status;
	private List<BusinessBean> businesslist;
	public AccountBean() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getAccountId() {
		return AccountId;
	}
	public void setAccountId(String accountId) {
		AccountId = accountId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	public List<BusinessBean> getBusinesslist() {
		return businesslist;
	}
	public void setBusinesslist(List<BusinessBean> businesslist) {
		this.businesslist = businesslist;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public AccountBean(Long id, String name, String gender, String iDcard, String accountId, String pwd, String phone,
			String address, int status, List<BusinessBean> businesslist) {
		super();
		this.id = id;
		this.name = name;
		Gender = gender;
		IDcard = iDcard;
		AccountId = accountId;
		this.pwd = pwd;
		this.phone = phone;
		Address = address;
		Status = status;
		this.businesslist = businesslist;
	}
	@Override
	public String toString() {
		return "AccountBean [id=" + id + ", name=" + name + ", Gender=" + Gender + ", IDcard=" + IDcard + ", AccountId="
				+ AccountId + ", pwd=" + pwd + ", phone=" + phone + ", Address=" + Address + ", Status=" + Status
				+ ", businesslist=" + businesslist + "]";
	}

	

}
