package com.practice.finalpractice.stack;

import com.practice.finalpractice.ll.Node;

public class NGE {
    public void nextGreater(int[] arr) {
        int n = arr.length;
        if (n < 0) {
            System.out.println("Array bis empty");
            return;
        }
        Stack stack = new Stack();
        stack.push(arr[0]);
        int i;
        for (i = 1; i < n; i++) {
            int popped = stack.pop();
            if (arr[i] > popped) {
                stack.push(arr[i]);
            } else if (i == n - 1) {
                stack.push(-1);
            }
        }


    }
}
