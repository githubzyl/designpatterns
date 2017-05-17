package com.jason.patterns.handlerchain.handler;
/**
 * 销售，可以批准5%以内的折扣
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public class Sales extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.05){
			System.out.format("%s批准了折扣：%.2f%n", this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}
