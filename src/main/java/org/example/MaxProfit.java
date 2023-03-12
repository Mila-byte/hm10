package org.example;

public class MaxProfit {
    public static int calculate(int[] arr) {
        int buy = arr[0];
        int maxValue = 0;
        for (int i = 1; i < arr.length; i++) {
            if (buy > arr[i]) {
                buy = arr[i];
            } else if (arr[i] - buy > maxValue) {
                maxValue = arr[i] - buy;
            }
        }
        return maxValue;
    }
}
