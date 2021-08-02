/*
    problem statement: https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
 */

package com.gfg.interview.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SubarrayWithGivenSum {

    public List<Integer> subarraySum(int N, int S, Integer[]arr) {
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<N; i++) {
            int sum = arr[i];
            if (sum == S) {
                result.add(i+1);
                return result;
            }
            for (int j=i+1; j<N; j++) {
                sum += arr[j];
                if (sum == S) {
                    result.add(i+1);
                    result.add(j+1);
                    return result;
                }
            }
        }
        result.add(-1);
        return result;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int S = Integer.parseInt(br.readLine());

        Integer[] arr = Stream.of(br.readLine().split(",")).map(Integer::parseInt).toArray(Integer[]::new);

        SubarrayWithGivenSum subarrayWithGivenSum = new SubarrayWithGivenSum();
        System.out.println(subarrayWithGivenSum.subarraySum(N, S, arr));
    }
}
