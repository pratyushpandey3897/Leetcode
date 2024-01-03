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
    public List<List<Integer>> verticalOrder(TreeNode root) {

List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();

        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();

        int column = 0;
        q.offer(new Pair(root, column));
        while (!q.isEmpty()){
            Pair<TreeNode, Integer> p  = q.poll();
            TreeNode node = p.getKey();
            Integer col = p.getValue();
            if (node != null) {
                map.computeIfAbsent(col, k ->new ArrayList<Integer>()).add(node.val);
           
                q.offer(new Pair(node.left, col -1 ));
                q.offer(new Pair(node.right, col +1 ));
            }
        }

        for (Map.Entry< Integer, ArrayList<Integer> >k : map.entrySet()){
            ans.add(k.getValue());
        }
        return ans;
        
    }
}