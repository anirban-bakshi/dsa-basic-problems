package com.binaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicBinaryTree {

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

    public void insert (int data) {
        root = insertNode(root, data);
    }

    public Node insertNode (Node root, int data) {

        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data < data) {
            root = root.right;
            return insertNode (root, data);
        } else {
            root = root.left;
            return insertNode (root, data);
        }
    }

    public Node search (Node root, int data) {

        if (root == null) {
            System.out.println("Element not found");
            return null;
        }

        if (root.data == data) {
            System.out.println("Element found");
            return root;
        }

        if (root.data < data) {
            root = root.right;
            return search (root, data);
        }

        root = root.left;
        return search (root, data);
    }

    public void leftView (Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");

        if (root.left == null && root.right == null) {
            return;
        }

        if (root.left != null) {
            leftView (root.left);
        } else if (root.right != null) {
            leftView(root.right);
        }
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int elements = Integer.parseInt(br.readLine());

        BasicBinaryTree binaryTree = new BasicBinaryTree();

        while (elements-- > 0) {
            int input = Integer.parseInt(br.readLine());
            binaryTree.insert(input);
        }

        binaryTree.leftView(binaryTree.root);
    }
}
