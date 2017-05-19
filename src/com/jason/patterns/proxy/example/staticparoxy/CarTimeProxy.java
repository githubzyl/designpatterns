package com.jason.patterns.proxy.example.staticparoxy;

import com.jason.patterns.proxy.example.common.Moveable;

/**
 * ʹ�þۺ�ʵ�־�̬����
 * @author zhaoyl
 * @createdate 2017��5��19��
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
		System.out.println("������ʼ��ʻ...");
		moveable.move();
		long endTime = System.currentTimeMillis();
		System.out.println("����������ʻ...������ʻ��ʱ�䣺" + (endTime - startTime) + "����");
	}

}
