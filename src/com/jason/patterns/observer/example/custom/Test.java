package com.jason.patterns.observer.example.custom;
/**
 * 天气测试类
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class Test {

	public static void main(String[] args) {
		//1、创建目标
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		//2、创建观察者
		ConcreteWeatherObserver observerGirl = new ConcreteWeatherObserver();
		observerGirl.setObserverName("黄明女友");
		observerGirl.setRemindThing("使我们的第一次约会，地点街心公园，不见不散哦");
		ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
		observerMum.setObserverName("黄明老妈");
		observerMum.setRemindThing("是一个购物的好日子，明天去天虹扫货");
		//3、注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		//4、目标发布天气
		weather.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");
	}
	
}
