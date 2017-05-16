package com.jason.patterns.observer.example.special;

import java.util.ArrayList;
import java.util.List;
/**
 * Ŀ�����ĳ�����
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public abstract class WeatherSubject {

	// ��������ע��Ĺ۲��߶���
	protected List<WeatherObserver> observers = new ArrayList<WeatherObserver>();

	// �Ѷ�������������ӵ��������б���
	public void attach(WeatherObserver observe) {
		observers.add(observe);
	}

	// �Ѷ����������˴Ӽ�����ɾ��
	public void detach(WeatherObserver observe) {
		observers.remove(observe);
	}

	// ֪ͨ���ж�������������
	protected abstract void notifyObserves();

}
