package com.concept.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {

    public void sort(int []arr) {

        for (int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(input);

        Arrays.stream(input).forEach(element -> System.out.print(element + " "));
    }
}
