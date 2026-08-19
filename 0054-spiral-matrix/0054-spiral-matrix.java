class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
        List<Integer> spiralList = new ArrayList<>();
        int current = 1;
        int i = 0;
        int j =0;
        int dirIndex=0;
        int visited = 101;

        for (int step=0; step < (matrix.length * matrix[0].length); step++){
            spiralList.add(matrix[i][j]);
            matrix[i][j] = visited;

            int nextI = i + directions[dirIndex][0];
            int nextJ = j + directions[dirIndex][1];

            if (nextI < 0 || nextI >=  matrix.length|| nextJ<0 || nextJ >= matrix[0].length || matrix[nextI][nextJ] == visited){
                dirIndex = (dirIndex+1)%4;
                nextI = i + directions[dirIndex][0];
                nextJ = j + directions[dirIndex][1];
            }
            i = nextI;
            j = nextJ;
        }
        return spiralList;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna