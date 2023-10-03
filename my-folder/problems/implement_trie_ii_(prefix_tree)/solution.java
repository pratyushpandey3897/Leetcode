class Trie {

    Node root;

    class Node{
        int count;
        int wordsendcount;
        Node [] children;
        Node(){
            children = new Node[26];
            count = 0;
            wordsendcount = 0;
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
            x.count++;
        }
        x.wordsendcount++;
    }
    
    public int countWordsEqualTo(String word) {
        Node x = root;
        for (int i =0; i <word.length(); i++){
            char ch = word.charAt(i);
            if (x.children[ch-'a'] != null){
                x = x.children[ch-'a'];
            } else return 0;
        }

        return x.wordsendcount;
    }
    
    public int countWordsStartingWith(String prefix) {
        Node x = root;
        for (int i =0; i <prefix.length(); i++){
            char ch = prefix.charAt(i);
            if (x.children[ch-'a'] != null){
                x = x.children[ch-'a'];
            } else return 0;
        }


        // till x we got the prefix, now we have to count the words.

        return x.count;
    }
    
    public void erase(String word) {
        Node x = root;
        for (int i =0; i <word.length(); i++){
            char ch = word.charAt(i);
            if (x.children[ch-'a'] != null){
                x.children[ch-'a'].count--;
                x = x.children[ch-'a'];
            } else return;
        }
        x.wordsendcount--;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * int param_2 = obj.countWordsEqualTo(word);
 * int param_3 = obj.countWordsStartingWith(prefix);
 * obj.erase(word);
 */