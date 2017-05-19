package com.jason.patterns.proxy.example.staticparoxy;

import java.util.Random;

import com.jason.patterns.proxy.example.common.Moveable;

public class Car implements Moveable {

	@Override
	public void move() {
		//ʵ�ֿ���
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("������ʻ��...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
