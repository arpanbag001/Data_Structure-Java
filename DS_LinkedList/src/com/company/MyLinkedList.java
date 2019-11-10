package com.company;

public class MyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    Node append(int value) {
        Node newNode = new Node(value);

        if (head == null && tail == null) { //List is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        return newNode;
    }

    Node prepend(int value) {
        Node newNode = new Node(value);

        if (head == null && tail == null) { //List is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return newNode;
    }

    Node insert(int index, int value) {

        if (index <= 0)
            return prepend(value);
        else if (index > length)
            return append(value);
        else {
            Node beforeNode = traverseToIndex(index - 1);
            Node nextNode = beforeNode.next;
            Node newNode = new Node(value);
            newNode.next = nextNode;
            beforeNode.next = newNode;
            length++;
            return newNode;
        }
    }

    Node remove(int index) {
        if (length > 0) {     //List is not empty
            if (index <= 0) {       //Remove head
                Node nodeToRemove = head;
                head = head.next;
                return nodeToRemove;
            } else if (index >= length - 1) {    //Remove tail
                Node nodeToRemove = tail;
                Node secondLastNode = traverseToIndex(length - 2);
                secondLastNode.next = null;
                tail = secondLastNode;
                return nodeToRemove;
            } else {
                Node beforeNode = traverseToIndex(index - 1);
                Node currentNode = beforeNode.next;
                beforeNode.next = currentNode.next;
                length--;
                return currentNode;
            }
        } else
            return null;
    }

    private Node traverseToIndex(int index) {
        Node currentNode = head;
        int i = 0;
        while (i < index && currentNode != null) {
            currentNode = currentNode.next;
            i++;
        }
        return currentNode;
    }

    Node reverse() {
        if (length > 1) { //List is having more than 1 element, as only then reversing makes sense
            Node trailingNode = head;
            Node leadingNode = trailingNode.next;
            while (leadingNode != null) {
                Node nextNode = leadingNode.next;
                leadingNode.next = trailingNode;
                trailingNode = leadingNode;
                leadingNode = nextNode;
            }
            //Swap
            Node tempNode = head;
            head = tail;
            tail = tempNode;
            tail.next = null;
        }
        return head;
    }

    void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value);
            if (tempNode.next != null)
                System.out.print("  -->  ");
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
