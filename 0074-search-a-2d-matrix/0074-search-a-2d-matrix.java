class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (matrix[mid / cols][mid % cols] > target) {
                right = mid - 1;
            } else if (matrix[mid / cols][mid % cols] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}