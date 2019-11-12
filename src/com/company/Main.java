package com.company;

import com.company.graph.MyGraphDirectedUnweighted;
import com.company.graph.MyGraphUndirectedUnweighted;

public class Main {

    public static void main(String[] args) {

        MyGraphDirectedUnweighted myGraphDirectedUnweighted = new MyGraphDirectedUnweighted();

        myGraphDirectedUnweighted.addVertex(0);
        myGraphDirectedUnweighted.addVertex(1);
        myGraphDirectedUnweighted.addVertex(2);
        myGraphDirectedUnweighted.addVertex(3);
        myGraphDirectedUnweighted.addVertex(4);
        myGraphDirectedUnweighted.addVertex(5);

        myGraphDirectedUnweighted.addEdge(0, 1);
        myGraphDirectedUnweighted.addEdge(0, 2);
        myGraphDirectedUnweighted.addEdge(1, 2);
        myGraphDirectedUnweighted.addEdge(1, 3);
        myGraphDirectedUnweighted.addEdge(2, 3);
        myGraphDirectedUnweighted.addEdge(3, 4);
        myGraphDirectedUnweighted.addEdge(2, 5);

        myGraphDirectedUnweighted.printGraph(MyGraphUndirectedUnweighted.GRAPH_TYPE_ADJACENCY_LIST);
        myGraphDirectedUnweighted.printGraph(MyGraphUndirectedUnweighted.GRAPH_TYPE_EDGE_LIST);
    }
}
