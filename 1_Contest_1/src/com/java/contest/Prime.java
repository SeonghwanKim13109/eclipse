package com.java.contest;

import java.util.ArrayList;
import java.util.Iterator;

public class Prime {
	private final int BASE = 47560;
	private int x = 100000;
	private int a;
	private int b;
	private int c;
	private int d;
	private ArrayList<Integer> arrList = new ArrayList();
	
	public void isMul() {
		for(int i = 1; i<10;i++) {
			int temp = x*i;
			temp += BASE;
			if(temp % 13 == 0 && temp %3 ==0)
				arrList.add(temp);
		}
		Iterator<Integer> iterator = arrList.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		System.out.println();
	}
	
	
}
