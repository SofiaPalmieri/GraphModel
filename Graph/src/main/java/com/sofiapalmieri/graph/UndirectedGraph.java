package com.sofiapalmieri.graph;

public class UndirectedGraph<N, E> extends Graph<N, E>{

    public Edge<E, N> createEdge(Node<N, E> nodeA, Node<N, E> nodeB, E value){

        return new UndirectedEdge<>(nodeA, nodeB, value);
    }

}
