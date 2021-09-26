package com.dynamicproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciUsingRecursion {

    public int fibonacci (int num) {
        if (num<=1) {
            return num;
        }
        return fibonacci(num-1) + fibonacci(num-2);
    }

    public int fibonacci1 (int num) {
        if (num < 2) {
            return num;
        }
        int []arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i=2; i<=num; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[num];
    }

    public int fibonacci2 (int num) {
        int []arr =  new int[num+1];
        arr[0] = 0;
        arr[1] = 1;
        return fibMemoization(arr, num);
     }

    private int fibMemoization (int []arr, int num) {
        if (num < 2) {
            return arr[num];
        }

        if (arr[num] == 0) {
            arr[num] = fibMemoization(arr, num-1) + fibMemoization(arr, num-2);
        }
        return arr[num];
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        long startTime = System.currentTimeMillis();

        System.out.println(new FibonacciUsingRecursion().fibonacci(num));

        System.out.println("Time taken: " + (System.currentTimeMillis() - startTime));
    }
}
