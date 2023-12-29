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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        List<TreeNode> ans  = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        Set<Integer> toDel = new HashSet<>();
   for (int v : to_delete) {
       toDel.add(v);
   }

    delNode(root, toDel, ans);
    if (!toDel.contains(root.val))
        ans.add(root);
    return ans;
    }

    public TreeNode delNode(TreeNode node, Set<Integer> toDel, List<TreeNode> ans ){

        if (node == null)
            return null;

        node.left = delNode(node.left, toDel, ans);

        node.right = delNode(node.right, toDel, ans);

        if (toDel.contains(node.val)){
            if (node.left!=null)
                ans.add(node.left);
            if (node.right != null)
                ans.add(node.right);

            return null;
        }

        return node;

    }
}