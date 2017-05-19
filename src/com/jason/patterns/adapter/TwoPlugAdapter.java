package com.jason.patterns.adapter;
/**
 * ����ת����Ĳ���������
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public class TwoPlugAdapter implements ThreePlugInterface {

	private GBTwoPlug gbTwoPlug;
	
	public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
		this.gbTwoPlug = gbTwoPlug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("ͨ��ת��");
		gbTwoPlug.powerWithTwo();
	}

}
