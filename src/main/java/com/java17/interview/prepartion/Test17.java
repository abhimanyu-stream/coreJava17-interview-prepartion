package com.java17.interview.prepartion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Test17 {

    public static void main(String[] args) {

        int[] nums = {2, 6, 7, 8, 3, 9, 0};
        Arrays.sort(nums);
        int target = 8;

        int[] ans= twoSum_sortedArray(nums, target);


        for(int i = 0; i < ans.length; i++){
            System.out.println(i);
        }
    }
    private static int[] twoSum_sortedArray(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum < target) left++;
            else if (sum > target) right--;
            else return new int[]{nums[left], nums[right]};
        }
        return new int[2];
    }

    // Get Min or Max String/Char
    String maxChar = Stream.of("H", "T", "D", "I", "J")
            .max(Comparator.comparing(String::valueOf))
            .get();

    String minChar = Stream.of("H", "T", "D", "I", "J")
            .min(Comparator.comparing(String::valueOf))
            .get();

    // Get Min or Max Number
    Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .max(Comparator.comparing(Integer::valueOf))
            .get();

    Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
            .min(Comparator.comparing(Integer::valueOf))
            .get();



}
