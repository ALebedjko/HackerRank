package algorithms;

import org.jgrapht.graph.DefaultWeightedEdge;

public class MyWeightedEdge extends DefaultWeightedEdge {
    @Override
    public String toString() {
        return Double.toString(getWeight());
    }
}
