package com.jason.patterns.singleton;
/**
 * ����ʽ
 * @author zhaoyl
 * @createdate 2017��5��18��
 */
public class Hungry {

	//1�������췽��˽�л����������ⲿֱ�Ӵ�������
	private Hungry(){
	}
	
	//2���������Ψһʵ��,ʹ��private static����
	private static Hungry instance = new Hungry();
	
	//3���ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
	public static Hungry getInstance(){
		return instance;
	}
	
}
