/*
Given two sorted arrays, we need to merge them in O((n+m)*log(n+m)) time with O(1) extra space into a sorted array,
when n is the size of the first array, and m is the size of the second array.

        Example:

        Input: ar1[] = {10};
        ar2[] = {2, 3};
        Output: ar1[] = {2}
        ar2[] = {3, 10}

        Input: ar1[] = {1, 5, 9, 10, 15, 20};
        ar2[] = {2, 3, 8, 13};
        Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}
*/
package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeTwoSortedArraysWithConstantSpace {

    public void merge (int []arr1, int []arr2, int n, int m) {
        int i=0; int j=0; int k=n-1;

        while (i<=k && j<m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else {
                int temp = arr2[j];
                arr2[j] = arr1[k];
                arr1[k] = temp;
                j++;
                k--;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input1 = br.readLine().split(" ");
        String []input2 = br.readLine().split(" ");

        int []arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        int []arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();


    }

}
