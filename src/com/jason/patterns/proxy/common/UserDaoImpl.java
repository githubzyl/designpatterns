package com.jason.patterns.proxy.common;

/**
 * Ŀ�����ʵ���˽ӿ�
 * @author zhaoyl
 * @createdate 2017��5��9��
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public void save() {
		System.out.println("----�Ѿ���������!----");
	}

}
