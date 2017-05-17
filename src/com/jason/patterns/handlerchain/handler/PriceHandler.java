package com.jason.patterns.handlerchain.handler;
/**
 * �۸����ˣ�������ͻ����ۿ�����
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public abstract class PriceHandler {

	//ֱ�Ӻ�̣����ڴ������������֪ʶ��
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	//�����ۿ�����
	public abstract void processDiscount(float discount);
	
}
