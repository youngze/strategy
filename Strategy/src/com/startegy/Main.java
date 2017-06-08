package com.startegy;

public class Main {

	public static void main(String[] args) {
		Context context;
		
		//��һ������
		System.out.println("==========================");
		context = new Context(new FirstStrategy());
		context.operate();
		
		//�ڶ�������
		System.out.println("==========================");
		context = new Context(new SecondStrategy());
		context.operate();
		
		//����������	
		System.out.println("==========================");
		context = new Context(new ThirdStrategy());
		context.operate();
		System.out.println("==========================");
	}

}
