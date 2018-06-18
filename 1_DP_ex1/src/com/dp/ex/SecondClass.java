package com.dp.ex;

public class SecondClass {
	public SecondClass() {
		// TODO Auto-generated constructor stub
		Singleton s2 = Singleton.getUniqueInstance();
		System.out.println("SecondClass");
		System.out.println("i = "+s2.getI());
		s2.setI(500);
		System.out.println("i = "+s2.getI());
	}
}
