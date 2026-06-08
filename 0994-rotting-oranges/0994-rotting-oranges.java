class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new ArrayDeque<>();
        int freshOranges = 0;
        int minutes = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) freshOranges++;
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        if (freshOranges == 0) return minutes;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] orange = queue.poll();
                for (int[] dir : directions) {
                    int nextRow = orange[0] + dir[0];
                    int nextCol = orange[1] + dir[1];
                    if (nextRow >= 0 && nextRow < grid.length && nextCol >= 0 && nextCol < grid[0].length && grid[nextRow][nextCol] == 1) {
                        grid[nextRow][nextCol] = 2;
                        freshOranges--;
                        queue.offer(new int[]{nextRow, nextCol});
                    }   
                } 
            }
            if (!queue.isEmpty()) {
                minutes++;
            }
        } 
        
        return freshOranges > 0 ? -1 : minutes; 
    }
} 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna