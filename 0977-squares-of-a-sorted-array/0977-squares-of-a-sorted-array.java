class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] squaredNums = new int[nums.length] ;
        int currentIndex = squaredNums.length-1;
        while (currentIndex >=0){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right] ;
            if (leftSquare>rightSquare){
                squaredNums[currentIndex] = leftSquare;
                left++; 
            }else{
                squaredNums[currentIndex] = rightSquare;
                right--;
            }
            currentIndex--;
        }
        return squaredNums;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna