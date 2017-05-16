package com.jason.patterns.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象
 * 它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class SubObject {

	//用来保存注册的观察者对象
	private List<Observer> observers = new ArrayList<Observer>();
	
	//把观察者添加到观察者集合中
	public void attach(Observer observe){
		observers.add(observe);
	}
	
	//把观察者从观察者集合中删除
	public void detach(Observer observe){
		observers.remove(observe);
	}
	
	//通知所有注册的观察者对象
	protected void notifyObserves(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
