package com.jason.patterns.observer.example.custom;
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
		observerGirl.setRemindThing("ʹ���ǵĵ�һ��Լ�ᣬ�ص���Ĺ�԰��������ɢŶ");
		ConcreteWeatherObserver observerMum = new ConcreteWeatherObserver();
		observerMum.setObserverName("��������");
		observerMum.setRemindThing("��һ������ĺ����ӣ�����ȥ���ɨ��");
		//3��ע��۲���
		weather.attach(observerGirl);
		weather.attach(observerMum);
		//4��Ŀ�귢������
		weather.setWeatherContent("�����������ʣ�������ƣ�����28��");
	}
	
}
