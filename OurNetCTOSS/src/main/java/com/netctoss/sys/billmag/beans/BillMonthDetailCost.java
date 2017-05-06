package com.netctoss.sys.billmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.bussinessmag.beans.BusinessBean;
import com.netctoss.sys.tariffmag.beans.Tariff;
import com.netctoss.sys.util.DmssBean;

public class BillMonthDetailCost {
	
private List<BusinessBean> bussinessIds;
  
   private int monthTime;
   private Date month;
   private AccountBean account;
   private double monthCost;
   private int id;
   private Tariff tariff;
   private List<DmssBean> dmss;
public List<BusinessBean> getBussinessIds() {
	return bussinessIds;
}
public void setBussinessIds(List<BusinessBean> bussinessIds) {
	this.bussinessIds = bussinessIds;
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
public double getMonthCost() {
	return monthCost;
}
public void setMonthCost(double monthCost) {
	this.monthCost = monthCost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Tariff getTariff() {
	return tariff;
}
public void setTariff(Tariff tariff) {
	this.tariff = tariff;
}
public List<DmssBean> getDmss() {
	return dmss;
}
public void setDmss(List<DmssBean> dmss) {
	this.dmss = dmss;
}

public Date getMonth() {
	return month;
}
public void setMonth(Date month) {
	this.month = month;
}
public BillMonthDetailCost() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BillMonthDetailCost [bussinessIds=" + bussinessIds + ", monthTime=" + monthTime + ", month=" + month
			+ ", account=" + account + ", monthCost=" + monthCost + ", id=" + id + ", tariff=" + tariff + ", dmss="
			+ dmss + "]";
}


   
   
}
