package com.leetcode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {
        int []result = new int[2*nums.length];

        for (int i=0; i<nums.length; i++) {
            result[i] = result[i+nums.length] = nums[i];
        }

        return result;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []nums = Stream.of(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

        ConcatenationOfArray concatenationOfArray = new ConcatenationOfArray();
        int []result = concatenationOfArray.getConcatenation(nums);
        for (int elem: result) {
            System.out.print(elem + " ");
        }
    }
}
