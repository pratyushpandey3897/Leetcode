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
    public long kthLargestLevelSum(TreeNode root, int p) {

        Queue<TreeNode> q = new LinkedList<>();
        List<Long> l = new ArrayList<>();
        int level = 0;
        int answer = 0;
        int maxSum = Integer.MIN_VALUE;

        q.offer(root);

        while (!q.isEmpty()){
            level++;

            int k = q.size(); // nodes in a level
            long sum = 0;
            for (int i =0; i<k; i++){
                TreeNode ele = q.poll();
                sum+= ele.val;
                if (ele.left != null) q.offer(ele.left);
                if (ele.right != null) q.offer(ele.right);
            }

            l.add(sum);
            
        }
        if (p > l.size())
            return -1;
        
        Collections.sort(l, Collections.reverseOrder());
        return l.get(p-1);
        
    }
}