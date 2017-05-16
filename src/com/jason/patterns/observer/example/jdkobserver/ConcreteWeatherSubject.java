package com.jason.patterns.observer.example.jdkobserver;

import java.util.Observable;

/**
 * ����Ŀ��ľ���ʵ����
 * 
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public class ConcreteWeatherSubject extends Observable {

	// ��ȡ������������Ϣ
	private String weatherContent;

	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//֪ͨ���еĹ۲���
		//ע����֪֮ͨǰ����ʹ��java�ṩ�Ĺ۲���ģʽʱ������Ĵ���ز�����
		this.setChanged();
		//Ȼ������֪ͨ��������ģ��ʵ��
		this.notifyObservers(weatherContent);
		
		//��������������͵���
		//this.notifyObservers();//�Ὣ����ֱ�Ӵ��ݸ��۲���
	}

}
