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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null)
            return false;
        
           
        else{
            if (isSameTreeNode(root, subRoot))
                return true;
            else
                return (isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)); 
        }
        
    }
    
    public boolean isSameTreeNode(TreeNode r, TreeNode s){
        
        if (r == null && s == null)
            return true;
        if (r !=null && s == null || r ==null && s!= null || r.val != s.val)
            return false;
        else
            return isSameTreeNode(r.left, s.left) && isSameTreeNode(r.right, s.right);
        
            
    }
}