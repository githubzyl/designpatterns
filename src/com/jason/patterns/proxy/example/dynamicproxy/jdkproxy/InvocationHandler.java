package com.jason.patterns.proxy.example.dynamicproxy.jdkproxy;

import java.lang.reflect.Method;

public interface InvocationHandler {

	public void invoke(Object object,Method method);
	
}
