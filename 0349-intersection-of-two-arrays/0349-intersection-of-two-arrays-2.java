class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> intersections = new ArrayList<>();

        for (int n : nums1) set.add(n);

        for (int n : nums2){
            if (set.contains(n) && !intersections.contains(n)) intersections.add(n);
        } 

        return intersections.stream().mapToInt(Integer::intValue).toArray();
    }
}
