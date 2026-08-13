class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (prerequisites.length==0) return true;

        Map <Integer, List<Integer>> numCoursesGraph = new HashMap<>();
        Set <Integer> visited = new HashSet<>();
        Set <Integer> inProgress = new HashSet<>();

        arrayToGraph(prerequisites, numCoursesGraph);

        for (int course=0; course < numCourses; course++){
            if(dfs(course, numCoursesGraph, visited,inProgress)== false) return false;
        }
        return true;
    }

    private void arrayToGraph(int[][] prerequisites, Map <Integer, List<Integer>> numCoursesGraph){
        for (int i =0; i<prerequisites.length; i++){
            numCoursesGraph.computeIfAbsent(prerequisites[i][1], k -> new ArrayList()).add(prerequisites[i][0]);
        }
    }

    private boolean dfs(int course,Map <Integer, List<Integer>> numCoursesGraph,Set <Integer> visited, Set <Integer> inProgress ){
        if (visited.contains(course)) return true;
        if (inProgress.contains(course)) return false;

        inProgress.add(course);
        for (int neighbour : numCoursesGraph.getOrDefault(course, new ArrayList<>())){
            if(dfs(neighbour, numCoursesGraph, visited,inProgress)== false) return false;
        }
        inProgress.remove(course);
        visited.add(course);

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna