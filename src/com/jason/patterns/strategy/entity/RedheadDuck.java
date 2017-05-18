package com.jason.patterns.strategy.entity;

import com.jason.patterns.strategy.impl.FlyWithWin;

public class RedheadDuck extends Duck {

	public RedheadDuck(){
		super();
		super.setFlyingStragety(new FlyWithWin());
	}
	
	@Override
	public void display() {
		System.out.println("我的头是红色的");
	}

}
