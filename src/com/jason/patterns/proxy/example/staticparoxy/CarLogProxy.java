package com.jason.patterns.proxy.example.staticparoxy;

import com.jason.patterns.proxy.example.common.Moveable;

/**
 * ʹ�þۺ�ʵ�־�̬����
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public class CarLogProxy implements Moveable {
	
	private Moveable moveable;
	
	public CarLogProxy(Moveable moveable) {
		super();
		this.moveable = moveable;
	}

	@Override
	public void move() {
		System.out.println("��־��ʼ...");
		moveable.move();
		System.out.println("��־����...");
	}

}
