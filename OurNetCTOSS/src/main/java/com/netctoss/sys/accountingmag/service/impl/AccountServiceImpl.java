package com.netctoss.sys.accountingmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.netctoss.sys.accountingmag.beans.DayTime;
import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.accountingmag.beans.MonthTime;
import com.netctoss.sys.accountingmag.beans.YearTime;
import com.netctoss.sys.accountingmag.dao.IAccountDao;
import com.netctoss.sys.accountingmag.service.IAccountService;
import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.tariffmag.beans.Tariff;
import com.netctoss.sys.util.pager.Pager;

@Service
public class AccountServiceImpl implements IAccountService {
	@Resource
	private IAccountDao accountDaoImpl;
	@Override
	public List<DmssBean> findAllDmss(String startdate) {
		// TODO Auto-generated method stub
		return accountDaoImpl.findAllDmss(startdate);
	}
	@Override
	public AccountBean findAccountIdByBussinessId(Long BusinessId) {
		// TODO Auto-generated method stub
		return accountDaoImpl.findAccountIdByBussinessId(BusinessId);
	}
	@Override
	public Tariff findTariffByBussinessId(Long BusinessId) {
		// TODO Auto-generated method stub
		return accountDaoImpl.findTariffByBussinessId(BusinessId);
	}
	@Override
	public int saveDetailTime(DmssBean dmss,String login_in,String login_out) {
		// TODO Auto-generated method stub
		return accountDaoImpl.saveDetailTime(dmss, login_in, login_out);
	}
	@Override
	public List<YearTime> findYearLabByYearAndAccountId(int year, Long accountId) {
		// TODO Auto-generated method stub
		
		
		return accountDaoImpl.findYearLabByYearAndAccountId(year,accountId);
		
	} 
	@Override
	public List<MonthTime> findEveryMonthLabByYearAndAccounId(int year, Long accountId,String server) {
		// TODO Auto-generated method stub
		return accountDaoImpl.findEveryMonthLabByYearAndAccounId(year, accountId, server);
	}
	@Override
	public List<DayTime> findEveryDayLabByYearAndAccountIdAndMonthAndDayAndserver(int year, Long accountId, int month, String server) {
		// TODO Auto-generated method stub
		return accountDaoImpl.findEveryDayLabByYearAndAccountIdAndMonthAndDayAndserver(year, accountId, month, server);
	}
	

}
