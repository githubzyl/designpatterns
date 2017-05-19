package com.jason.patterns.proxy.example.dynamicproxy.cglibproxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
	
	private Enhancer enhancer = new Enhancer();
	
	public Object getProxy(Class<?> clazz){
		//���ø���
		enhancer.setSuperclass(clazz);
		//���ûص�����
		enhancer.setCallback(this);
		
		return enhancer.create();
	}

	/**
	 * ��������Ŀ���෽���ĵ���
	 * 
	 * object Ŀ�����ʵ����
	 * method Ŀ�귽���ķ������
	 * args �����Ĳ���
	 * methodProxy �������ʵ��
	 */
	@Override
	public Object intercept(Object object, Method method, 
			Object[] args, MethodProxy methodProxy) throws Throwable {
		System.out.println("��־��ʼ...");
		//��������ø���ķ���
		methodProxy.invokeSuper(object, args);
		System.out.println("��־����...");
		return null;
	}

}
