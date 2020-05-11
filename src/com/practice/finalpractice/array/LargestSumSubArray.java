package com.practice.finalpractice.array;

//Kadane's Algo
public class LargestSumSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(new LargestSumSubArray().largestSumSubArray(arr));
        System.out.println(new LargestSumSubArray().largestSumSubArray2(arr));
        System.out.println(new LargestSumSubArray().largestSumSubArray3(arr));
    }

    //O(n)
    public int largestSumSubArray(int[] arr) {
        int n = arr.length;
        int sum = 0;
        int sumMax = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sumMax < sum) {
                sumMax = sum;
            }
        }

        return sumMax;
    }

    //O(n)
    public int largestSumSubArray2(int[] arr) {
        int n = arr.length;
        int sumMax = Integer.MIN_VALUE, sum = 0, start = 0, end = 0, s = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sumMax < sum) {
                sumMax = sum;
                start = s;
                end = i;
            }
            if (sum < 0) {
                sum = 0;
                s = i + 1;
            }
        }
        System.out.println("Start index : " + start);
        System.out.println("End index : " + end);
        return sumMax;
    }

    //O(n) handling all -ve's
    public int largestSumSubArray3(int[] arr) {
        int n = arr.length;
        int sum = arr[0], sumMax = arr[0];
        for (int i = 1; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            sumMax = Math.max(sum, sumMax);
        }
        return sumMax;
    }
}
