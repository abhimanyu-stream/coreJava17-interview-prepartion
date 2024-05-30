package com.java17.interview.prepartion;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondLargestNumberInArray {

    public static void main(String[] args) {


        int intArray[] = {5,2,10,9,8,3};
        int secondLargest = findSecondLargestt(intArray);
       System.out.println(secondLargest);



       List<Integer> listOfInt = new ArrayList<>();
       for(int i :intArray){
           listOfInt.add(i);
       }
       //Find Second Largest in the List
      Integer result =  listOfInt.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      System.out.println(result);




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

