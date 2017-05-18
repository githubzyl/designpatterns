package com.jason.patterns.singleton;

/**
 * �̰߳�ȫ,���ұ�֤���������л�ǰ�󱣳�һ�µ�����ʽ
 * @author zhaoyl
 * @createdate 2017��5��18��
 */
public class LazySingletonExtend {

	//1�������췽��˽�л����������ⲿֱ�Ӵ�������
	private LazySingletonExtend(){
	}
	
	//2���������Ψһʵ��,ʹ��private static���Σ�volatile��ʾ�ɼ�
	private static volatile LazySingletonExtend instance;
	
	//3���ṩһ�����ڻ�ȡʵ���ķ�����ʹ��public static����
	public static LazySingletonExtend getInstance(){
		if(null == instance){
			synchronized (LazySingletonExtend.class) {
				if(null == instance){
					instance = new LazySingletonExtend();
				}
			}
		}
		return instance;
	}
	
	//4������ö����������л������Ա�֤���������л�ǰ�󱣳�һ��
    public Object readResolve() {  
        return getInstance();
    }  
	
}
