package com.jason.patterns.handlerchain.handler;
/**
 * �����ܼ࣬������׼40%���ڵ��ۿ�
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class Director extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.40){
			System.out.format("%s��׼���ۿۣ�%.2f%n", this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}
