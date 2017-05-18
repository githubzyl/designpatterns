package com.jason.patterns.strategy.entity;

import com.jason.patterns.strategy.impl.FlyNoWay;

public class BigYellow extends Duck {

	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("������ܴ�ȫ��ƻ�");
	}

}
