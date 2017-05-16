package com.jason.patterns.observer.example.jdkobserver;
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
		ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
		observerMum.setObserverName("��������");
		//3��ע��۲���
		weather.addObserver(observerGirl);
		weather.addObserver(observerMum);
		//4��Ŀ�귢������
		weather.setWeatherContent("�����������ʣ�������ƣ�����28��");
	}
	
}
