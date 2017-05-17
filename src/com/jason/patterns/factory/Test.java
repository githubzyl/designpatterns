package com.jason.patterns.factory;

import com.jason.patterns.factory.abfactory.Boy;
import com.jason.patterns.factory.abfactory.Girl;
import com.jason.patterns.factory.abfactory.HnFactory;
import com.jason.patterns.factory.abfactory.McFactory;
import com.jason.patterns.factory.abfactory.PersonFactory;
import com.jason.patterns.factory.common.HairInterface;
import com.jason.patterns.factory.common.LeftHair;
import com.jason.patterns.factory.common.RightHair;
import com.jason.patterns.factory.gefactory.HairFactory;

/**
 * ģ��ͻ���ʵ��
 * @author zhaoyl
 * @createdate 2017��5��17��
 */
public class Test {
	
	//��ͨ��������ķ���
	@org.junit.Test
	public void test1(){
		HairInterface leftHair = new LeftHair();
		leftHair.draw();
		HairInterface rightHair = new RightHair();
		rightHair.draw();
	}

	@org.junit.Test
	public void testFactory() {
		HairFactory factory = new HairFactory();
//		HairInterface leftHair = factory.getHair("left");
//		HairInterface leftHair = factory.getHairByClass("com.jason.patterns.factory.common.LeftHair");
//		HairInterface leftHair = factory.getHairByKey("left");
		HairInterface leftHair = factory.getHairByClass(LeftHair.class);
		if(null != leftHair){
			leftHair.draw();
		}
	}
	
	@org.junit.Test
	public void testAbstractFactory(){
		PersonFactory mcFactory = new McFactory();
		Girl girl = mcFactory.getGirl();
		girl.drawWoman();
		
		PersonFactory hnFactory = new HnFactory();
		Boy boy = hnFactory.getBoy();
		boy.drawMan();
	}
	
}
