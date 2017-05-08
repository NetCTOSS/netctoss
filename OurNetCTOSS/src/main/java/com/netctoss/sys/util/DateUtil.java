package com.netctoss.sys.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static int getMinute(Date start,Date end){
		long diff = end.getTime() - start.getTime();
		int time=(int) (diff/1000/60);
		return time;	
	}
	public static int getYearByDate(Date date){
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        int year = c.get(Calendar.YEAR);
		return year;
	}
	public static int getMonthByDate(Date date){
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH)+1;
		return month;
	}
	public static int getDayByDate(Date date){
		Calendar c = Calendar.getInstance();
        c.setTime(date);
        int day = c.get(Calendar.DATE);
		return day;
	}
	public static Date getDateStringToDate(String date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date1=null;
		try {
			 date1=sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return date1;
		
	}
	public static String getStringDateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date1=sdf.format(date);
		
		return date1;
		
	}
	public static String getStringFirstDay(){
	Calendar  cal=Calendar.getInstance();//获取当前日期     
    cal.set(Calendar.DAY_OF_MONTH,1);//设置为当前月1号
    cal.set(Calendar.HOUR_OF_DAY,0);
    cal.set(Calendar.SECOND,0);
    cal.set(Calendar.MINUTE,0);
    cal.set(Calendar.MILLISECOND,0);
    java.util.Date date =cal.getTime();//Calendar转换为date
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String date1=sdf.format(date);
	return date1;
	}
}
