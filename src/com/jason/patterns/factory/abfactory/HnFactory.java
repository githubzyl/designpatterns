package com.jason.patterns.factory.abfactory;
/**
 * Ԫ��ϵ�мӹ���
 * @author zhaoyl
 * @createdate 2017��5��17��
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
