package com.company.queue;

public class MyQueue {

    private Node head;
    private Node tail;

    public Node enqueue(int value) {
        Node newNode = new Node(value);
        if (head == null || tail == null) {     //Queue is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        return newNode;
    }

    public Integer dequeue() {
        if (head == null || tail == null) {     //Queue is empty
            return null;
        } else {
            int valueToReturn = head.value;
            head = head.next;
            return valueToReturn;
        }
    }

    public Integer peek() {
        if (head == null || tail == null) {     //Queue is empty
            return null;
        } else {
            return head.value;
        }
    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
