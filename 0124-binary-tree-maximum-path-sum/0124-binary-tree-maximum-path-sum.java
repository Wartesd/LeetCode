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
    long max= Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSumForNode(root);
        return (int) max;
    }
    private int maxSumForNode(TreeNode root){
        long left;
        long right;
        if (root == null) return 0; 
        left = Math.max(0, maxSumForNode(root.left));
        right = Math.max(0, maxSumForNode(root.right));
        max = Math.max(max, left+right + root.val);
        return root.val + (int) Math.max(left,right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna