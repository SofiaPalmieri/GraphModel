package com.sofiapalmieri.graph;

public class UndirectedEdge<E, N> extends Edge<E, N> {

    public UndirectedEdge(Node<N, E> nodeA, Node<N, E> nodeB, E value) {
        super(nodeA, nodeB, value);
    }

    public UndirectedEdge(Node<N, E> nodeA, Node<N, E> nodeB) {
        super(nodeA, nodeB);
    }

    public UndirectedEdge() {

    }

    @Override
    public boolean isPointingTo(Node<N, E> node){
        return nodeA.equals(node) || nodeB.equals(node);
    }

}


