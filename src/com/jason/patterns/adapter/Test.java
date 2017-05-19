package com.jason.patterns.adapter;

public class Test {

	@org.junit.Test
	public void testZH(){
		GBTwoPlug gbTwoPlug = new GBTwoPlug();
		ThreePlugInterface threePlugInterface = new TwoPlugAdapter(gbTwoPlug);
		NoteBook noteBook = new NoteBook(threePlugInterface);
		noteBook.charge();
	}
	
	@org.junit.Test
	public void testExtends(){
		ThreePlugInterface thPlugInterface = new TwoPlugAdapterExtends();
		NoteBook noteBook = new NoteBook(thPlugInterface);
		noteBook.charge();
	}
	
}
