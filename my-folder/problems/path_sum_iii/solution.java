

import com.sun.source.tree.Tree;

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
    HashMap<Long, Integer> map;
    int counter;
    int target;
    public int pathSum(TreeNode root, int targetSum) {
        target = targetSum;
        counter = 0;
        map = new HashMap<>();
        preorder(root, 0L);
        return counter;
    }

    public void preorder(TreeNode node, long psum){

        if (node == null)
            return ;
        psum += node.val;

        if (psum == target)
            counter++;

        counter += map.getOrDefault(psum-target, 0);
        map.put(psum, map.getOrDefault(psum, 0)+1);

        preorder(node.left, psum);
        preorder(node.right, psum);

        map.put(psum, map.getOrDefault(psum, 1)-1);
    }
}