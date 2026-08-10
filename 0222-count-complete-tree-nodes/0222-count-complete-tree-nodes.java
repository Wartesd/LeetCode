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
    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = getHeight(root, true);
        int rightHeight = getHeight(root, false);
        
        if (leftHeight == rightHeight) return (1 << leftHeight) -1;
        
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    private int getHeight(TreeNode root,boolean isLeft){
        int height = 0;
        while (root != null){
            height++;
            root = isLeft ? root.left : root.right;
        }
        return height;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna