package com.sofiapalmieri.graph;

import java.util.HashSet;
import java.util.Set;

public abstract class Graph<N, E> {
    protected Set<Node<N, E>> nodes = new HashSet<>();

    public Graph() {

    }

    public boolean[][] getAdjacencyMatrix() {
        boolean[][] matrix = new boolean[nodes.size()][nodes.size()];
        int i = 0, j = 0;
        for (Node<N, E> node1 : nodes) {
            for (Node<N, E> node2 : nodes) {
                matrix[i][j] = node1.isPointingTo(node2);
                j++;
            }
            i++;
        }
        return matrix;
    }

    public void addNode(Node<N, E> node) {
        nodes.add(node);
    }

    public void removeNode(Node<N, E> node) {
        if (nodes.contains(node)) {
            nodes.remove(node);
            node.removeEdges();
        }
    }

    public Edge<E, N> setEdge(Node<N, E> node1, Node<N, E> node2, E value){
        if(nodes.contains(node1) && nodes.contains(node2)){
            Edge<E, N> edge = node1.getEdgeToNode(node2);
            if(edge==null){
                edge = this.createEdge(node1, node2, value);
                node1.addEdge(edge);
                node2.addEdge(edge);

            }else{
                edge.setValue(value);
            }
            return edge;
        }else {
            throw new RuntimeException("Nodes are not present in the graph");
        }

    }

    protected abstract Edge<E, N> createEdge(Node<N, E> nodeA, Node<N, E> nodeB, E value);

}
