package com.jason.patterns.observer.common;
/**
 * 具体的目标对象
 * 负责把有关状态存入到相应的观察者对象中
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class ConcreteSubject extends SubObject{
	
	//目标对象的状态
	private String subjectState;

	public String getSubjectState() {
		return subjectState;
	}

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
		this.notifyObserves();//状态发生改变时，添加通知的方法
	}
	
}
