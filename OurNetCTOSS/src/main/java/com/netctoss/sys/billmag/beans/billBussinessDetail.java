package com.netctoss.sys.billmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.bussinessmag.beans.BusinessBean;
import com.netctoss.sys.tariffmag.beans.Tariff;
import com.netctoss.sys.util.DmssBean;

public class billBussinessDetail {
	private Long id;
	private BusinessBean business;
	private Date month;
	private List<DmssBean> dmss;
	private double cost;
	private Tariff tariff;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BusinessBean getBusiness() {
		return business;
	}
	public void setBusiness(BusinessBean business) {
		this.business = business;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public List<DmssBean> getDmss() {
		return dmss;
	}
	public void setDmss(List<DmssBean> dmss) {
		this.dmss = dmss;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Tariff getTariff() {
		return tariff;
	}
	public void setTariff(Tariff tariff) {
		this.tariff = tariff;
	}
	public billBussinessDetail(Long id, BusinessBean business, Date month, List<DmssBean> dmss, double cost,
			Tariff tariff) {
		super();
		this.id = id;
		this.business = business;
		this.month = month;
		this.dmss = dmss;
		this.cost = cost;
		this.tariff = tariff;
	}
	public billBussinessDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "billBussinessDetail [id=" + id + ", business=" + business + ", month=" + month + ", dmss=" + dmss
				+ ", cost=" + cost + ", tariff=" + tariff + "]";
	}
	
	
}
