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
    int diff = Integer.MAX_VALUE;
    TreeNode prevNode = null;
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return diff;
        
    }

    public void helper (TreeNode node){

        if (node == null)
        return;

        helper(node.left);

        if (prevNode !=null){
            diff= Math.min(diff, Math.abs(prevNode.val - node.val));
        }
        prevNode = node;

        helper(node.right);
    }
}