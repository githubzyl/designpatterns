package com.jason.patterns.factory.gefactory;

import java.util.Map;

import com.jason.patterns.factory.common.HairInterface;
import com.jason.patterns.factory.common.LeftHair;
import com.jason.patterns.factory.common.RightHair;

/**
 * ���͹���
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class HairFactory {

	/**
	 * ������������������
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
	 * ������������������
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
	 * ���������������������
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
	 * ������������������
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
