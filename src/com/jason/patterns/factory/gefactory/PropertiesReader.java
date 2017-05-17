package com.jason.patterns.factory.gefactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件的读取类
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class PropertiesReader {

	@SuppressWarnings("rawtypes")
	public Map<String,String> getProperties(){
		Properties props = new Properties();
		Map<String,String> map = new HashMap<String,String>();
		try {
			InputStream inputStream = getClass().getResourceAsStream("type.properties");
			props.load(inputStream);
			Enumeration enumeration = props.propertyNames();
			while(enumeration.hasMoreElements()){
				String key = (String) enumeration.nextElement();
				String property = props.getProperty(key);
				map.put(key, property);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
}
