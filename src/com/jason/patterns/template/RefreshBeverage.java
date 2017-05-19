package com.jason.patterns.template;
/**
 * 抽象基类，为所有子类提供一个算法框架
 * 业务：提神饮料
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public abstract class RefreshBeverage {

	/**
	 * 制作饮料的模板方法
	 * 封装了所有子类共同遵循的的算法框架
	 */
	public final void prepareBeverageTemplate(){
		//步骤1：把水煮沸
		boilWater();
		//步骤2：泡制饮料
		brew();
		//步骤3：把饮料倒入杯中
		pourInCup();
		if(isCustomerWantsCondiments()){
			//步骤4：加入调味料
			addCondiments();
		}
	}

	/**
	 * Hook方法，钩子函数，提供一个默认或空的实现
	 * 具体的子类可以自行决定是否挂钩以及如何挂钩
	 * 询问用户是否加入调味料
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}

	//基本方法：把水煮沸
	private void boilWater() {
		System.out.println("把水煮沸");
	}
	
	//抽象的基本方法：泡制饮料
	protected abstract void brew();
	
	//基本方法：把饮料倒入杯中
	private void pourInCup() {
		System.out.println("把饮料倒入杯中");
	}
	
	//抽象的基本方法：加入调味料
	protected abstract void addCondiments();
	
}
