package com.company;

import com.company.graph.MyGraphUndirectedUnweighted;
import com.company.graph.MyGraphUndirectedWeighted;

public class Main {

    public static void main(String[] args) {

        MyGraphUndirectedWeighted myGraphUndirectedWeighted = new MyGraphUndirectedWeighted();

        myGraphUndirectedWeighted.addVertex(0);
        myGraphUndirectedWeighted.addVertex(1);
        myGraphUndirectedWeighted.addVertex(2);
        myGraphUndirectedWeighted.addVertex(3);
        myGraphUndirectedWeighted.addVertex(4);

        myGraphUndirectedWeighted.addEdge(0, 1, 2);
        myGraphUndirectedWeighted.addEdge(0, 2, 2);
        myGraphUndirectedWeighted.addEdge(0, 4, 1);
        myGraphUndirectedWeighted.addEdge(2, 4, 3);
        myGraphUndirectedWeighted.addEdge(3, 4, 2);

        myGraphUndirectedWeighted.printGraph(MyGraphUndirectedUnweighted.GRAPH_TYPE_ADJACENCY_LIST);
        myGraphUndirectedWeighted.printGraph(MyGraphUndirectedUnweighted.GRAPH_TYPE_EDGE_LIST);
    }
}
