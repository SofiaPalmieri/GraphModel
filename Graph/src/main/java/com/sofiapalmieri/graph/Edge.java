package com.sofiapalmieri.graph;

import lombok.Getter;
import lombok.Setter;

public abstract class Edge <E, N>{

    @Getter
    @Setter
    protected Node<N, E> nodeA;
    @Getter
    @Setter
    protected Node<N, E> nodeB;
    @Getter
    @Setter
    protected E value;

    public Edge(Node<N, E> nodeA, Node<N, E> nodeB, E value) {
        this(nodeA, nodeB);
        this.value = value;
    }

    public Edge(Node<N, E> nodeA, Node<N, E> nodeB) {
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public abstract boolean isPointingTo(Node<N, E> node);

}
