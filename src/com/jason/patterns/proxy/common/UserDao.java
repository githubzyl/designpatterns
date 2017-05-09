package com.jason.patterns.proxy.common;

/**
 * 目标对象,没有实现任何接口
 * @author zhaoyl
 * @createdate 2017年5月9日
 */
public class UserDao {

	public void save() {
		System.out.println("----已经保存数据!----");
	}
	
}
