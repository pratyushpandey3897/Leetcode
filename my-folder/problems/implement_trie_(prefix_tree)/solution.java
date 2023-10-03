class Trie {

    Node root;

    class Node{
        boolean isEnd;
        Node [] children;
        Node(){
            children = new Node[26];
            isEnd = false;
        }

    }

    public Trie() {
        
        root = new Node();
    }
    
    public void insert(String word) {
        
        Node x = root;
        for (int i =0; i<word.length(); i++){
            char ch = word.charAt(i);
            if (x.children[ch-'a']== null){
                x.children[ch-'a'] = new Node();
            }
            x = x.children[ch-'a'];

        }
        x.isEnd = true;
    }
    
    public boolean search(String word) {

        Node x = root;
        for (int i =0; i <word.length(); i++){
            char ch = word.charAt(i);
            if (x.children[ch-'a'] != null){
                x = x.children[ch-'a'];
            } else return false;
        }
        if (x.isEnd == true)
            return true;
        return false;
        
    }
    
    public boolean startsWith(String prefix) {
        Node x = root;
        for (int i =0; i <prefix.length(); i++){
            char ch = prefix.charAt(i);
            if (x.children[ch-'a'] == null)
                return false;
            x = x.children[ch-'a'];
        }
        
        return true;
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */