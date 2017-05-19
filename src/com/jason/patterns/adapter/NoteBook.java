package com.jason.patterns.adapter;

public class NoteBook {

	private ThreePlugInterface threePlugInterface;
	
	public NoteBook(ThreePlugInterface threePlugInterface){
		this.threePlugInterface = threePlugInterface;
	}
	
	//ʹ�ò������
	public void charge(){
		threePlugInterface.powerWithThree();
	}
	
}
