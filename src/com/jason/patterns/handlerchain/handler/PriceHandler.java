package com.jason.patterns.handlerchain.handler;
/**
 * 价格处理人，负责处理客户的折扣申请
 * @author zhaoyl
 * @createdate 2017年5月17日
 */
public abstract class PriceHandler {

	//直接后继，用于传递请求（链表的知识）
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	
	//处理折扣申请
	public abstract void processDiscount(float discount);
	
}
