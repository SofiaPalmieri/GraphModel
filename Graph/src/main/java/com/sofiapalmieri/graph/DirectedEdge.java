package com.sofiapalmieri.graph;

import java.util.ArrayList;
import java.util.List;

public class DirectedEdge<E, N> extends Edge<E, N> {

    public DirectedEdge(Node<N, E> fromNode, Node<N, E> toNode, E value){
        super(fromNode, toNode, value);
    }

    public DirectedEdge(Node<N, E> fromNode, Node<N, E> toNode){
        super(fromNode, toNode);
    }


    @Override
    public boolean isPointingTo(Node<N, E> node){
        return nodeB.equals(node);
    }

}
