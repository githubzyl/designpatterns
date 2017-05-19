package com.jason.patterns.template;

public class Test {

	@org.junit.Test
	public void testCoffee(){
		System.out.println("��������...");
		RefreshBeverage coffee = new Coffee();
		coffee.prepareBeverageTemplate();
		System.out.println("���Ⱥ���");
	}
	
	@org.junit.Test
	public void testTea(){
		System.out.println("������...");
		RefreshBeverage tea = new Tea();
		tea.prepareBeverageTemplate();
		System.out.println("�����");
	}
	
}
