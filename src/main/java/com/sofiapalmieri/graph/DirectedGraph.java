package com.sofiapalmieri.graph;

public class DirectedGraph<N, E> extends Graph<N, E>{

    public Edge<E, N> createEdge(Node<N, E> nodeA, Node<N, E> nodeB, E value){
        return new DirectedEdge<E, N>(nodeA, nodeB, value);
    }

}
