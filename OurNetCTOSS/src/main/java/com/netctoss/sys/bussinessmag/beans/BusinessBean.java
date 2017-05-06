package com.netctoss.sys.bussinessmag.beans;

import java.io.Serializable;
import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.tariffmag.beans.Tariff;

public class BusinessBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4026939561758353001L;

	private Long id;
	private String BusinessId;
	private String SerciceIp;
	private String pwd;
	private int Status;
	private List<AccountBean> acoutlist;
	private Tariff tariff;
	
	
	public BusinessBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessBean(Long id, String businessId, String serciceIp, String pwd, int status,
			List<AccountBean> acoutlist, Tariff tariff) {
		super();
		this.id = id;
		BusinessId = businessId;
		SerciceIp = serciceIp;
		this.pwd = pwd;
		Status = status;
		this.acoutlist = acoutlist;
		this.tariff = tariff;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBusinessId() {
		return BusinessId;
	}

	public void setBusinessId(String businessId) {
		BusinessId = businessId;
	}

	public String getSerciceIp() {
		return SerciceIp;
	}

	public void setSerciceIp(String serciceIp) {
		SerciceIp = serciceIp;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public List<AccountBean> getAcoutlist() {
		return acoutlist;
	}

	public void setAcoutlist(List<AccountBean> acoutlist) {
		this.acoutlist = acoutlist;
	}

	public Tariff getTariff() {
		return tariff;
	}

	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}

	@Override
	public String toString() {
		return "BusinessId [id=" + id + ", BusinessId=" + BusinessId + ", SerciceIp=" + SerciceIp + ", pwd=" + pwd
				+ ", Status=" + Status + "]";
	}

}
