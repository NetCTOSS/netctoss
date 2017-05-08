package com.netctoss.sys.accountingmag.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.netctoss.sys.accountingmag.beans.DayTime;
import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.accountingmag.beans.MonthTime;
import com.netctoss.sys.accountingmag.beans.YearTime;
import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.tariffmag.beans.Tariff;
import com.netctoss.sys.util.pager.Pager;

public interface DmssMapper {
	
	@Select("select * from t_dmss where login_in > #{startdate} ")
	@ResultType(DmssBean.class)
	public List<DmssBean> findAllDmss(String startdate);
	
	
	@Select("select * from t_business as b left join t_account as a  on b.account_fk_id=a.accountid where b.business_id=#{BusinessId}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="name",javaType=String.class),
		@Result(property="Gender",column="gender",javaType=String.class),
		@Result(property="IDcard",column="idcard",javaType=String.class),
		@Result(property="AccountId",column="accountid",javaType=String.class),
		@Result(property="pwd",column="pwd",javaType=String.class),
		@Result(property="phone",column="phone",javaType=String.class),
		@Result(property="Address",column="address",javaType=String.class),
	
	})
	public AccountBean findAccountIdByBussinessId(Long BusinessId);
	@Select("SELECT * FROM tariff as t left join t_business as b  ON  t.id=b.tariff_fk_id  where b.business_id=#{BusinessId}")
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="tariffName",column="tariffname",javaType=String.class),
		@Result(property="tariffType",column="tariffType",javaType=String.class),
		@Result(property="basicTime",column="basic_time",javaType=Long.class),
		@Result(property="basicCharge",column="basic_charge",javaType=Double.class),
		@Result(property="perCharge",column="per_charge",javaType=Double.class)
	})
	public Tariff findTariffByBussinessId(Long BusinessId);
	@Insert("insert into t_detailtimeandcost values(null,#{d.year},#{d.month},#{d.day},#{d.server},#{d.account_fk_id},#{d.osaccount},#{in},#{out},#{d.time},#{d.cost},#{d.tariff_fk_id}) ")
	@ResultType(Integer.class)
	public int saveDetailTime(@Param("d") DmssBean dmss,@Param("in") String login_in,@Param("out") String login_out);
	@Select("select year,server,account_fk_id,SUM(time) as yearTime from t_detailtimeandcost where year=#{year} and account_fk_id=#{accountId} GROUP BY server ")
	@ResultType(YearTime.class)
	public List<YearTime> findYearLabByYearAndAccountId(@Param("year")int year,@Param("accountId")Long accountId);
	@Select("select year,month,server ,SUM(time) AS monthTime from t_detailtimeandcost where year=#{year} and account_fk_id=#{accountId} and server=#{server} GROUP BY month ")
	@ResultType(MonthTime.class)
	public List<MonthTime> findEveryMonthLabByYearAndAccounId(@Param("year")int year,@Param("accountId")Long accountId,@Param("server")String server);
	@Select("select year,month,day,server,SUM(time) AS dayTime from t_detailtimeandcost where year=#{year} and account_fk_id=#{accountId} and server=#{server} and month=#{month} GROUP BY day ")
	@ResultType(DayTime.class)
	public List<DayTime> findEveryDayLabByYearAndAccountIdAndMonthAndDayAndserver(@Param("year")int year,@Param("accountId")Long accountId,@Param("month")int month,@Param("server")String server);

}
