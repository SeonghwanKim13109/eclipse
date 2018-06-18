package com.dp.ex;

public class Singleton {
	private volatile static Singleton uniqueInstance;
	private int i = 10;
	
	private Singleton() {
		
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public static Singleton getUniqueInstance() {
		if(uniqueInstance == null) {
			synchronized (Singleton.class) {
				if(uniqueInstance == null)
					uniqueInstance = new Singleton();
			}
		}
		return uniqueInstance;
	}


}
