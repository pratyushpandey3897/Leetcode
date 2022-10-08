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
    public boolean isValidBST(TreeNode root) {
        
        List<Integer> l = new ArrayList<>();
        addToList(l,root);
        
        for(int i = 1 ; i < l.size(); i++){
            if(l.get(i) <= l.get(i-1))
                return false;
        }
        return true;
        
    }
    
    public void addToList(List<Integer> l, TreeNode root){
        if (root == null)
            return;
        
        addToList(l, root.left);
        
        l.add(root.val);
        
        addToList(l, root.right);
        
        
        
    }
}