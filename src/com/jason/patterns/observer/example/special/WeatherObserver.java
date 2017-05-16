package com.jason.patterns.observer.example.special;
/**
 * 天气观察者接口
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public interface WeatherObserver {

	//更新的接口
	void update(WeatherSubject weatherSubject);
	
	//设置观察者名称
	void setObserverName(String observerName);
	
	//取得观察者名称
	String getObserverName();
	
}
