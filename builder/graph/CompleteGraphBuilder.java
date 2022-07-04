package builder.graph;

public class CompleteGraphBuilder {

    public final static int DEFAULT_EDGES = 3;

    private int edges = DEFAULT_EDGES;

    public CompleteGraphBuilder increment() {
        edges++;
        return this;
    }

    public CompleteGraph build() {
        CompleteGraph graph = new CompleteGraph(edges);
        edges = DEFAULT_EDGES;
        return graph;
    }

}
