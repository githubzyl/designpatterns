package com.jason.patterns.observer.common;
/**
 * ����Ĺ۲��߶���
 * ʵ�ָ��µķ�����ʹ�����״̬��Ŀ���״̬����һ��
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class ConcreteObserver implements Observer {
	
	//�۲��ߵ�״̬
	private String observerState;

	//��ȡĿ������״̬ͬ�����۲��ߵ�״̬��
	@Override
	public void update(SubObject subObject) {
		observerState = ((ConcreteSubject) subObject).getSubjectState();
	}
	
	public String getObserverState() {
		return observerState;
	}

	public void setObserverState(String observerState) {
		this.observerState = observerState;
	}

}
