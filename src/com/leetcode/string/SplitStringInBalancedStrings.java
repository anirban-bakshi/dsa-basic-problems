/*
 *  Question link: https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */

package com.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int count = 0;
        int countL = 0;
        int countR = 0;

        char []arr = s.toCharArray();

        for (char c: arr) {
            if (c == 'L') {
                countL++;
            } else {
                countR++;
            }
            if (countL == countR) {
                count++;
                countL = 0;
                countR = 0;
            }
        }

        return count;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SplitStringInBalancedStrings splitStringInBalancedStrings = new SplitStringInBalancedStrings();

        String s = br.readLine();

        System.out.println(splitStringInBalancedStrings.balancedStringSplit(s));
    }
}
