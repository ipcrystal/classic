package org.iproute.classic.graph.algorithm;

import org.iproute.classic.graph.define.Graph;

/**
 * BellmanFold 负权图的最短路径
 *
 * @author winterfell
 * @since 2022/6/25
 */
public class BellmanFold {

    private Graph<String, Double> g;

    public BellmanFold(Graph<String, Double> g) {
        this.g = g;
    }

    private void init() {
    }

}
