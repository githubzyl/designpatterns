package com.jason.patterns.factory.common;
/**
 * 左偏分发型
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class LeftHair implements HairInterface {

	/**
	 * 画了一个左偏分发型
	 */
	@Override
	public void draw() {
		System.out.println("------左偏分发型------");
	}

}
