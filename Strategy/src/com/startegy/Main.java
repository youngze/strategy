package com.startegy;

public class Main {

	public static void main(String[] args) {
		Context context;
		
		//第一个策略
		System.out.println("==========================");
		context = new Context(new FirstStrategy());
		context.operate();
		
		//第二个策略
		System.out.println("==========================");
		context = new Context(new SecondStrategy());
		context.operate();
		
		//第三个策略	
		System.out.println("==========================");
		context = new Context(new ThirdStrategy());
		context.operate();
		System.out.println("==========================");
	}

}
