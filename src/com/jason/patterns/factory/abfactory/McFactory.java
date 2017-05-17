package com.jason.patterns.factory.abfactory;
/**
 * ʥ��ϵ�мӹ���
 * @author zhaoyl
 * @createdate 2017��5��17��
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
