package com.jason.patterns.singleton;
/**
 * 懒汉式
 * @author zhaoyl
 * @createdate 2017年5月18日
 */
public class Lazy {

	//1、将构造方法私有化，不允许外部直接创建对象
	private Lazy(){
	}
	
	//2、创建类的唯一实例,使用private static修饰
	private static Lazy instance;
	
	//3、提供一个用于获取实例的方法，使用public static修饰
	public static Lazy getInstance(){
		if(null == instance){
			instance = new Lazy();
		}
		return instance;
	}
	
}
