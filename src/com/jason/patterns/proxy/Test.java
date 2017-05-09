package com.jason.patterns.proxy;

import com.jason.patterns.proxy.cglibproxy.CglibProxyFactory;
import com.jason.patterns.proxy.common.IUserDao;
import com.jason.patterns.proxy.common.UserDao;
import com.jason.patterns.proxy.common.UserDaoImpl;
import com.jason.patterns.proxy.dynamicproxy.DynamicProxyFactory;
import com.jason.patterns.proxy.staticproxy.UserDaoProxy;

public class Test {

	/**
	 * ���Ծ�̬����
	 */
	@org.junit.Test
	public void testStaticProxy() {
		// Ŀ�����
		UserDaoImpl target = new UserDaoImpl();

		// �������,��Ŀ����󴫸��������,���������ϵ
		UserDaoProxy proxy = new UserDaoProxy(target);

		proxy.save();// ִ�е��Ǵ���ķ���
	}

	/**
	 * ���Զ�̬����
	 */
	@org.junit.Test
	public void testDynamicProxy() {
		// Ŀ�����
		IUserDao target = new UserDaoImpl();
		// ��ԭʼ������ class cn.itcast.b_dynamic.UserDao��
		System.out.println(target.getClass());

		// ��Ŀ����󣬴����������
		IUserDao proxy = (IUserDao) new DynamicProxyFactory(target).getProxyInstance();
		// class $Proxy0 �ڴ��ж�̬���ɵĴ������
		System.out.println(proxy.getClass());

		// ִ�з��� ���������
		proxy.save();
	}

	/**
	 * ����Cglib����
	 */
	@org.junit.Test
	public void testCglibProxy() {
		// Ŀ�����
		UserDao target = new UserDao();

		// �������
		UserDao proxy = (UserDao) new CglibProxyFactory(target).getProxyInstance();

		// ִ�д������ķ���
		proxy.save();
	}

}
