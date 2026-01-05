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
    Map<Integer, Integer> inordermap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        inordermap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            inordermap.put(inorder[i], i);

        return splittree(preorder, 0, 0, inorder.length - 1);
    }

    public TreeNode splittree(int[] preorder, int rootindex, int left, int right) {
        if (left > right) return null;

        TreeNode root = new TreeNode(preorder[rootindex]);
        int mid = inordermap.get(preorder[rootindex]);

        root.left = splittree(preorder, rootindex + 1, left, mid - 1);
        root.right = splittree(preorder, rootindex + mid - left + 1, mid + 1, right);

        return root;
    }
}