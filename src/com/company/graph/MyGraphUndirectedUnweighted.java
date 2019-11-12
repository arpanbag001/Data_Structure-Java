package com.company.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MyGraphUndirectedUnweighted {

    private int numberOfNodes;
    private HashMap<Integer, HashSet<Integer>> adjacentList = new HashMap<>();

    public void addVertex(int node) {
        adjacentList.put(node, new HashSet<>());
        numberOfNodes++;
    }

    public void addEdge(int node1, int node2) {
        if (adjacentList.containsKey(node1) && adjacentList.containsKey(node2)) {
            adjacentList.get(node1).add(node2);
            adjacentList.get(node2).add(node1);
        }
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void printGraph() {
        System.out.println(adjacentList.toString());
    }
}
