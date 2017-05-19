package com.jason.patterns.proxy.example.dynamicproxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class<?> clazz){
		//设置父类
		enhancer.setSuperclass(clazz);
		//设置回调函数
		enhancer.setCallback(this);
		
		return enhancer.create();
	}

	/**
	 * 拦截所有目标类方法的调用
	 * 
	 * object 目标类的实例’
	 * method 目标方法的反射对象
	 * args 方法的参数
	 * methodProxy 代理类的实例
	 */
	@Override
	public Object intercept(Object object, Method method, 
			Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("日志开始...");
		//代理类调用父类的方法
		methodProxy.invokeSuper(object, args);
		System.out.println("日志结束...");
		return null;
	}

}
