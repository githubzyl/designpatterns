package com.jason.patterns.observer.example;

/**
 * 天气测试类
 * 
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class Test {

	// 自定义实现
	@org.junit.Test
	public void testCustom() {
		// 1、创建目标
		com.jason.patterns.observer.example.custom.ConcreteWeatherSubject weather = new com.jason.patterns.observer.example.custom.ConcreteWeatherSubject();
		// 2、创建观察者
		com.jason.patterns.observer.example.custom.ConcreteWeatherObserver observerGirl = new com.jason.patterns.observer.example.custom.ConcreteWeatherObserver();
		observerGirl.setObserverName("黄明女友");
		observerGirl.setRemindThing("使我们的第一次约会，地点街心公园，不见不散哦");
		com.jason.patterns.observer.example.custom.ConcreteWeatherObserver observerMum = new com.jason.patterns.observer.example.custom.ConcreteWeatherObserver();
		observerMum.setObserverName("黄明老妈");
		observerMum.setRemindThing("是一个购物的好日子，明天去天虹扫货");
		// 3、注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		// 4、目标发布天气
		weather.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");
	}

	// jdk自带的实现
	@org.junit.Test
	public void testJdk() {
		// 1、创建目标
		com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherSubject weather = new com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherSubject();
		// 2、创建观察者
		com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver observerGirl = new com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver();
		observerGirl.setObserverName("黄明女友");
		com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver observerMum = new com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver();
		observerMum.setObserverName("黄明老妈");
		// 3、注册观察者
		weather.addObserver(observerGirl);
		weather.addObserver(observerMum);
		// 4、目标发布天气
		weather.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");
	}

	// 区别对待观察者的实现
	@org.junit.Test
	public void testSpecial() {
		// 1、创建目标
		com.jason.patterns.observer.example.special.ConcreteWeatherSubject weather = new com.jason.patterns.observer.example.special.ConcreteWeatherSubject();
		// 2、创建观察者
		com.jason.patterns.observer.example.special.ConcreteWeatherObserver observerGirl = new com.jason.patterns.observer.example.special.ConcreteWeatherObserver();
		observerGirl.setObserverName("黄明女友");
		observerGirl.setRemindThing("约会");
		com.jason.patterns.observer.example.special.ConcreteWeatherObserver observerMum = new com.jason.patterns.observer.example.special.ConcreteWeatherObserver();
		observerMum.setObserverName("黄明老妈");
		observerMum.setRemindThing("购物");
		// 3、注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		// 4、目标发布天气
		weather.setWeatherContent("下雪");
	}

}
