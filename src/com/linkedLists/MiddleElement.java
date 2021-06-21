package com.linkedLists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MiddleElement {

    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void push (int element) {
        Node newNode = new Node(element);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int middle() {

        if (head == null) {
            return -1;
        }

        Node leader = head;
        Node follower = head;
        int count = 0;

        while (head != null) {
            head = head.next;
            count++;
            if (count %2 == 0) {
                follower = follower.next;
            }
        }

        return follower.data;
    }

    public static void main (String []args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int []arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        MiddleElement middleElement = new MiddleElement();

        for (int element: arr) {
            middleElement.push(element);
        }

        System.out.println(middleElement.middle());

    }
}
