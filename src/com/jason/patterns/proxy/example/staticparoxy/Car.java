package com.jason.patterns.proxy.example.staticparoxy;

import java.util.Random;

import com.jason.patterns.proxy.example.common.Moveable;

public class Car implements Moveable {

	@Override
	public void move() {
		//实现开车
		try {
			Thread.sleep(new Random().nextInt(1000));
			System.out.println("汽车行驶中...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
