package com.jason.patterns.adapter;

public class NoteBook {

	private ThreePlugInterface threePlugInterface;
	
	public NoteBook(ThreePlugInterface threePlugInterface){
		this.threePlugInterface = threePlugInterface;
	}
	
	//Ê¹ÓÃ²å×ù³äµç
	public void charge(){
		threePlugInterface.powerWithThree();
	}
	
}
