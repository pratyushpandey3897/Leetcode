/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            int levLen = q.size();
            
            List<Integer> levels = new ArrayList<>();

            for (int i= 0; i<levLen; i++){
                Node node = q.poll(); 
                // levels.add(node.val);
                if (node!=null){
                    levels.add(node.val);
                
                    for (Node child: node.children){
                        
                        q.add(child);
                    }
                }
            }

            if (levels.size()>0)
                ans.add(levels);
        }

        return ans;
        

    }
}