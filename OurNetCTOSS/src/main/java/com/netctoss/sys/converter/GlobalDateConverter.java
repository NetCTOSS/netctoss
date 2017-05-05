package com.netctoss.sys.converter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.core.convert.converter.Converter;

import com.netctoss.sys.util.PropertiesUtil;

public class GlobalDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String text) {
		// TODO Auto-generated method stub
		Date date=null;
		SimpleDateFormat format=null;
		try{
			PropertiesUtil util=new PropertiesUtil();
			Properties prop=util.getProperties();
			Set<Object> keys=prop.keySet();//获取键的集合
			if(text != null && !"".equals(text)){
				for (Object object : keys) {
					String key = (String) object;
					Pattern p = Pattern.compile(key);
					Matcher m = p.matcher(text);
					if(m.matches()){
						format = new SimpleDateFormat(prop.getProperty(key));
						date = format.parse(text);
						break;
					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		return date;
	}

	
}
