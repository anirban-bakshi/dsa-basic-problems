package com.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortingTheSentence {

    public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder();

        String []arr1 = s.split(" ");
        String []arr2 = new String[s.length()];

        for (String str: arr1) {
            String val = str.substring(0, str.length()-1);
            int index = Integer.parseInt(str.substring(str.length()-1)) - 1;
            arr2[index] = val;
        }

        for (String str: arr2) {
            sb.append(str + " ");
        }

        return sb.toString().trim();
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        SortingTheSentence sortingTheSentence = new SortingTheSentence();
        System.out.println(sortingTheSentence.sortSentence(s));
    }
}
