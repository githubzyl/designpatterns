package com.jason.patterns.observer.example;

/**
 * ����������
 * 
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class Test {

	// �Զ���ʵ��
	@org.junit.Test
	public void testCustom() {
		// 1������Ŀ��
		com.jason.patterns.observer.example.custom.ConcreteWeatherSubject weather = new com.jason.patterns.observer.example.custom.ConcreteWeatherSubject();
		// 2�������۲���
		com.jason.patterns.observer.example.custom.ConcreteWeatherObserver observerGirl = new com.jason.patterns.observer.example.custom.ConcreteWeatherObserver();
		observerGirl.setObserverName("����Ů��");
		observerGirl.setRemindThing("ʹ���ǵĵ�һ��Լ�ᣬ�ص���Ĺ�԰��������ɢŶ");
		com.jason.patterns.observer.example.custom.ConcreteWeatherObserver observerMum = new com.jason.patterns.observer.example.custom.ConcreteWeatherObserver();
		observerMum.setObserverName("��������");
		observerMum.setRemindThing("��һ������ĺ����ӣ�����ȥ���ɨ��");
		// 3��ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);
		// 4��Ŀ�귢������
		weather.setWeatherContent("�����������ʣ�������ƣ�����28��");
	}

	// jdk�Դ���ʵ��
	@org.junit.Test
	public void testJdk() {
		// 1������Ŀ��
		com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherSubject weather = new com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherSubject();
		// 2�������۲���
		com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver observerGirl = new com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver();
		observerGirl.setObserverName("����Ů��");
		com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver observerMum = new com.jason.patterns.observer.example.jdkobserver.ConcreteWeatherObserver();
		observerMum.setObserverName("��������");
		// 3��ע��۲���
		weather.addObserver(observerGirl);
		weather.addObserver(observerMum);
		// 4��Ŀ�귢������
		weather.setWeatherContent("�����������ʣ�������ƣ�����28��");
	}

	// ����Դ��۲��ߵ�ʵ��
	@org.junit.Test
	public void testSpecial() {
		// 1������Ŀ��
		com.jason.patterns.observer.example.special.ConcreteWeatherSubject weather = new com.jason.patterns.observer.example.special.ConcreteWeatherSubject();
		// 2�������۲���
		com.jason.patterns.observer.example.special.ConcreteWeatherObserver observerGirl = new com.jason.patterns.observer.example.special.ConcreteWeatherObserver();
		observerGirl.setObserverName("����Ů��");
		observerGirl.setRemindThing("Լ��");
		com.jason.patterns.observer.example.special.ConcreteWeatherObserver observerMum = new com.jason.patterns.observer.example.special.ConcreteWeatherObserver();
		observerMum.setObserverName("��������");
		observerMum.setRemindThing("����");
		// 3��ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);
		// 4��Ŀ�귢������
		weather.setWeatherContent("��ѩ");
	}

}
