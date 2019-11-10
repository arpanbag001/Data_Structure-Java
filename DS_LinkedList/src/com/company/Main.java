package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.prepend(1);

        myLinkedList.insert(2, 20);


        myLinkedList.remove(2);
        myLinkedList.printList();
        myLinkedList.reverse();
        myLinkedList.printList();

//        MyDoublyLinkedList myDoublyLinkedList = new MyDoublyLinkedList();
//        myDoublyLinkedList.append(1);
//        myDoublyLinkedList.append(2);
//        myDoublyLinkedList.append(3);
//        myDoublyLinkedList.append(4);
//        myDoublyLinkedList.prepend(0);
//        myDoublyLinkedList.insert(1, 20);
//        myDoublyLinkedList.printList();
//        myDoublyLinkedList.reverse();
//        myDoublyLinkedList.printList();
//        myDoublyLinkedList.printListBackwards();
    }
}
