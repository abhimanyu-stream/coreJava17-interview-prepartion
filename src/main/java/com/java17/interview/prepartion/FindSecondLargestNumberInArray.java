package com.java17.interview.prepartion;

import java.awt.*;

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {


        int intArray[] = {5,2,10,9,8,3};
        int secondLargest = findSecondLargestt(intArray);
       System.out.println(secondLargest);




    }
    static int findSecondLargest(int[] intArray) {
        int largest = intArray[0];
        int secondLargest = -1;
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > largest) {
                secondLargest = largest;
                largest = intArray[i];
            } else if (intArray[i] < largest && intArray[i] > secondLargest) {
                secondLargest = intArray[i];
            }
        }
        return secondLargest;
    }
    static int findSecondLargestt(int[] intArray) {

        int largest = intArray[0];
        int secondLargest = -1;

        for(int i = 1; i < intArray.length; i++){
            if(intArray[i] > largest){

                secondLargest = largest;
                largest = intArray[i];

            }else if(intArray[i] < largest && intArray[i] > secondLargest){
                secondLargest = intArray[i];
            }

        }
        return secondLargest;
    }
}

