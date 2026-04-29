class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String, ArrayList<String>> result = new HashMap();
        for (int i =0; i<strs.length;i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            ArrayList<String> list = result.getOrDefault(sorted,new ArrayList<String>());
            list.add(strs[i]);
            result.put(sorted,list);   
        }
        return new ArrayList<>(result.values()); 
    }
}