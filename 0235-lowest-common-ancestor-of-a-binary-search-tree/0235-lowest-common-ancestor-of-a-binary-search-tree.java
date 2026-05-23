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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val == q.val) return p;
        int minRoot = Math.min(p.val,q.val);
        int maxRoot = Math.max(p.val,q.val);
        while (!(root.val >= minRoot && root.val <= maxRoot)){
            if (root.val > maxRoot)  root = root.left;
            if (root.val < minRoot) root = root.right;
        } 
        return root;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna