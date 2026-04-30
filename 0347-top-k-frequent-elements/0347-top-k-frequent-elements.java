class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i =0; i<nums.length; i++){
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        List <Map.Entry<Integer, Integer>> entries = new ArrayList<>(hashMap.entrySet());
        entries.sort((a,b)-> b.getValue() - a.getValue());
        for (int i =0; i<k; i++){
            result[i] = entries.get(i).getKey();
        }
        return result;
    }
}