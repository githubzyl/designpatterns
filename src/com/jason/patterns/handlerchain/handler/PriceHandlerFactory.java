package com.jason.patterns.handlerchain.handler;
/**
 * ����PriceHandler�Ĺ�����
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class PriceHandlerFactory {

	/**
	 * ����PriceHandler�Ĺ�������
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
