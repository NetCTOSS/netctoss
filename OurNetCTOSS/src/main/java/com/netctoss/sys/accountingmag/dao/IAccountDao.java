package com.netctoss.sys.accountingmag.dao;

import java.util.List;

import com.netctoss.sys.accountingmag.beans.DayTime;
import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.accountingmag.beans.MonthTime;
import com.netctoss.sys.accountingmag.beans.YearTime;
import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.tariffmag.beans.Tariff;


public interface IAccountDao {
	
	public List<DmssBean> findAllDmss(String startdate);
	public AccountBean findAccountIdByBussinessId(Long BusinessId);
	public Tariff findTariffByBussinessId(Long BusinessId);
	public int saveDetailTime(DmssBean dmss,String login_in,String login_out);
	public List<YearTime> findYearLabByYearAndAccountId(int year,Long accountId);
	public List<MonthTime> findEveryMonthLabByYearAndAccounId(int year,Long accountId,String server);
	public List<DayTime> findEveryDayLabByYearAndAccountIdAndMonthAndDayAndserver(int year,Long accountId,int month,String server);
}
