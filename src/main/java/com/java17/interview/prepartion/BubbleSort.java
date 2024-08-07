package com.java17.interview.prepartion;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 1, 6};

        System.out.println("Before sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After sorting:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        // Pointing to same index in both loop
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swapping using temp
                    // it can using bits shift and substract approach
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
}


    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
