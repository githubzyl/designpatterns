package com.jason.patterns.template;
/**
 * ��������һ���������ࣺ�ṩ�˲�ľ���ʵ��
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public class Tea extends RefreshBeverage{
	
	/**
	 * ����ͨ�����ǵ���ʽѡ����ع��Ӻ���
	 */
	@Override
	protected boolean isCustomerWantsCondiments() {
		return false;
	}

	@Override
	protected void brew() {
		System.out.println("��80�ȵ���ˮ���ݲ�Ҷ5����");
	}

	@Override
	protected void addCondiments() {
		System.out.println("��������");
	}

}
