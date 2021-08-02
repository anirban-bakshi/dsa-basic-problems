package com.leetcode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class BuildArrayFromPermutation {

    public int[] buildArray(int[] nums) {
        int []result = new int[nums.length];

        for (int i=0; i<nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []nums = Stream.of(br.readLine().split(",")).mapToInt(Integer::parseInt).toArray();

        BuildArrayFromPermutation buildArrayFromPermutation = new BuildArrayFromPermutation();
        int []result = buildArrayFromPermutation.buildArray(nums);
        for (int elem : result) {
            System.out.print(elem + " ");
        }
    }
}
