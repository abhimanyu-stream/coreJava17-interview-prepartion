package com.java17.interview.prepartion;

public class Test32 {

    public static void main(String[] args) {

        //// -10, -8, 6, 40, 102, ?, ?, ?
        //class NumberSequenceLogic {
        //	NumberSequenceLogic(int intialValue, int n) {
        //		// TODO: Write your logic here
        //	}
        //}
        //public class numberSequnce {
        //
        //	public static void main(String[] args) {
        //		var intialValue = -10;
        //		var maxNumberOfseries = 8;
        //		new NumberSequenceLogic(intialValue, maxNumberOfseries);
        //	}
        //}
        /**find sequence  and write a java program -10, -8, 6, 40, 102, ?, ?, ?

        Copilot
        Certainly! Let’s analyze the given sequence: -10, -8, 6, 40, 102, …

        The difference between consecutive terms seems to follow a pattern: -10 to -8: +2 -8 to 6: +14 6 to 40: +34 40 to 102: +62
        It appears that the differences between consecutive terms are increasing by adding consecutive even numbers: 2, 4, 6, 8, and so on.
        Following this pattern, let’s find the next term:
        Last term: 102
        Next even number: 10 (since 8 + 2 = 10)
        Next term: 102 + 10 = 112
        Therefore, the next two terms in the sequence are 112 and 122.

        Now, let’s write a Java program to generate the first n terms of this sequence:*/
        int n = 7; // Number of terms (including the known terms)
        int[] series = new int[n];
        series[0] = -10;
        series[1] = -8;

        for (int i = 2; i < n; i++) {
            // Calculate the next term based on the pattern
            series[i] = series[i - 1] + (i * 2);

            // Print the term
            System.out.print(series[i] + " ");
        }
    }
}