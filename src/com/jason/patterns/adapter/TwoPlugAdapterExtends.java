package com.jason.patterns.adapter;
/**
 * 采用继承方式的插座适配器
 * @author zhaoyl
 * @createdate 2017年5月19日
 */
public class TwoPlugAdapterExtends extends GBTwoPlug 
							implements ThreePlugInterface
{

	@Override
	public void powerWithThree() {
		System.out.print("借助继承适配器");
		this.powerWithTwo();
	}

}
