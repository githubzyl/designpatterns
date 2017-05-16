package com.jason.patterns.observer.example.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体的观察者对象
 * 
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class ConcreteWeatherObserver implements Observer {

	// 观察者的名字
	private String observerName;

	/**
	 * o 目标对象 
	 * arg 推送的参数
	 */
	@Override
	public void update(Observable o, Object arg) {
		// 第一种是推的方式
		System.out.println(observerName + "收到了消息，目标推送的消息是：" + arg);
		// 第二种是拉的方式
		System.out.println(observerName + "收到了消息，主动到目标对象中拉，拉的内容是：" + ((ConcreteWeatherSubject) o).getWeatherContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
