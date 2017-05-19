package com.jason.patterns.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.jason.patterns.proxy.example.common.Moveable;
import com.jason.patterns.proxy.example.dynamicproxy.cglibproxy.CglibProxy;
import com.jason.patterns.proxy.example.dynamicproxy.cglibproxy.Train;
import com.jason.patterns.proxy.example.dynamicproxy.jdkproxy.TimeHandler;
import com.jason.patterns.proxy.example.staticparoxy.Car;
import com.jason.patterns.proxy.example.staticparoxy.CarExtends;
import com.jason.patterns.proxy.example.staticparoxy.CarLogProxy;
import com.jason.patterns.proxy.example.staticparoxy.CarTimeProxy;

public class Test {

	//ʹ�ü̳�ʵ�־�̬����
	@org.junit.Test
	public void testStaticProxyByExtends(){
		CarExtends carExtends = new CarExtends();
		carExtends.move();
	}
	
	//ʹ�þۺ�ʵ�־�̬����
	@org.junit.Test
	public void testStaticProxyByAggregation(){
		Car car = new Car();
		Moveable carAggregation = new CarTimeProxy(car);
		carAggregation.move();
	}
	
	@org.junit.Test
	public void testLogProxyByAggregation(){
		Car car = new Car();
		CarTimeProxy carTimeProxy = new CarTimeProxy(car);
		CarLogProxy carLogProxy = new CarLogProxy(carTimeProxy);
		carLogProxy.move();
	}
	
	//JDK��̬����
	@org.junit.Test
	public void testDynamicProxyByJDK(){
		Car car = new Car();
		InvocationHandler h = new TimeHandler(car);
		Class<?> cls = car.getClass();
		/**
		 * loader �������
		 * interfaces ʵ�ֽӿ�
		 * h InvocationHandler
		 */
		Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
		m.move();
	}
	
	//Cglib��̬����
	@org.junit.Test
	public void testDynamicProxyByCglib(){
		CglibProxy cglibProxy = new CglibProxy();
		Train train = (Train) cglibProxy.getProxy(Train.class);
		train.move();
	}
	
}
