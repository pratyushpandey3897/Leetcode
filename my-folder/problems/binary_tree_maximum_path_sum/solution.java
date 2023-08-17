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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

        // int ans =root.val;
        dfs(root);
        return ans;
        
    }
    public int dfs(TreeNode root){

        if (root == null){
                return 0;
        }
        
        int leftMax = dfs (root.left);
        int rightMax = dfs (root.right);

        leftMax = Math.max(leftMax, 0);
        rightMax = Math.max(rightMax, 0);

        // with splitting the path between left and right

        ans = Math.max(ans, root.val+leftMax+rightMax);

        // return value will be without splitting

        return (root.val + Math.max(leftMax, rightMax));
    }
}