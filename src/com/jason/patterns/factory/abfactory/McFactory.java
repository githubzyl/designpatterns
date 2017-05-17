package com.jason.patterns.factory.abfactory;
/**
 * 圣诞系列加工厂
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class McFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		return new McBoy();
	}

	@Override
	public Girl getGirl() {
		return new McGirl();
	}

}
