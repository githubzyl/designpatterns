package com.jason.patterns.proxy.example.staticparoxy;

import com.jason.patterns.proxy.example.common.Moveable;

/**
 * 使用聚合实现静态代理
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public class CarTimeProxy implements Moveable {
	
	private Moveable moveable;
	
	public CarTimeProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("汽车开始行驶...");
		moveable.move();
		long endTime = System.currentTimeMillis();
		System.out.println("汽车结束行驶...汽车行驶的时间：" + (endTime - startTime) + "毫秒");
	}

}
