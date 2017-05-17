package com.jason.patterns.factory.common;
/**
 * 右偏分发型
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class RightHair implements HairInterface {

	/**
	 * 画了一个右偏分发型
	 */
	@Override
	public void draw() {
		System.out.println("------右偏分发型------");
	}

}
