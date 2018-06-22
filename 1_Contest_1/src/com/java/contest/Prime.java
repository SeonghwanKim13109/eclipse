package com.java.contest;

import java.util.ArrayList;
import java.util.Iterator;

public class Prime {
	private final int BASE = 47560;
	private int x = 100000;
	private int result;
	private int a = 0;
	private int b = 0;
	private int c = 0;
	private int d = 0;

	public int getResult() {
		return result;
	}

	public Prime() {
		isMul();
		findValue(result, 2);
		answer();
	}

	public void isMul() {
		for (int i = 1; i < 10; i++) {
			int temp = x * i;
			temp += BASE;
			if (temp % 13 == 0 && temp % 3 == 0) {
				result = temp;
				break;
			}
		}
	}

	public void findValue(int value, int radix) {
		int temp = value;
		while (temp % radix == 0) {
			temp = temp / radix;
			switch (radix) {
			case 2:
				a++;
				break;
			case 3:
				b++;
				break;
			case 5:
				c++;
				break;
			case 13:
				d++;
				break;
			}
		}
		switch (radix) {
		case 2:
			findValue(temp, 3);
			break;
		case 3:
			findValue(temp, 5);
			break;
		case 5:
			findValue(temp, 13);
			break;
		case 13:
			break;
		}
		return;
	}

	public void answer() {
		int temp = 0;
		temp += a * 1000;
		temp += (b / 2) * 100;
		temp += c * 10;
		temp += d;
		System.out.println(temp);
	}
}
