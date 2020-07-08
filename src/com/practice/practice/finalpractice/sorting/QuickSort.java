package com.practice.practice.finalpractice.sorting;

import java.util.Arrays;

import static com.practice.practice.oldpractice.constants.MyConstants.swap;

//Divide and conquer
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pIndex = partition(arr, l, r);
            quickSort(arr, l, pIndex - 1);
            quickSort(arr, pIndex + 1, r);
        }

    }

    private int partition(int[] arr, int l, int r) {
        int pIndex = l, last = arr[r];
        for (int i = l; i < r; i++) {
            if (arr[i] <= last) {
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, r);
        return pIndex;
    }
}
