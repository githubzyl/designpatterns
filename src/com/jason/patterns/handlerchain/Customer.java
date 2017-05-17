package com.jason.patterns.handlerchain;

import java.util.Random;

import com.jason.patterns.handlerchain.handler.PriceHandler;
import com.jason.patterns.handlerchain.handler.PriceHandlerFactory;

/**
 * �ͻ��������ۿ�
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class Customer {
	
	private PriceHandler priceHandler;
	
	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}

	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());
		
		Random random = new Random();
		
		for(int i=1 ; i <= 100 ; i++){
			System.out.print(i+":");
			customer.requestDiscount(random.nextFloat());
		}
		
	}

}
