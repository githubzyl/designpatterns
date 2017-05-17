package com.jason.patterns.factory.abfactory;
/**
 * 人物的实现接口
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public interface PersonFactory {

	//男孩接口
	public Boy getBoy();
	//女孩接口
	public Girl getGirl();
	
}
