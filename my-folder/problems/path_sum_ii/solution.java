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

    private List<List<Integer>> resultList = new ArrayList<List<Integer>>();

    public void dfs(TreeNode node, int sum, Stack<Integer> path ) {

        if (node == null)
            return;
        path.push(node.val);

        if (node.left == null && node.right == null){
            if (sum == node.val)
                resultList.add(new ArrayList<Integer>(path));
        }
        if (node.left != null)
            dfs(node.left, sum-node.val, path);
        if (node.right != null)
            dfs(node.right, sum-node.val, path);

        path.pop();
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {


        if (root == null)
            return resultList;

        Stack path = new Stack();

        dfs(root, targetSum, path);
        return resultList;
        
        
        
    }
}