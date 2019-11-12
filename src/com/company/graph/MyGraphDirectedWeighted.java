package com.company.graph;

import java.util.HashMap;
import java.util.HashSet;

public class MyGraphDirectedWeighted {
    private int numberOfNodes;
    private HashMap<Integer, HashSet<NodeWeightTuple>> adjacentList = new HashMap<>();
    private HashSet<Edge> edgeList = new HashSet<>();
    public static final int GRAPH_TYPE_ADJACENCY_LIST = 1;
    public static final int GRAPH_TYPE_EDGE_LIST = 2;

    public void addVertex(int node) {
        adjacentList.put(node, new HashSet<>());
        numberOfNodes++;
    }

    public void addEdge(int node1, int node2, int weight) {
        //Update the adjacency list
        if (adjacentList.containsKey(node1) && adjacentList.containsKey(node2)) {
            adjacentList.get(node1).add(new NodeWeightTuple(node2, weight));
            adjacentList.get(node2).add(new NodeWeightTuple(node1, weight));
        }

        //Update the edgeList
        edgeList.add(new Edge(node1, node2, weight));
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public void printGraph(int printGraphType) {
        if (printGraphType == GRAPH_TYPE_ADJACENCY_LIST) {
            System.out.println("\n****** Adjacency list ******");
            adjacentList.forEach((key, value) -> {
                System.out.print(key + "-->");
                value.forEach(nodeWeightTuple -> System.out.print(nodeWeightTuple.getNodeWeightTuple()));
                System.out.print("\n");
            });
        } else if (printGraphType == GRAPH_TYPE_EDGE_LIST) {
            System.out.println("\n****** Edge list ******");
            edgeList.forEach(edge -> System.out.println(edge.getEdge()));
        }
    }

    private static class Edge {
        int node1;
        int node2;
        int weight;

        Edge(int node1, int node2, int weight) {
            this.node1 = node1;
            this.node2 = node2;
            this.weight = weight;
        }

        String getEdge() {
            return (node1 + " <-- " + weight + "--> " + node2);
        }
    }

    private static class NodeWeightTuple {
        int node;
        int weight;

        NodeWeightTuple(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        String getNodeWeightTuple() {
            return ("[" + node + "," + weight + "]");
        }
    }
}
