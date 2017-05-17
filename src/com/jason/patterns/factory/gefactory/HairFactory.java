package com.jason.patterns.factory.gefactory;

import java.util.Map;

import com.jason.patterns.factory.common.HairInterface;
import com.jason.patterns.factory.common.LeftHair;
import com.jason.patterns.factory.common.RightHair;

/**
 * 发型工厂
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class HairFactory {

	/**
	 * 根据类型来创建对象
	 * @param key
	 * @return
	 */
	public HairInterface getHair(String key){
		if("left".equals(key)){
			return new LeftHair();
		}else if("right".equals(key)){
			return new RightHair();
		}
		return null;
	}
	
	/**
	 * 根据类名来创建对象
	 * @param className
	 * @return
	 */
	public HairInterface getHairByClass(String className){
		HairInterface hair = null;
		try {
			hair = (HairInterface) Class.forName(className).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hair;
	}
	
	/**
	 * 根据类的类型来创建对象
	 * @param className
	 * @return
	 */
	public HairInterface getHairByClass(Class<?> clazz){
		HairInterface hair = null;
		try {
			hair = (HairInterface) Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hair;
	}
	
	/**
	 * 根据类型来创建对象
	 * @param className
	 * @return
	 */
	public HairInterface getHairByKey(String key){
		HairInterface hair = null;
		Map<String,String> map = new PropertiesReader().getProperties();
		try {
			hair = (HairInterface) Class.forName(map.get(key)).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hair;
	}
	
}
