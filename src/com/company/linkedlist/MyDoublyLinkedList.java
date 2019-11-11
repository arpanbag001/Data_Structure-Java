package com.company.linkedlist;

public class MyDoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

    public Node append(int value) {
        Node newNode = new Node(value);

        if (head == null && tail == null) { //List is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
        return newNode;
    }

    public Node prepend(int value) {
        Node newNode = new Node(value);

        if (head == null && tail == null) { //List is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
        return newNode;
    }

    public Node insert(int index, int value) {

        if (index <= 0)
            return prepend(value);
        else if (index > length)
            return append(value);
        else {
            Node beforeNode = traverseToIndex(index - 1);
            Node nextNode = beforeNode.next;
            Node newNode = new Node(value);
            newNode.next = nextNode;
            newNode.prev = beforeNode;
            beforeNode.next = newNode;
            nextNode.prev = newNode;
            length++;
            return newNode;
        }
    }

    public Node remove(int index) {
        if (head != null && tail != null) {     //List is not empty
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

    public Node reverse() {
        if (length > 1) { //List is having more than 1 element, as only then reversing makes sense
            Node currentNode = head;
            while (currentNode != null) {
                Node nextNode = currentNode.next;   //Save the next node
                Node tempNode = currentNode.prev;   //Swap
                currentNode.prev = currentNode.next;
                currentNode.next = tempNode;
                currentNode = nextNode;     //Point to next node
            }
            //Swap
            Node tempNode = tail;
            tail = head;
            head = tempNode;

        }
        return head;
    }

    public void printList() {
        Node tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.value);
            if (tempNode.next != null)
                System.out.print("  <-->  ");
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

    public void printListBackwards() {
        Node tempNode = tail;
        while (tempNode != null) {
            System.out.print(tempNode.value);
            if (tempNode.prev != null)
                System.out.print("  <-->  ");
            tempNode = tempNode.prev;
        }
        System.out.println("\n");
    }


    class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
