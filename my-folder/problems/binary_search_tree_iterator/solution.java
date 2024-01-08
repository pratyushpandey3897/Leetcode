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
class BSTIterator {

    ArrayList<TreeNode> flattree;
    int idx;
    public BSTIterator(TreeNode root) {
        flattree = new ArrayList<>();
        idx = -1; 
        inorder(root);
    }

    public void inorder (TreeNode root){
        if (root == null)
            return;
        inorder(root.left);
        flattree.add(root);
        inorder(root.right);
    }
    
    public int next() {
        
        return (flattree.get(++idx).val);
        


    }
    
    public boolean hasNext() {
        

        return idx+1<flattree.size();
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */