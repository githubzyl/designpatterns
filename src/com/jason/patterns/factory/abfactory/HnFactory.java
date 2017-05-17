package com.jason.patterns.factory.abfactory;
/**
 * 元旦系列加工厂
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class HnFactory implements PersonFactory {

	@Override
	public Boy getBoy() {
		return new HnBoy();
	}

	@Override
	public Girl getGirl() {
		return new HnGirl();
	}

}
