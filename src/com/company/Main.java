package com.company;

import com.company.graph.MyGraphUndirectedUnweighted;

public class Main {

    public static void main(String[] args) {

        MyGraphUndirectedUnweighted myGraphUndirectedUnweighted = new MyGraphUndirectedUnweighted();

        myGraphUndirectedUnweighted.addVertex(2);
        myGraphUndirectedUnweighted.addVertex(4);
        myGraphUndirectedUnweighted.addVertex(6);
        myGraphUndirectedUnweighted.addVertex(8);

        myGraphUndirectedUnweighted.addEdge(2, 4);
        myGraphUndirectedUnweighted.addEdge(4, 8);

        myGraphUndirectedUnweighted.printGraph();
    }
}
