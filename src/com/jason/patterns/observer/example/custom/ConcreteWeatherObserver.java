package com.jason.patterns.observer.example.custom;

/**
 * ����������۲���
 * 
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class ConcreteWeatherObserver implements WeatherObserver {

	// �۲��ߵ�����
	private String observerName;
	
	//�������ݵ��������Ŀ�괦��ȡ
	private String weatherContent;
	
	//���ѵ�����
	private String remindThing;
	
	@Override
	public void update(WeatherSubject weatherSubject) {
		weatherContent = ((ConcreteWeatherSubject) weatherSubject).getWeatherContent();
		System.out.println(observerName + "�յ���" + weatherContent + "," + remindThing);
	}
	

	public String getObserverName() {
		return observerName;
	}

	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
	}

	public String getRemindThing() {
		return remindThing;
	}

	public void setRemindThing(String remindThing) {
		this.remindThing = remindThing;
	}

}
