package com.jason.patterns.observer.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�����
 * ��֪���۲����Ĺ۲��ߣ����ṩע�ᣨ��ӣ���ɾ���۲��ߵĽӿ�
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class SubObject {

	//��������ע��Ĺ۲��߶���
	private List<Observer> observers = new ArrayList<Observer>();
	
	//�ѹ۲�����ӵ��۲��߼�����
	public void attach(Observer observe){
		observers.add(observe);
	}
	
	//�ѹ۲��ߴӹ۲��߼�����ɾ��
	public void detach(Observer observe){
		observers.remove(observe);
	}
	
	//֪ͨ����ע��Ĺ۲��߶���
	protected void notifyObserves(){
		for(Observer observer : observers){
			observer.update(this);
		}
	}
	
}
