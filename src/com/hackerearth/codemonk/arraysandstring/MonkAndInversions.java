package com.hackerearth.codemonk.arraysandstring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkAndInversions {

    public int countInversionBruteForce(int [][]arr, int N) {
        int count = 0;

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                for (int p=i; p<N; p++) {
                    for (int q=j; q<N; q++) {
                        if (arr[i][j] > arr[p][q]) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MonkAndInversions monkAndInversions = new MonkAndInversions();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            int N = Integer.parseInt(br.readLine());

            int [][]arr = new int[N][N];

            for (int i=0; i<N; i++) {
                String []input = br.readLine().split(" ");
                for (int j=0; j<input.length; j++) {
                    arr[i][j] = Integer.parseInt(input[j]);
                }
            }

            System.out.println(monkAndInversions.countInversionBruteForce(arr, N));
        }
    }
}
