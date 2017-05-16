package com.jason.patterns.observer.example.custom;

/**
 * 具体的天气观察者
 * 
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class ConcreteWeatherObserver implements WeatherObserver {

	// 观察者的名字
	private String observerName;
	
	//天气内容的情况，从目标处获取
	private String weatherContent;
	
	//提醒的内容
	private String remindThing;
	
	@Override
	public void update(WeatherSubject weatherSubject) {
		weatherContent = ((ConcreteWeatherSubject) weatherSubject).getWeatherContent();
		System.out.println(observerName + "收到了" + weatherContent + "," + remindThing);
	}
	

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

}
