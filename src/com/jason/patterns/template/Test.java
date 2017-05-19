package com.jason.patterns.template;

public class Test {

	@org.junit.Test
	public void testCoffee(){
		System.out.println("制作咖啡...");
		RefreshBeverage coffee = new Coffee();
		coffee.prepareBeverageTemplate();
		System.out.println("咖啡好了");
	}
	
	@org.junit.Test
	public void testTea(){
		System.out.println("制作茶...");
		RefreshBeverage tea = new Tea();
		tea.prepareBeverageTemplate();
		System.out.println("茶好了");
	}
	
}
