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
    public List<Integer> largestValues(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> q1 = new LinkedList<>();
        if (root!= null)
            q1.add(root);
        // ans.add(root.val);

        while (!q1.isEmpty()){
            int len = q1.size();
            int max = Integer.MIN_VALUE;
            for (int i =0 ; i< len ; i++){

                TreeNode ele = q1.poll();
                max = Math.max(max, ele.val);
                if (ele.right != null)
                    q1.add(ele.right);
                if (ele.left != null)
                    q1.add(ele.left);
            }
            ans.add(max);
        }

        
        

        return ans;
    }
}