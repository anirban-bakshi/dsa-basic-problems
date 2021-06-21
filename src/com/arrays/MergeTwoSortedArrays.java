package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MergeTwoSortedArrays {

    public int [] bruteForce (int []arr1, int []arr2) {
        int [] merged = new int [arr1.length + arr2.length];

        for (int i=0; i<merged.length; i++) {
            merged[i] = -1;
        }

        for (int i=0; i<arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i=0; i<arr2.length; i++) {
            for (int j=0; j<merged.length; j++) {
                if (merged[j] > arr2[i]) {
                    int temp = merged[j];
                    merged[j] = arr2[i];
                    for (int k=j+1; k<merged.length; k++) {
                        int temp2 = merged[k];
                        merged[k] = temp;
                        temp = temp2;
                    }
                    break;
                } else if (merged[j] == -1) {
                    merged[j] = arr2[i];
                    break;
                }
            }
        }

        return merged;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []input1 = br.readLine().split(" ");
        String []input2 = br.readLine().split(" ");

        int []arr1 = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        int []arr2 = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();

        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int []merged = mergeTwoSortedArrays.bruteForce(arr1, arr2);

        Arrays.stream(merged).forEach(element -> System.out.print(element + " "));

    }
}
