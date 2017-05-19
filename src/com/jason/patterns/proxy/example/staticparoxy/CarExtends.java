package com.jason.patterns.proxy.example.staticparoxy;
/**
 * 使用继承实现静态代理
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public class CarExtends extends Car {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...汽车行驶的时间：" + (endTime - startTime) + "毫秒");
	}

}
