package com.jason.patterns.proxy.example.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

public class TimeHandlerCustom implements InvocationHandler {
	
	private Object target;
	
	public TimeHandlerCustom(Object target) {
		super();
		this.target = target;
	}

	@Override
	public void invoke(Object object, Method method) {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		try {
			method.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...汽车行驶的时间：" + (endTime - startTime) + "毫秒");
	}

}
