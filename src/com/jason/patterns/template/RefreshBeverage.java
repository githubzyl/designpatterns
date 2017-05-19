package com.jason.patterns.template;
/**
 * ������࣬Ϊ���������ṩһ���㷨���
 * ҵ����������
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public abstract class RefreshBeverage {

	/**
	 * �������ϵ�ģ�巽��
	 * ��װ���������๲ͬ��ѭ�ĵ��㷨���
	 */
	public final void prepareBeverageTemplate(){
		//����1����ˮ���
		boilWater();
		//����2����������
		brew();
		//����3�������ϵ��뱭��
		pourInCup();
		if(isCustomerWantsCondiments()){
			//����4�������ζ��
			addCondiments();
		}
	}

	/**
	 * Hook���������Ӻ������ṩһ��Ĭ�ϻ�յ�ʵ��
	 * ���������������о����Ƿ�ҹ��Լ���ιҹ�
	 * ѯ���û��Ƿ�����ζ��
	 * @return
	 */
	protected boolean isCustomerWantsCondiments() {
		return true;
	}

	//������������ˮ���
	private void boilWater() {
		System.out.println("��ˮ���");
	}
	
	//����Ļ�����������������
	protected abstract void brew();
	
	//���������������ϵ��뱭��
	private void pourInCup() {
		System.out.println("�����ϵ��뱭��");
	}
	
	//����Ļ��������������ζ��
	protected abstract void addCondiments();
	
}
