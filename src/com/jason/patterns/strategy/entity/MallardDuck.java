package com.jason.patterns.strategy.entity;

import com.jason.patterns.strategy.impl.FlyWithWin;

public class MallardDuck extends Duck {

	
	public MallardDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("�ҵĲ�������ɫ��");
	}

}
