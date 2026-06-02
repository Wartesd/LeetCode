class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> path = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < edges.length; i++) {
            path.computeIfAbsent(edges[i][0], k -> new ArrayList<>()).add(edges[i][1]);
            path.computeIfAbsent(edges[i][1], k -> new ArrayList<>()).add(edges[i][0]);
        }
        return dfs (source,destination, path, visited);
    }

    public boolean dfs (int source, int destination, Map <Integer, List<Integer>> path, Set<Integer> visited){
        int current = source;
        if (source == destination) return true;
        if (visited.contains(source)) return false;
        visited.add(source);
        for (int neighbor: path.get(source)){
            if (dfs (neighbor, destination, path, visited)) return true;
        }  
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna