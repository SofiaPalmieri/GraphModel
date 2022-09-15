package com.sofiapalmieri.graph;

import lombok.Getter;
import lombok.Setter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Node <N, E>{
    protected Set<Edge<E, N>> edges;

    @Getter
    @Setter
    protected N value;


    public Node(N value){
        this.edges = new HashSet<>();
        this.value = value;
    }

    public Set<Edge<E, N>> getEdges(){
        return Collections.unmodifiableSet(edges);
    }

    public void addEdge(Edge<E, N> edge){
        this.edges.add(edge);
    }

    public boolean removeEdge(Edge<E, N> edge){
      return this.edges.remove(edge);
    }

    public boolean isPointingTo(Node<N, E> node){
      return edges.stream().anyMatch(e -> e.isPointingTo(node));
    }

    public Edge<E, N> getEdgeToNode(Node<N, E> node){
        Optional<Edge<E, N>> first = edges.stream().filter(e -> e.isPointingTo(node)).findFirst();
        return first.orElse(null);
    }

    public void removeEdges(){
        Set<Edge<E, N>> currentEdges = edges;
        edges.stream().filter(e -> this.equals(e.nodeA)).forEach(e -> e.setNodeA(null));
        edges.stream().filter(e -> this.equals(e.nodeB)).forEach(e -> e.setNodeB(null));
        edges.removeAll(currentEdges);
    }

}
