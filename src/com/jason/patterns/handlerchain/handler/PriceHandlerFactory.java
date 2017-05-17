package com.jason.patterns.handlerchain.handler;
/**
 * 创建PriceHandler的工厂类
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class PriceHandlerFactory {

	/**
	 * 创建PriceHandler的工厂方法
	 * @return
	 */
	public static PriceHandler createPriceHandler() {
		
		PriceHandler sales = new Sales();
		PriceHandler lead = new Lead();
		PriceHandler manager = new Manager();
		PriceHandler director = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		
		sales.setSuccessor(lead);
		lead.setSuccessor(manager);
		manager.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		return sales;
	}

}
