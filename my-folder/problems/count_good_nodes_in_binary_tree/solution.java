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
    int count = 0;
    public int goodNodes(TreeNode root) {
        
        
        trav(root, Integer.MIN_VALUE);

        return count;
       
    }

    public void trav(TreeNode node, int maxtillnow){
        if (node == null)
            return ;
        if (maxtillnow<= node.val){
            count++;
            maxtillnow = node.val;
        }
            
        
        trav(node.left, maxtillnow);
        trav(node.right, maxtillnow);
    }
}