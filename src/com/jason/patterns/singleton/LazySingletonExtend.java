package com.jason.patterns.singleton;

/**
 * 线程安全,并且保证对象在序列化前后保持一致的懒汉式
 * @author zhaoyl
 * @createdate 2017年5月18日
 */
public class LazySingletonExtend {

	//1、将构造方法私有化，不允许外部直接创建对象
	private LazySingletonExtend(){
	}
	
	//2、创建类的唯一实例,使用private static修饰，volatile表示可见
	private static volatile LazySingletonExtend instance;
	
	//3、提供一个用于获取实例的方法，使用public static修饰
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
	
	//4、如果该对象被用于序列化，可以保证对象在序列化前后保持一致
    public Object readResolve() {  
        return getInstance();
    }  
	
}
