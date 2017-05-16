package com.jason.patterns.observer.example.custom;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject {

	// ��������ע��Ĺ۲��߶���
	private List<WeatherObserver> observers = new ArrayList<WeatherObserver>();

	// �Ѷ�������������ӵ��������б���
	public void attach(WeatherObserver observe) {
		observers.add(observe);
	}

	// �Ѷ����������˴Ӽ�����ɾ��
	public void detach(WeatherObserver observe) {
		observers.remove(observe);
	}

	// ֪ͨ���ж�������������
	protected void notifyObserves() {
		for (WeatherObserver observer : observers) {
			observer.update(this);
		}
	}

}
