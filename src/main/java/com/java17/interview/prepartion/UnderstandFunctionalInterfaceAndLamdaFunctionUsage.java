package com.java17.interview.prepartion;

public class UnderstandFunctionalInterfaceAndLamdaFunctionUsage {

	public static void main(String[] args) {
		
		
		FindSquareRoot f = (n) -> { return Math.sqrt(n);};
		System.out.println(f.findsqrt(23));
		FindSquareRoot f2 = (n)->{return  Math.sqrt(n);};
		f2.findsqrt(4);


	}

}

interface FindSquareRoot{
	
	public abstract double findsqrt(int n);
	// static methods ok
	// default methods ok
	// public abstract internal access specifier


}
