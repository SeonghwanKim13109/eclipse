package com.dp.ex;

public class FirstClass {
	public FirstClass() {
		Singleton s1 = Singleton.getUniqueInstance();
		System.out.println("FirstClass");
		System.out.println("i = " + s1.getI());
		s1.setI(200);
		System.out.println("i = "+ s1.getI());
	}
}
