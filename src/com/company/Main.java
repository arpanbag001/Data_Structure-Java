package com.company;

import com.company.tree.MyTrie;

public class Main {

    public static void main(String[] args) {

        MyTrie myTrie = new MyTrie();
        myTrie.insert("hello");
        myTrie.insert("help");
        System.out.println(myTrie.getChildren("hel"));
        System.out.println(myTrie.contains("hello"));
    }
}
