package com.jason.patterns.singleton;
/**
 * ����ʽ
 * @author zhaoyl
 * @createdate 2017��5��18��
 */
public class Lazy {

	//1�������췽��˽�л����������ⲿֱ�Ӵ�������
	private Lazy(){
	}
	
	//2���������Ψһʵ��,ʹ��private static����
	private static Lazy instance;
	
	//3���ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
	public static Lazy getInstance(){
		if(null == instance){
			instance = new Lazy();
		}
		return instance;
	}
	
}
