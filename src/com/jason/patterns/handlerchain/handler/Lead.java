package com.jason.patterns.handlerchain.handler;
/**
 * ����С�鳤��������׼15%���ڵ��ۿ�
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class Lead extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.15){
			System.out.format("%s��׼���ۿۣ�%.2f%n", this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}
