package com.jason.patterns.observer.example.special;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标对象的抽象类
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public abstract class WeatherSubject {

	// 用来保存注册的观察者对象
	protected List<WeatherObserver> observers = new ArrayList<WeatherObserver>();

	// 把订阅天气的人添加到订阅者列表中
	public void attach(WeatherObserver observe) {
		observers.add(observe);
	}

	// 把订阅天气的人从集合中删除
	public void detach(WeatherObserver observe) {
		observers.remove(observe);
	}

	// 通知所有订阅了天气的人
	protected abstract void notifyObserves();

}
