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
    public List<Integer> rightSideView(TreeNode root) {
         if (root == null)
            return (new ArrayList());
        LinkedList<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
       
        q.add(root);
        TreeNode last = root;

        while(!q.isEmpty()){
            TreeNode node = q.remove();

            if (node.left!=null) q.add(node.left);
            if (node.right != null) q.add(node.right);

            if (last == node){
                res.add(node.val);
                last = q.peekLast();
            }

        }

        return res;
        
    }
}