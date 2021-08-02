package com.gfg.interview.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class CountTheTriplets {

    public int countTriplet(int []arr, int N) {
        int count = 0;

        int []elements = new int[1000000000];

        for (int i=0; i<N; i++) {
            elements[arr[i]] = 1;
        }

        for (int i=0; i<N-1; i++) {
            for (int j=i+1; j<N; j++) {
                if (elements[arr[i] + arr[j]] == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int []arr = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        CountTheTriplets countTheTriplets = new CountTheTriplets();
        System.out.println(countTheTriplets.countTriplet(arr, N));
    }
}
