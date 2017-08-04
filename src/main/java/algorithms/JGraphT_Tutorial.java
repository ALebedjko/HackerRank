package algorithms;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

public class JGraphT_Tutorial {
    public static void main(String args[]) {
        // constructs a directed graph with the specified vertices and edges
        SimpleDirectedWeightedGraph<String, DefaultWeightedEdge> directedGraph =
                new SimpleDirectedWeightedGraph<String, DefaultWeightedEdge>(DefaultWeightedEdge.class);

        String aVertex = "a";
        String bVertex = "b";

        directedGraph.addVertex(aVertex);
        directedGraph.addVertex(bVertex);
        DefaultWeightedEdge abEdge = directedGraph.addEdge(aVertex, bVertex);
        directedGraph.setEdgeWeight(abEdge, 2.0);

    }
}
