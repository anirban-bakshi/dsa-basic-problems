/*
    Question link: https://leetcode.com/problems/unique-morse-code-words/
 */
package com.leetcode.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> unique = new HashSet<>();

        String []morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        for (String word : words) {
            char []ch = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c: ch) {
                sb.append(morseCodes[c - 97]);
            }
            unique.add(sb.toString());
        }

        return unique.size();
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String []words = br.readLine().split(",");

        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        System.out.println(uniqueMorseCodeWords.uniqueMorseRepresentations(words));
    }
}
