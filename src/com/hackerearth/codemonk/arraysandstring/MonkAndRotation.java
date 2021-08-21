package com.hackerearth.codemonk.arraysandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkAndRotation {

    public void rotateByRecursion(int[] arr, int rotation) {

        for (int i=arr.length-1; i>0; i--) {
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }


        if(--rotation > 0) {
            rotateByRecursion(arr, rotation);
        }
    }

    public int[] rotateUsingTemp(int[] arr, int size, int rotation) {
        int []result = new int[size];

        for (int i=0; i<size; i++) {
            int index = (i + rotation)%size;
            result[index] = arr[i];
        }

        return result;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases-- > 0) {
            String []input1 = br.readLine().split(" ");
            int noOfElements = Integer.parseInt(input1[0]);
            int stepsOfRotation = Integer.parseInt(input1[1]);

            int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            MonkAndRotation monkAndRotation = new MonkAndRotation();
            /*monkAndRotation.rotateByRecursion(arr, stepsOfRotation);

            for (int i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();*/

            int []result = monkAndRotation.rotateUsingTemp(arr, noOfElements, stepsOfRotation);
            for (int i: result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
