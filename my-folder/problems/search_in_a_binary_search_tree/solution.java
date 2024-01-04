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
    public TreeNode searchBST(TreeNode root, int val) {

        return bfs(root, val);
        
    }

    public TreeNode bfs (TreeNode node, int val){

        if (node == null)
            return null;

        if (node.val == val)
            return node;
        if (val > node.val)
            return bfs(node.right, val);
        else if (val <node.val)
            return bfs(node.left, val);

        return null;
    }
}