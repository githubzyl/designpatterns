package com.jason.patterns.template;
/**
 * 这是另外一个具体子类：提供了茶的具体实现
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public class Tea extends RefreshBeverage{
	
	/**
	 * 子类通过覆盖的形式选择挂载钩子函数
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

	@Override
	protected void brew() {
		System.out.println("用80度的热水浸泡茶叶5分钟");
	}

	@Override
	protected void addCondiments() {
		System.out.println("加入柠檬");
	}

}
