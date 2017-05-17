package com.jason.patterns.handlerchain.handler;
/**
 * CEO��������׼55%���ڵ��ۿ�
 * �ۿ۳���55%���ܾ�����
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.55){
			System.out.format("%s��׼���ۿۣ�%.2f%n", this.getClass().getName(),discount);
		}else{
			System.out.format("%s�ܾ����ۿۣ�%.2f%n", this.getClass().getName(),discount);
		}
	}

}
