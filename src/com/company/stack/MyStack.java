package com.company.stack;

public class MyStack {

    Node top;

    public Node push(int value) {
        Node newNode = new Node(value);
        if (top == null) {    //Stack is empty
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        return newNode;
    }

    public Integer pop() {
        if (top != null) {
            int valToReturn = top.value;
            top = top.next;
            return valToReturn;
        } else
            return null;
    }

    public Integer peek() {
        if (top != null)
            return top.value;
        else
            return null;
    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
