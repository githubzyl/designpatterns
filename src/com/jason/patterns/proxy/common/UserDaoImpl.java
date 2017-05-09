package com.jason.patterns.proxy.common;

/**
 * 目标对象，实现了接口
 * @author zhaoyl
 * @createdate 2017年5月9日
 */
public class UserDaoImpl implements IUserDao {

	@Override
	public void save() {
		System.out.println("----已经保存数据!----");
	}

}
