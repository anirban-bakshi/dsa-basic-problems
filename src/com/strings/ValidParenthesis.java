package com.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidParenthesis {

    int MAX_LENGTH = 1000000000;
    char stack[] = new char[MAX_LENGTH];

    int head = -1;

    public boolean isFull() {
        return head == MAX_LENGTH-1;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void push (char c) {
        stack[++head] = c;
    }

    public char pop () {
        return stack[head--];
    }

    public boolean isValid(String str) {

        char []arr = str.toCharArray();

        if (arr.length % 2 != 0) {
            return false;
        }

        for (char c: arr) {
            if (c == '[' || c == '{' || c== '(') {
                push(c);
            } else if (c == ']' || c == '}' || c == ')') {
                if (!isEmpty()) {
                    char temp = pop();
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

        if (!isEmpty()) {
            return false;
        }

        return true;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        ValidParenthesis validParenthesis = new ValidParenthesis();

        System.out.println(validParenthesis.isValid(str));
    }
}
