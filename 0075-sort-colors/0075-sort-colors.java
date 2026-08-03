class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while (mid<=high){
            int current = nums[mid];
            if (current == 0 || current == 1){
                if (current == 0){
                    nums[mid] = nums[low];
                    nums[low] = current;
                    low++;
                }
              mid++;  
            }    
            else{
                nums[mid] = nums[high];
                nums[high] = current;
                high--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna