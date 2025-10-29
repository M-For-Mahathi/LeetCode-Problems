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
    public int goodNodes(TreeNode root) {
        return good(root, -1000000);
    }

    public int good(TreeNode root, int mx){
        int ct = 0;
        if (root == null) return 0;

        if (root.val >= mx) ct+=1;

        mx = Math.max(root.val, mx);

        ct += good(root.left, mx);
        ct += good(root.right, mx);

        return ct;
    }
}