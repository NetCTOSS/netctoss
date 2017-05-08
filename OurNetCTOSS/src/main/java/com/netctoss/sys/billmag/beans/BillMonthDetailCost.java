package com.netctoss.sys.billmag.beans;

import java.util.Date;
import java.util.List;

import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.bussinessmag.beans.BusinessBean;
import com.netctoss.sys.tariffmag.beans.Tariff;

public class BillMonthDetailCost {
	
   private int monthTime;
   private int year;
   private String userName;
   private int month;
   private double monthCost;
   private int id;
   private Long business_fk_id;
   private Long  account_fk_id;
   private Long tariff_fk_id;
   private String tariffType;
   private double monthcost;
public int getMonthTime() {
	return monthTime;
}
public void setMonthTime(int monthTime) {
	this.monthTime = monthTime;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
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
public Long getBusiness_fk_id() {
	return business_fk_id;
}
public void setBusiness_fk_id(Long business_fk_id) {
	this.business_fk_id = business_fk_id;
}
public Long getAccount_fk_id() {
	return account_fk_id;
}
public void setAccount_fk_id(Long account_fk_id) {
	this.account_fk_id = account_fk_id;
}
public Long getTariff_fk_id() {
	return tariff_fk_id;
}
public void setTariff_fk_id(Long tariff_fk_id) {
	this.tariff_fk_id = tariff_fk_id;
}
public String getTariffType() {
	return tariffType;
}
public void setTariffType(String tariffType) {
	this.tariffType = tariffType;
}
public double getMonthcost() {
	return monthcost;
}
public void setMonthcost(double monthcost) {
	this.monthcost = monthcost;
}
public BillMonthDetailCost(int monthTime, int year, String userName, int month, double monthCost, int id,
		Long business_fk_id, Long account_fk_id, Long tariff_fk_id, String tariffType, double monthcost2) {
	super();
	this.monthTime = monthTime;
	this.year = year;
	this.userName = userName;
	this.month = month;
	this.monthCost = monthCost;
	this.id = id;
	this.business_fk_id = business_fk_id;
	this.account_fk_id = account_fk_id;
	this.tariff_fk_id = tariff_fk_id;
	this.tariffType = tariffType;
	monthcost = monthcost2;
}
public BillMonthDetailCost() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "BillMonthDetailCost [monthTime=" + monthTime + ", year=" + year + ", userName=" + userName + ", month="
			+ month + ", monthCost=" + monthCost + ", id=" + id + ", business_fk_id=" + business_fk_id
			+ ", account_fk_id=" + account_fk_id + ", tariff_fk_id=" + tariff_fk_id + ", tariffType=" + tariffType
			+ ", monthcost=" + monthcost + "]";
}
   
   


   
   
}
