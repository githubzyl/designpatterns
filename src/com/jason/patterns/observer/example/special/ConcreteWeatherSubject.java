package com.jason.patterns.observer.example.special;

public class ConcreteWeatherSubject extends WeatherSubject{

	// ��ȡ������������Ϣ
	private String weatherContent;

	@Override
	protected void notifyObserves() {
		//ѭ������ע��Ĺ۲���
		for(WeatherObserver observer : observers){
			//�����ǣ�
			//����Ů����Ҫ����֪ͨ��������֪ͨ
			//����������Ҫ���꣬��ѩ֪ͨ��������֪ͨ
			
			//��������죬do nothing...
			
			//���������
			if("����".equals(weatherContent)){
				if("����Ů��".equals(observer.getObserverName())){
					observer.update(this);
				}
				if("��������".equals(observer.getObserverName())){
					observer.update(this);
				}
			}
			
			//�������ѩ
			if("��ѩ".equals(weatherContent)){
				if("��������".equals(observer.getObserverName())){
					observer.update(this);
				}
			}
			
		}
	}
	
	public String getWeatherContent() {
		return weatherContent;
	}

	public void setWeatherContent(String weatherContent) {
		this.weatherContent = weatherContent;
		//�������ˣ�˵�����������ˣ�֪ͨ���ж��ĵ���
		this.notifyObserves();
	}

}
