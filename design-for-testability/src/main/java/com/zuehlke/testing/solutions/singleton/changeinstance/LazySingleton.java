package com.zuehlke.testing.solutions.singleton.changeinstance;

public class LazySingleton {
	private static LazySingleton instance;

	public static LazySingleton getInstance() {
		if (instance == null) {
			synchronized (LazySingleton.class) {
				if (instance == null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}

	static void setInstance(LazySingleton lazy) {
		instance = lazy;
	}

	LazySingleton() {
		System.out.println("LazySingleton created");
	}

	private int counter;

	public void increaseCounter() {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

}
