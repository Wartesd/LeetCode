class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int low = matrix[0][0];
        int high = matrix[matrix.length-1][matrix.length-1];

        while (low < high){
            int mid = low + (high-low)/2;
            int count = countLessOrEqual(matrix, mid);

            if (count < k) low = mid+1;
            else high=mid;
        }

        return low;
    }

    private int countLessOrEqual(int[][] matrix, int mid){
        int count = 0;
        int row = matrix.length-1;
        int col=0;

        while(row >= 0 && col < matrix.length){
            if (matrix[row][col] <= mid){
                count += row+1;
                col++;
            }
            else row--;
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna