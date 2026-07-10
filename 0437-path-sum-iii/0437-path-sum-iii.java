/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        return countPath (root, targetSum) + pathSum (root.left, targetSum) 
        + pathSum (root.right, targetSum) ;
    }

    private int countPath(TreeNode node, long remaining){
        int result = 0;
        if (node == null) return result;
        remaining-=node.val;
        if (remaining == 0) result++;
        result += countPath(node.left, remaining);
        result+=countPath(node.right, remaining);
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna