package builder.graph;

public class CompleteGraph {

    private int vertexCount;

    public CompleteGraph(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    public void print() {
        int edgeCount = vertexCount * (vertexCount - 1) / 2;
        System.out.printf("Vertex: %d, Edges: %d\n", vertexCount, edgeCount);
    }

}
