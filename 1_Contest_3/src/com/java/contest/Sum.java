package com.java.contest;

import java.util.ArrayList;
import java.util.Iterator;

public class Sum {
	private ArrayList<Integer> arrList = new ArrayList();
	private int sum = 0;
	
	public Sum() {
		checkCondition();
		makeSum();
		answer();
	}
	
	public void checkCondition() {
		int threeNum;
		int twoNum;
		
		for(int i =1 ; i<10; i++) {
			for(int j =0 ; j<10 ; j++) {
				twoNum = i*10 + j;
				threeNum = i*100+j;
				if(threeNum % twoNum == 0)
					arrList.add(twoNum);
			}
		}
	}
	
	public void makeSum() {
		Iterator<Integer> iterator = arrList.iterator();
		while(iterator.hasNext()) {
			sum +=  iterator.next();
		}
	}
	
	public void answer() {
		System.out.println(sum);
	}
}
