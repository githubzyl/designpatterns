package com.jason.patterns.strategy.impl;

import com.jason.patterns.strategy.interf.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

	public void performFly() {
		System.out.println("我不会飞行！");
	}

}
