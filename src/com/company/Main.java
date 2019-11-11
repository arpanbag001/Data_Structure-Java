package com.company;

import com.company.tree.MyBinarySearchTree;

public class Main {

    public static void main(String[] args) {

        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();

        myBinarySearchTree.insert(1);
        myBinarySearchTree.insert(2);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(3);
        myBinarySearchTree.insert(5);
        //myBinarySearchTree.traversalInorder(myBinarySearchTree.getRoot());
        System.out.println(myBinarySearchTree.lookup(3));
    }
}
