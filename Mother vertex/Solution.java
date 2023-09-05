class Solution {
    // Helper method for performing Depth-First Search (DFS)
    private void DFS(ArrayList<ArrayList<Integer>> adj, int v, boolean[] visited) {
        visited[v] = true;
        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                DFS(adj, neighbor, visited);
            }
        }
    }

    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        int motherVertex = -1;

        // Perform DFS on all vertices to find a potential mother vertex
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                DFS(adj, v, visited);
                motherVertex = v; // Update the potential mother vertex
            }
        }

        // Reset visited array for the final check
        Arrays.fill(visited, false);

        // Check if the potential mother vertex covers all vertices
        DFS(adj, motherVertex, visited);

        // If any vertex remains unvisited, there is no mother vertex
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                return -1;
            }
        }

        return motherVertex;
    }
}
