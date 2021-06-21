package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergerSortedArraysWithoutExtraSpace {

    public void bruteForce (int []arr1, int []arr2, int m, int n) {

        for (int i=0; i<n ; i++) {
            for (int j=0; j<m; j++) {
                if (arr1[j] > arr2[i]) {
                    int temp = arr1[j];
                    arr1[j] = arr2[i];
                    arr2[i] = temp;
                    int temp2 = arr2[i];
                    for (int k=i+1; k<n; k++) {
                        if (temp2 > arr2[k]) {
                            arr2[k-1] = arr2[k];
                            arr2[k] = temp2;
                        } else {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []input1 = br.readLine().split(" ");
        String []input2 = br.readLine().split(" ");

        int []arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        int []arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();

        MergerSortedArraysWithoutExtraSpace mergerSortedArraysWithoutExtraSpace = new MergerSortedArraysWithoutExtraSpace();
        mergerSortedArraysWithoutExtraSpace.bruteForce(arr1, arr2, arr1.length, arr2.length);

        Arrays.stream(arr1).forEach(element -> System.out.print(element + " "));
        Arrays.stream(arr2).forEach(element -> System.out.print(element + " "));

    }
}
