package com.jason.patterns.observer.example.special;
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
		observerGirl.setRemindThing("约会");
		ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
		observerMum.setObserverName("黄明老妈");
		observerMum.setRemindThing("购物");
		//3、注册观察者
		weather.attach(observerGirl);
		weather.attach(observerMum);
		//4、目标发布天气
		weather.setWeatherContent("下雪");
	}
	
}
