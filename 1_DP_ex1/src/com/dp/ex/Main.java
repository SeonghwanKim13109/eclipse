package com.dp.ex;

public class Main {
	public static void main(String[] args) {
		FirstClass f1 = new FirstClass();
		SecondClass s1 = new SecondClass();
		Singleton st1 = Singleton.getUniqueInstance();
		System.out.println(st1.getI());
	}
}
