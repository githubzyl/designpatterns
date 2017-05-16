package com.jason.patterns.observer.example.jdkobserver;

import java.util.Observable;

/**
 * 天气目标的具体实现类
 * 
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class ConcreteWeatherSubject extends Observable {

	// 获取天气的内容信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//通知所有的观察者
		//注意在通知之前，在使用java提供的观察者模式时，下面的代码必不可少
		this.setChanged();
		//然后主动通知，先用推模型实现
		this.notifyObservers(weatherContent);
		
		//如果是拉方法，就调用
		//this.notifyObservers();//会将引用直接传递给观察者
	}

}
