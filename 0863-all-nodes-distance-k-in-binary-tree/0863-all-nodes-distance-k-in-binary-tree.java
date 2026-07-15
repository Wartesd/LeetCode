/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();
        Set <TreeNode> visited = new HashSet<>();
        Queue <TreeNode> queue = new ArrayDeque<>();
        List <Integer> kDistanceNodes = new ArrayList<>();
        int currentDistance = 0;

        fillParentMap(parentMap, root);
        queue.offer(target);
        visited.add(target);
        while (!queue.isEmpty()){
            if (currentDistance == k){
                for (TreeNode node : queue){
                    kDistanceNodes.add(node.val);
                }
                return kDistanceNodes;
            }
            int size = queue.size();
            for (int i=0; i< size; i++){
                TreeNode current = queue.poll();
                if (current.left != null && !visited.contains(current.left)){
                    queue.offer(current.left);
                    visited.add(current.left);
                }
                if (current.right != null && !visited.contains(current.right)){
                    queue.offer(current.right);
                    visited.add(current.right);
                }
                if (parentMap.get(current)!=null && !visited.contains(parentMap.get(current))){
                    queue.offer(parentMap.get(current));
                    visited.add(parentMap.get(current));
                }
            }
            currentDistance++;
        }
        return kDistanceNodes;
    }

    private void fillParentMap (Map<TreeNode, TreeNode> parentMap, TreeNode root){
        if (root == null) return ;
        if (root.left != null){
            parentMap.put(root.left, root);
            fillParentMap(parentMap,root.left);
        }
        if (root.right != null){
            parentMap.put(root.right, root);
            fillParentMap(parentMap,root.right);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna