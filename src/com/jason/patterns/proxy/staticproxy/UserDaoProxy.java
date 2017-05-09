package com.jason.patterns.proxy.staticproxy;

import com.jason.patterns.proxy.common.IUserDao;

/**
 * �������
 * 
 * @author zhaoyl
 * @createdate 2017��5��9��
 */
public class UserDaoProxy implements IUserDao {

	// ���ձ���Ŀ�����
	private IUserDao target;

	public UserDaoProxy(IUserDao target) {
		this.target = target;
	}

	@Override
	public void save() {
		System.out.println("��ʼ����...");
		target.save();// ִ��Ŀ�����ķ���
		System.out.println("�ύ����...");
	}

}
