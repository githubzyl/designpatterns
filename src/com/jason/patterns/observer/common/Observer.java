package com.jason.patterns.observer.common;
/**
 * �۲��߽ӿ�
 * ����һ�����µĽӿڸ���Щ��Ŀ�귢���ı��ʱ��֪ͨ�Ķ���
 * @author zhaoyl
 * @createdate 2017��5��16��
 */
public interface Observer {

	/**
	 * ���µĽӿ�
	 * @param subObject ����Ŀ����󣬷����ȡ��Ӧ��Ŀ������״̬
	 */
	void update(SubObject subObject);

}
