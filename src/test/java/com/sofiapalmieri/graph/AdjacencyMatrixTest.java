package com.sofiapalmieri.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class AdjacencyMatrixTest<N, E> {

    DirectedEdge<E, N> edge1 = new DirectedEdge<E, N>();

    DirectedEdge<E, N> edge2 = new DirectedEdge<E, N>();

    DirectedEdge<E, N> edge3 = new DirectedEdge<>();
    Node<N, E> node1 = new Node<N, E>();
    Node<N, E> node2 = new Node<N, E>();
    Graph<N, E> graph1 = new DirectedGraph<>();

    @BeforeEach
    public void initializer(){
        node1.addEdge(edge1);
        node1.addEdge(edge2);
        node1.addEdge(edge3);
        edge1.setNodeA(node1);
        edge1.setNodeB(node2);
        edge2.setNodeA(node2);
        edge2.setNodeB(node1);
        edge3.setNodeA(node1);
        edge3.setNodeB(node2);
        graph1.addNode(node1);
        graph1.addNode(node2);
    }

    /*   1   2
    * 1  0   1
    * 2  1   1
    * */

    @Test
    public void adjacencyMatrixTest(){
        Assert.assertTrue(graph1.getAdjacencyMatrix()[0][1]);
    }
}
