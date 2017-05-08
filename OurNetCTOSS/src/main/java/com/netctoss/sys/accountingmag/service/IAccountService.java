package com.netctoss.sys.accountingmag.service;

import java.util.List;

import com.netctoss.sys.accountingmag.beans.DayTime;
import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.accountingmag.beans.MonthTime;
import com.netctoss.sys.accountingmag.beans.YearTime;
import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.tariffmag.beans.Tariff;

public interface IAccountService {
	
	public List<DmssBean> findAllDmss(String startdate);
	public AccountBean findAccountIdByBussinessId(Long BusinessId);
	public Tariff findTariffByBussinessId(Long BusinessId);
	public int saveDetailTime(DmssBean dmss,String login_in,String login_out);
	/**
	 * 查询该账务账号下当年所有实验室的使用时间
	 * @param year 要查询的年份
	 * @param accountId 要查询的账务账号
	 * @return 每年的使用总时间
	 */
	public List<YearTime> findYearLabByYearAndAccountId(int year,Long accountId);
	/**
	 * 查询该账务账号下单独实验室每月使用总时间
	 * @param year 查询的年份
	 * @param accountId 要查询的账务账号
	 * @param server 查询的实验室
	 * @return 每月的使用总时间
	 */
	public List<MonthTime> findEveryMonthLabByYearAndAccounId(int year,Long accountId,String server);
	/**
	 * 查询该账务账号下单独实验室每月每天的使用总时间
	 * @param year 查询的年份
	 * @param accountId 要查询的账务账号
	 * @param server 查询的实验室
	 * @param month 查询的月份
	 * @return 每天的使用时间
	 */
	public List<DayTime> findEveryDayLabByYearAndAccountIdAndMonthAndDayAndserver(int year,Long accountId,int month,String server);
}
