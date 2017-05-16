package com.jason.patterns.observer.common;
/**
 * 具体的观察者对象
 * 实现更新的方法，使自身的状态和目标的状态保持一致
 * @author zhaoyl
 * @createdate 2017年5月16日
 */
public class ConcreteObserver implements Observer {
	
	//观察者的状态
	private String observerState;

	//获取目标对象的状态同步到观察者的状态中
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
