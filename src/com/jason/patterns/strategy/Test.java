package com.jason.patterns.strategy;

import com.jason.patterns.strategy.entity.Duck;
import com.jason.patterns.strategy.entity.SpaceDuck;

public class Test {

	public static void main(String[] args){
		System.out.println("≤‚ ‘—º◊”≥Ã–Ú");
		System.out.println("************************");
		Duck duck = null;
//		duck = new MallardDuck();
//		duck = new RedheadDuck();\
//		duck = new RubberDuck();
//		duck = new BigYellow();
		duck = new SpaceDuck();
		
		duck.display();
		duck.quack();
		duck.fly();
		System.out.println("************************");
		System.out.println("≤‚ ‘ÕÍ±œ");
	}

}
