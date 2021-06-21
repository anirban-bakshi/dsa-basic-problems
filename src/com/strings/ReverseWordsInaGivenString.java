package com.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseWordsInaGivenString {

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []input = br.readLine().split("\\.");

        StringBuilder sb = new StringBuilder();

        for (int i=input.length -1; i>=1; i--) {
            sb.append(input[i]);
            sb.append(".");
        }
        sb.append(input[0]);

        System.out.println(sb);
    }
}
