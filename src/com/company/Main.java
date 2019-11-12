package com.company;

import com.company.graph.MyGraphDirectedUnweighted;
import com.company.graph.MyGraphDirectedWeighted;
import com.company.graph.MyGraphUndirectedUnweighted;

public class Main {

    public static void main(String[] args) {

        MyGraphDirectedWeighted myGraphDirectedWeighted = new MyGraphDirectedWeighted();

        myGraphDirectedWeighted.addVertex(0);
        myGraphDirectedWeighted.addVertex(1);
        myGraphDirectedWeighted.addVertex(2);
        myGraphDirectedWeighted.addVertex(3);
        myGraphDirectedWeighted.addVertex(4);

        myGraphDirectedWeighted.addEdge(0, 1, 99);
        myGraphDirectedWeighted.addEdge(0, 2, 50);
        myGraphDirectedWeighted.addEdge(1, 2, 50);
        myGraphDirectedWeighted.addEdge(1, 3, 50);
        myGraphDirectedWeighted.addEdge(2, 3, 99);
        myGraphDirectedWeighted.addEdge(3, 4, 75);
        myGraphDirectedWeighted.addEdge(1, 4, 50);

        myGraphDirectedWeighted.printGraph(MyGraphUndirectedUnweighted.GRAPH_TYPE_ADJACENCY_LIST);
        myGraphDirectedWeighted.printGraph(MyGraphUndirectedUnweighted.GRAPH_TYPE_EDGE_LIST);
    }
}
