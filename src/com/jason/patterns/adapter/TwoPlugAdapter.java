package com.jason.patterns.adapter;
/**
 * 二相转三相的插座适配器
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public class TwoPlugAdapter implements ThreePlugInterface {

	private GBTwoPlug gbTwoPlug;
	
	public TwoPlugAdapter(GBTwoPlug gbTwoPlug) {
		this.gbTwoPlug = gbTwoPlug;
	}

	@Override
	public void powerWithThree() {
		System.out.println("通过转换");
		gbTwoPlug.powerWithTwo();
	}

}
