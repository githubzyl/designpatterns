package com.jason.patterns.factory.abfactory;
/**
 * �����ʵ�ֽӿ�
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public interface PersonFactory {

	//�к��ӿ�
	public Boy getBoy();
	//Ů���ӿ�
	public Girl getGirl();
	
}
