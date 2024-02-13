package com.java17.interview.prepartion;

public class UnderstandFunctionalInterfaceAndLamdaFunctionUsage {

	public static void main(String[] args) {
		
		
		FindSquareRoot f = (n) -> { return Math.sqrt(n);};
		System.out.println(f.findsqrt(23));

	}

}

interface FindSquareRoot{
	
	public abstract double findsqrt(int n);
}
