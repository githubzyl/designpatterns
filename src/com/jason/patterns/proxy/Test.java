package com.jason.patterns.proxy;

import com.jason.patterns.proxy.cglibproxy.CglibProxyFactory;
import com.jason.patterns.proxy.common.IUserDao;
import com.jason.patterns.proxy.common.UserDao;
import com.jason.patterns.proxy.common.UserDaoImpl;
import com.jason.patterns.proxy.dynamicproxy.DynamicProxyFactory;
import com.jason.patterns.proxy.staticproxy.UserDaoProxy;

public class Test {

	/**
	 * 测试静态代理
	 */
	@org.junit.Test
	public void testStaticProxy() {
		// 目标对象
		UserDaoImpl target = new UserDaoImpl();

		// 代理对象,把目标对象传给代理对象,建立代理关系
		UserDaoProxy proxy = new UserDaoProxy(target);

		proxy.save();// 执行的是代理的方法
	}

	/**
	 * 测试动态代理
	 */
	@org.junit.Test
	public void testDynamicProxy() {
		// 目标对象
		IUserDao target = new UserDaoImpl();
		// 【原始的类型 class cn.itcast.b_dynamic.UserDao】
		System.out.println(target.getClass());

		// 给目标对象，创建代理对象
		IUserDao proxy = (IUserDao) new DynamicProxyFactory(target).getProxyInstance();
		// class $Proxy0 内存中动态生成的代理对象
		System.out.println(proxy.getClass());

		// 执行方法 【代理对象】
		proxy.save();
	}

	/**
	 * 测试Cglib代理
	 */
	@org.junit.Test
	public void testCglibProxy() {
		// 目标对象
		UserDao target = new UserDao();

		// 代理对象
		UserDao proxy = (UserDao) new CglibProxyFactory(target).getProxyInstance();

		// 执行代理对象的方法
		proxy.save();
	}

}
