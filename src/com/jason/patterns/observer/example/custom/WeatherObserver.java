package com.jason.patterns.observer.example.custom;
/**
 * 天气观察者接口
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public interface WeatherObserver {

	void update(WeatherSubject weatherSubject);

}
