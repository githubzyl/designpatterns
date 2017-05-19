package com.jason.patterns.proxy.example.staticparoxy;

import com.jason.patterns.proxy.example.common.Moveable;

/**
 * 使用聚合实现静态代理
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public class CarLogProxy implements Moveable {
	
	private Moveable moveable;
	
	public CarLogProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("日志开始...");
		moveable.move();
		System.out.println("日志结束...");
	}

}
