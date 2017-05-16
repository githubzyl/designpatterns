package com.jason.patterns.observer.example.custom;

public class ConcreteWeatherSubject extends WeatherSubject{

	// 获取天气的内容信息
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//内容有了，说明天气更新了，通知所有订阅的人
		this.notifyObserves();
	}

}
