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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if (root == null)
            return l;
        postorder(root, l);
        
        return l;
    }
    
    public static void postorder(TreeNode root, List<Integer> l) {
        
        if (root.left != null)
            postorder(root.left, l);
            
        if (root.right != null )
            postorder(root.right, l);
        
        
        if (root != null)
            l.add(root.val);
     
    }
}