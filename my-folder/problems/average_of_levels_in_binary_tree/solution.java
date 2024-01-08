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
    public List<Double> averageOfLevels(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        List<Double> ans = new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()){
            int s = q.size();
            double sum = 0;
            Queue<TreeNode> level = new LinkedList<>();
            while (!q.isEmpty()){
                TreeNode curnode = q.poll();
                sum+= curnode.val;
                if (curnode.left!=null) level.add(curnode.left);
                if (curnode.right!=null) level.add(curnode.right);
            }

            ans.add((double) sum/s);
            q = level;
        }
        return ans;
    }
}