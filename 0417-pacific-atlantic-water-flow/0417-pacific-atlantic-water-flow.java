class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacific = new boolean [heights.length][heights[0].length];
        boolean[][] atlantic = new boolean [heights.length][heights[0].length];
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<heights.length; i++){
            dfs(heights,i,0,pacific,heights[i][0]);
            dfs(heights,i,heights[0].length -1, atlantic ,heights[i][heights[0].length -1]);
        }
        for (int j =0; j<heights[0].length ; j++){
            dfs(heights, 0, j, pacific, heights[0][j]);
            dfs(heights, heights.length-1 , j, atlantic, heights[heights.length-1][j]);
        }
        for (int i=0; i<heights.length; i++){
            for (int j =0; j<heights[0].length; j++){
                if (pacific[i][j]==true && atlantic[i][j] == true){
                    result.add(Arrays.asList(i,j));
                }
            }
        }
        return result;
    }
    private void dfs (int [][] heights, int i, int j, boolean[][] visited, int current){ 
        if (i<0 ||j<0|| i>= heights.length|| j>=heights[0].length 
        ||visited [i][j]== true|| heights[i][j] < current) return;
        visited[i][j] = true;
        current = heights[i][j];
        dfs(heights, i+1,j, visited, current);
        dfs(heights, i-1,j, visited, current);
        dfs(heights, i,j+1, visited, current);
        dfs(heights, i,j-1, visited, current);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna