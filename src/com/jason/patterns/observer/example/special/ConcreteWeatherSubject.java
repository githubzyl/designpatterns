package com.jason.patterns.observer.example.special;

public class ConcreteWeatherSubject extends WeatherSubject{

	// 获取天气的内容信息
	private String weatherContent;

	@Override
	protected void notifyObserves() {
		//循环所有注册的观察者
		for(WeatherObserver observer : observers){
			//规则是：
			//黄明女友需要下雨通知，其他不通知
			//黄明老妈需要下雨，下雪通知，其他不通知
			
			//如果是晴天，do nothing...
			
			//如果是下雨
			if("下雨".equals(weatherContent)){
				if("黄明女友".equals(observer.getObserverName())){
					observer.update(this);
				}
				if("黄明老妈".equals(observer.getObserverName())){
					observer.update(this);
				}
			}
			
			//如果是下雪
			if("下雪".equals(weatherContent)){
				if("黄明老妈".equals(observer.getObserverName())){
					observer.update(this);
				}
			}
			
		}
	}
	
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//内容有了，说明天气更新了，通知所有订阅的人
		this.notifyObserves();
	}

}
