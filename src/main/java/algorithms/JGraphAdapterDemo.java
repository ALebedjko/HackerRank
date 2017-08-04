package algorithms;

import org.jgraph.JGraph;
import org.jgraph.graph.DefaultGraphCell;
import org.jgraph.graph.GraphConstants;
import org.jgrapht.ext.JGraphModelAdapter;
import org.jgrapht.graph.ListenableUndirectedWeightedGraph;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;
import java.util.Map;

/**
 * A demo applet that shows how to use JGraph to visualize JGraphT graphs.
 *
 * @author Barak Naveh
 * @since Aug 3, 2003
 */
public class JGraphAdapterDemo extends JApplet {
    private static final Color DEFAULT_BG_COLOR = Color.decode("#FAFBFF");
    private static final Dimension DEFAULT_SIZE = new Dimension(640, 480);

    //
    private JGraphModelAdapter m_jgAdapter;

    /**
     * @see java.applet.Applet#init().
     */
    @Override
    public void init() {
        // create a JGraphT graph
        ListenableUndirectedWeightedGraph<String, MyWeightedEdge> graphInterface =
                new ListenableUndirectedWeightedGraph(MyWeightedEdge.class);

        // create a visualization using JGraph, via an adapter
        m_jgAdapter = new JGraphModelAdapter(graphInterface);

        JGraph jgraph = new JGraph(m_jgAdapter);

        adjustDisplaySettings(jgraph);
        getContentPane().add(jgraph);
        resize(DEFAULT_SIZE);

        // add some sample data (graph manipulated via JGraphT)
        String firstVertex = "v1";
        String secondVertex = "v2";
        String thirdVertex = "v3";
        String fourthVertex = "v4";
        String fifthVertex = "v5";

        graphInterface.addVertex(firstVertex);
        graphInterface.addVertex(secondVertex);
        graphInterface.addVertex(thirdVertex);
        graphInterface.addVertex(fourthVertex);
        graphInterface.addVertex(fifthVertex);

        MyWeightedEdge v2_v3_Edge = graphInterface.addEdge(secondVertex, thirdVertex);
        MyWeightedEdge v3_v1_Edge = graphInterface.addEdge(thirdVertex, firstVertex);
        MyWeightedEdge v4_v3_Edge = graphInterface.addEdge(fourthVertex, thirdVertex);
        MyWeightedEdge v4_v5_Edge = graphInterface.addEdge(fourthVertex, fifthVertex);

        graphInterface.setEdgeWeight(v2_v3_Edge, 3.0);
        graphInterface.setEdgeWeight(v3_v1_Edge, 5.0);
        graphInterface.setEdgeWeight(v4_v3_Edge, 2.0);
        graphInterface.setEdgeWeight(v4_v5_Edge, 7.0);

        // position vertices nicely within JGraph component
        positionVertexAt(firstVertex, 130, 40);
        positionVertexAt(secondVertex, 60, 200);
        positionVertexAt(thirdVertex, 310, 230);
        positionVertexAt(fourthVertex, 380, 70);
        positionVertexAt(fifthVertex, 400, 150);

        // that's all there is to it!...
    }


    private void adjustDisplaySettings(JGraph jg) {
        jg.setPreferredSize(DEFAULT_SIZE);

        Color c = DEFAULT_BG_COLOR;
        String colorStr = null;

        try {
            colorStr = getParameter("bgcolor");
        } catch (Exception e) {
        }

        if (colorStr != null) {
            c = Color.decode(colorStr);
        }

        jg.setBackground(c);
    }


    private void positionVertexAt(Object vertex, int x, int y) {
        DefaultGraphCell cell = m_jgAdapter.getVertexCell(vertex);
        Map attr = cell.getAttributes();
        Rectangle2D b = GraphConstants.getBounds(attr);

        GraphConstants.setBounds(attr, new Rectangle(x, y, (int) b.getWidth(), (int) b.getHeight()));

        Map cellAttr = new HashMap();
        cellAttr.put(cell, attr);
        m_jgAdapter.edit(cellAttr, null, null, null);
    }
}