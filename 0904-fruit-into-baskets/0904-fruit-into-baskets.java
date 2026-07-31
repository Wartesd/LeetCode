class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int maxCountFruit =0;
        Map <Integer, Integer> basket = new HashMap<>();
        for (int right=0; right<fruits.length; right++){
            basket.put(fruits[right], basket.getOrDefault(fruits[right],0)+1);
            while (basket.size()>2){
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit)-1);
                if (basket.get(leftFruit) == 0) basket.remove(leftFruit);
                left++;
            }
            maxCountFruit = Math.max(maxCountFruit, right - left+1);
        }
        return maxCountFruit;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna