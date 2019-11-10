package com.company;

public class Main {

    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.prepend(1);

        myLinkedList.printList();
        myLinkedList.insert(2, 20);


        myLinkedList.remove(2);
        //myLinkedList.reverse();
        myLinkedList.printList();

    }
}
