package com.jason.patterns.observer.example.special;
/**
 * �����۲��߽ӿ�
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public interface WeatherObserver {

	//���µĽӿ�
	void update(WeatherSubject weatherSubject);
	
	//���ù۲�������
	void setObserverName(String observerName);
	
	//ȡ�ù۲�������
	String getObserverName();
	
}
