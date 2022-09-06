/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    int depth = 1;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(dfs(root.left, depth), dfs(root.right, depth));
    }

    public int dfs(TreeNode node, int depth) {
        if (node == null) {
            return depth;
        }

        depth++;
        return Math.max(dfs(node.left, depth), dfs(node.right, depth));

    }
}