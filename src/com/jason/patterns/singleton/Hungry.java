package com.jason.patterns.singleton;
/**
 * 饿汉式
 * @author zhaoyl
 * @createdate 2017年5月18日
 */
public class Hungry {

	//1、将构造方法私有化，不允许外部直接创建对象
	private Hungry(){
	}
	
	//2、创建类的唯一实例,使用private static修饰
	private static Hungry instance = new Hungry();
	
	//3、提供一个用于获取实例的方法，使用public static修饰
	public static Hungry getInstance(){
		return instance;
	}
	
}
