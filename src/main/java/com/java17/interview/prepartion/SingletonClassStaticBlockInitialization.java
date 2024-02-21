package com.java17.interview.prepartion;

public class SingletonClassStaticBlockInitialization {

	private static SingletonClassStaticBlockInitialization instance;

	private SingletonClassStaticBlockInitialization() {
	}

	static {

		try {
			instance = new SingletonClassStaticBlockInitialization();

		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	public SingletonClassStaticBlockInitialization getInstance() {
		return instance;
	}

	public static void main(String[] args) {

	}

}
