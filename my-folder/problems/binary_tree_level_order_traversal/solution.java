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
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new ArrayList<>();
        

        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()){
            
            List<Integer> levels = new ArrayList<>();
            int levLen = q.size();
            for (int i= 0; i<levLen; i++){
                TreeNode node = q.remove();
                if (node!=null){
                    levels.add(node.val);
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if (levels.size() != 0)
                res.add(levels);
            
        }
        
        return res;
    }
//     public List<List<Integer>> levelOrder(TreeNode root) {
        
//         List<List<Integer>> lLevels = new ArrayList<>();
        

        
//         int height = maxDepth (root);
        
//         for (int i = 1; i<=height; i++){
//             List<Integer> lElements = new ArrayList<>();
//             addLevelToList (root, i, lElements);
//             lLevels.add(i, lElements);
            
//         }
        
//         return lLevels;
//     }
    
//     public void addLevelToList(TreeNode root, int level, List<Integer> lElements) {
       
        
//         if (root == null)
//             return;
//         else if (level == 1){
//             lElements.add(root.val);
//         }
//         else if (level > 1){
//             addLevelToList(root.left, level-1, lElements);
//             addLevelToList(root.right, level-1, lElements);
//         }
        
//     }
    
//     public static int maxDepth(TreeNode root) {
        
//         if (root == null)
//             return 0;

//         else {
//             int lheight = maxDepth(root.left);
//             int rheight = maxDepth(root.right);
            
//             if (lheight > rheight)
//                 return (lheight + 1);
//             else 
//                 return rheight+1;
//         }
//     }
    
    
}