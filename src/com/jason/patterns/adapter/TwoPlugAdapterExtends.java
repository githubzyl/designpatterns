package com.jason.patterns.adapter;
/**
 * ���ü̳з�ʽ�Ĳ���������
 * @author zhaoyl
 * @createdate 2017��5��19��
 */
public class TwoPlugAdapterExtends extends GBTwoPlug 
							implements ThreePlugInterface
{

	@Override
	public void powerWithThree() {
		System.out.print("�����̳�������");
		this.powerWithTwo();
	}

}
