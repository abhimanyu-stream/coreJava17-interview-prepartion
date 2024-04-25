package com.java17.interview.prepartion;

import java.util.StringJoiner;

class  SingletonDesignPattern{

	private static SingletonDesignPattern instance = null;

	private SingletonDesignPattern() {

		if(instance != null)
		throw new RuntimeException("You are tring to breaking Singleton Design Pattern");
	}

	static {

		try {
			if (instance == null)
				instance = new SingletonDesignPattern();


		} catch (Exception e) {
			throw new RuntimeException("Exception occurred in creating singleton instance");
		}
	}

	public static SingletonDesignPattern getInstance() {
		return instance;
	}


}

public class SingletonClassStaticBlockInitialization{


	public static void main(String[] args) {

		SingletonDesignPattern instance = SingletonDesignPattern.getInstance();
		System.out.println(instance);

	}

}
