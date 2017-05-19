package com.jason.patterns.proxy.example.staticparoxy;
/**
 * ʹ�ü̳�ʵ�־�̬����
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public class CarExtends extends Car {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("������ʼ��ʻ...");
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("����������ʻ...������ʻ��ʱ�䣺" + (endTime - startTime) + "����");
	}

}
