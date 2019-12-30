package com.company.tree;

import java.util.HashMap;
import java.util.Set;

public class MyTrie {

    private Node rootNode = new Node(Character.MAX_VALUE);

    public void insert(String str) {
        Node currNode = rootNode;
        for (char ch : str.toCharArray()
        ) {
            if (currNode.children.containsKey(ch))          //Character found, move to next level (depth)
                currNode = currNode.children.get(ch);
            else {
                Node newNode = new Node(ch);
                currNode.children.put(ch, newNode);        //Add new Node to last level
                currNode = newNode;
            }
        }
        currNode.isEndOfWord = true;
    }


    public boolean contains(String str) {
        Node currNode = rootNode;
        for (char ch : str.toCharArray()
        ) {
            if (currNode.children.containsKey(ch))
                currNode = currNode.children.get(ch);
            else {
                return false;
            }
        }
        return currNode.isEndOfWord;
    }

    public Set<Character> getChildren(String str) {
        Node currNode = rootNode;
        for (char ch : str.toCharArray()
        ) {
            if (currNode.children.containsKey(ch))
                currNode = currNode.children.get(ch);
            else {
                return null;
            }
        }
        return currNode.children.keySet();
    }

    static class Node {
        char value;
        HashMap<Character, Node> children = new HashMap<>();
        boolean isEndOfWord;

        Node(char value) {
            this.value = value;
        }
    }
}
