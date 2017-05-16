package com.jason.patterns.observer.common;
/**
 * �����Ŀ�����
 * ������й�״̬���뵽��Ӧ�Ĺ۲��߶�����
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class ConcreteSubject extends SubObject{
	
	//Ŀ������״̬
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObserves();//״̬�����ı�ʱ�����֪ͨ�ķ���
	}
	
}
