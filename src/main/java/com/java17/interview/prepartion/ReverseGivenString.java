package com.java17.interview.prepartion;

public class ReverseGivenString {

	public static void main(String[] args) {
		
		
		String s = "ejb";
		char [] inputString = s.toCharArray();
		char [] reversedString = new char[s.length()];
		int x = s.length() -1;
		for(int i = 0; i < s.length(); i++) {
			
			reversedString[i]= inputString[x];
			x--;
		}
		System.out.println(reversedString);
		

	}

}
