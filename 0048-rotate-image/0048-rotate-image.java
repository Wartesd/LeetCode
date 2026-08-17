class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 1) return;

        int [][] transposedMatrix = new int[matrix.length][matrix[0].length];
        int j=0;

        for (int i =matrix.length-1;i>=0; i--){
            while (j < matrix.length){
                transposedMatrix[j][i] = matrix[matrix.length-i-1][j++];
            }
            j=0;    
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = transposedMatrix[i]; 
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna