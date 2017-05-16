package com.jason.patterns.observer.example.custom;

public class ConcreteWeatherSubject extends WeatherSubject{

	// ��ȡ������������Ϣ
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//�������ˣ�˵�����������ˣ�֪ͨ���ж��ĵ���
		this.notifyObserves();
	}

}
