package com.refactorForCompetitive;

import java.util.Stack;

public class Test1 {

    public boolean isValid(String str) {

        char []arr = str.toCharArray();
        Stack<Character> stack =  new Stack<>();

        if (arr.length %2 != 0) {
            return false;
        }

        for (char c: arr) {
            if (c == '[' || c == '{' || c== '(') {
                stack.push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (!stack.isEmpty()) {
                    char temp = stack.pop();
                    if (c == ']' && temp != '[') {
                        return false;
                    } else if (c == '}' && temp != '{') {
                        return false;
                    } else if (c == ')' && temp != '(') {
                        return false;
                    }
                } else {
                    return false;
                }

            }
        }

        if (!stack.empty()) {
            return false;
        }

        return true;
    }
}
