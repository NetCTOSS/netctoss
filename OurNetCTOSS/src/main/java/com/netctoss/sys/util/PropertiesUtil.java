package com.netctoss.sys.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {

	public Properties getProperties(){
		Properties props=null;
		InputStream in=null;
		try{
			String path=this.getClass().getResource("/converters.properties").getPath();
			if(path.contains("%20")){
				path=path.replace("%20", " ");
			}
			File file=new File(path);
			in=new BufferedInputStream(new FileInputStream(file));
			props=new Properties();
			props.load(in);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return props;
	}
}
