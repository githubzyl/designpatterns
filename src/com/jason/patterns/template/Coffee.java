package com.jason.patterns.template;
/**
 * �������ࣺ�ṩ�˿����Ʊ��ľ���ʵ��
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public class Coffee extends RefreshBeverage {
	
	@Override
	protected void brew() {
		System.out.println("�÷�ˮ���ݿ���");
	}

	@Override
	protected void addCondiments() {
		System.out.println("�����Ǻ�ţ��");
	}

}
