package com.jason.patterns.observer.example.special;
/**
 * ����������
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class Test {

	public static void main(String[] args) {
		//1������Ŀ��
		ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
		//2�������۲���
		ConcreteWeatherObserver observerGirl = new ConcreteWeatherObserver();
		observerGirl.setObserverName("����Ů��");
		observerGirl.setRemindThing("Լ��");
		ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
		observerMum.setObserverName("��������");
		observerMum.setRemindThing("����");
		//3��ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);
		//4��Ŀ�귢������
		weather.setWeatherContent("��ѩ");
	}
	
}
