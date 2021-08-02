package com.binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicOperations {

    static class Node {

        int data;
        Node left;
        Node right;

        public Node (int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    public void add (int data) {
        root = insert (root, data);
    }

    public Node insert (Node current, int data) {
        if (current == null) {
            return new Node (data);
        }

        if (data < current.data) {
            current.left = insert (current.left, data);
        } else if (data > current.data) {
            current.right = insert (current.right, data);
        }

        return current;
    }

    public boolean search (int data) {
        return searchRecursive(root, data);
    }

    public boolean searchRecursive (Node current, int data) {

        if (current == null) {
            return false;
        }

        if (current.data == data) {
            return true;
        }

        return data < current.data ? searchRecursive(current.left, data): searchRecursive(current.right, data);
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BasicOperations basicOperations = new BasicOperations();

        int elements = Integer.parseInt(br.readLine());

        while (elements-- > 0) {

            int element = Integer.parseInt (br.readLine());
            basicOperations.add(element);
        }

        int searchElements = Integer.parseInt(br.readLine());

        while (searchElements-- > 0) {
            System.out.println(basicOperations.search(Integer.parseInt(br.readLine())));
        }
    }
}
