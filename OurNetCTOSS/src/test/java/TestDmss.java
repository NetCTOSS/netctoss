
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.netctoss.sys.accountingmag.beans.DayTime;
import com.netctoss.sys.accountingmag.beans.DmssBean;
import com.netctoss.sys.accountingmag.beans.MonthTime;
import com.netctoss.sys.accountingmag.beans.YearTime;
import com.netctoss.sys.accountingmag.service.IAccountService;
import com.netctoss.sys.accountmag.beans.AccountBean;
import com.netctoss.sys.tariffmag.beans.Tariff;
import com.netctoss.sys.util.DateUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class TestDmss {
	@Resource
	private IAccountService accountServiceImpl;
	@Test
	public void getalldmss(){//到月底时产生详细账务账单
		
		Map map=new HashMap();
		
	    String date1=DateUtil.getStringFirstDay();
	    List<DmssBean> list=accountServiceImpl.findAllDmss(date1);
		for (DmssBean dm : list) {
			int year=DateUtil.getYearByDate(dm.getLogin_in());//获取当前年份
			int month=DateUtil.getMonthByDate(dm.getLogin_in());//获取当前月份
			int day=DateUtil.getDayByDate(dm.getLogin_out());//获取那一天
			int time=DateUtil.getMinute(dm.getLogin_in(), dm.getLogin_out());//获取时长
			String server=dm.getServer();
			
			Long osaccount=dm.getOsaccount();
			AccountBean account=accountServiceImpl.findAccountIdByBussinessId(osaccount);
			Tariff tariff=accountServiceImpl.findTariffByBussinessId(osaccount);
			dm.setDay(day);
			//以下为计算每次使用的费用
			if(tariff.getTariffType().equals("计时")){//匹配计费为计时时直接时间乘以单价
				dm.setCost(tariff.getPerCharge()*time);
			}else if(tariff.getTariffType().equals("套餐")){//匹配计费为套餐时
				if(map.containsKey(osaccount)){//如果业务账号不是当月第一次使用
					int time1=(int) map.get(osaccount);
					int time2=(int) map.get(osaccount)+time;//下一次使用时该账号已使用时间
					if(time1>tariff.getBasicTime()|time1==tariff.getBasicTime()){//使用之前已经超出套餐基本时长
						dm.setCost(time*tariff.getPerCharge());//时长乘以单价
					}else{//使用之前没有超出套餐时长
						if(time2>tariff.getBasicTime()){//此次使用后超出套餐时长
							dm.setCost((time2-tariff.getBasicTime())*tariff.getPerCharge());
						}else{//此次使用后仍然没有超出套餐基本时长
							dm.setCost(0.0);
						}
					}
					map.remove(osaccount);
					map.put(osaccount, time2);
				}else{
					map.put(osaccount, time);//当月该业务账号第一次使用
					if(time<tariff.getBasicTime()|time==tariff.getBasicTime()){//如果第一次使用时间没有超过套餐基本时长，则此次费用为0
						dm.setCost(0.0);
					}else{
						dm.setCost((time-tariff.getBasicTime())*tariff.getPerCharge());//第一次使用时间超过基本时长
					}
				}
			}else{
				dm.setCost(0.0);//包月计费
			}	
			dm.setMonth(month);
			dm.setTariff_fk_id(tariff.getId());
			dm.setAccount_fk_id(account.getId());
			dm.setTime(time);
			dm.setYear(year);
			String login_in =DateUtil.getStringDateToString(dm.getLogin_in());
			String login_out=DateUtil.getStringDateToString(dm.getLogin_out());
			//System.out.println(dm.getYear()+" "+dm.getMonth()+" "+dm.getDay()+""+dm.getServer()+""+dm.getAccount_fk_id()+""+dm.getOsaccount()+""+login_in+" "+login_out+""+dm.getTime()+""+dm.getCost()+""+dm.getTariff_fk_id());
			int num=accountServiceImpl.saveDetailTime(dm,login_in,login_out);				
		}
	}
	@Ignore
	public void testYear(){//查询每年该账务账号下实验室总使用时间
		List<YearTime> years=accountServiceImpl.findYearLabByYearAndAccountId(2017, 1l);
		for (YearTime yt : years) {
			System.out.println(yt);
		}
	}
	@Ignore
	public void testeverymonth(){//查询当前年份当前账务账号下实验室总使用时间
		List<MonthTime> list=accountServiceImpl.findEveryMonthLabByYearAndAccounId(2017, 1l, "192.168.1.2");
		for (MonthTime mt : list) {
			System.out.println(mt);
		}
	}
	@Ignore
	public void testeveryDay(){//查询当前年份当前月当前实验室每天的总使用时间
		List<DayTime> day=accountServiceImpl.findEveryDayLabByYearAndAccountIdAndMonthAndDayAndserver(2017, 1l, 5, "192.168.1.2");
		for (DayTime dt : day) {
			System.out.println(dt);
		}
	}
}
