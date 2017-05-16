package com.jason.patterns.observer.example.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * ����Ĺ۲��߶���
 * 
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class ConcreteWeatherObserver implements Observer {

	// �۲��ߵ�����
	private String observerName;

	/**
	 * o Ŀ����� 
	 * arg ���͵Ĳ���
	 */
	@Override
	public void update(Observable o, Object arg) {
		// ��һ�����Ƶķ�ʽ
		System.out.println(observerName + "�յ�����Ϣ��Ŀ�����͵���Ϣ�ǣ�" + arg);
		// �ڶ��������ķ�ʽ
		System.out.println(observerName + "�յ�����Ϣ��������Ŀ��������������������ǣ�" + ((ConcreteWeatherSubject) o).getWeatherContent());
	}

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

}
