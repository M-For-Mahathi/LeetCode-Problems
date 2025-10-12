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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        collectPaths(root, "", paths);
        return paths;
    }

    public static void collectPaths(TreeNode node, String path, List<String> paths){
        if (node == null) return;

        if (path.isEmpty()) path = String.valueOf(node.val);
        else path += "->" + node.val;

        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }

        collectPaths(node.left, path, paths);
        collectPaths(node.right, path, paths);
    }
}