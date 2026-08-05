class Solution {
    public void nextPermutation(int[] nums) {
        int left = nums.length-2;
        while (left >= 0 && nums[left] >= nums[left+1]){
            left--;
        }
        if (left >= 0){
            int right = nums.length-1;
            while (nums[right]<= nums[left]){
                right--;
            }
            changeElements(nums, left, right);
        }
        reverse(nums,left+1,nums.length-1);
    }

    private void changeElements(int[] nums, int i, int j){
        int temp =  nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end){
        while (start < end){
            changeElements(nums,start,end);
            start++;
            end--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna