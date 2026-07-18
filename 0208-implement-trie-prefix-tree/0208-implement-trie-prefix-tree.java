class Trie {
    private class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isWord = false;
    }
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode current = navigate(word,true);
        current.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode currentNode = navigate(word ,false);
        return currentNode != null && currentNode.isWord;
    }
    
    public boolean startsWith(String prefix) {
        return navigate(prefix,false) != null ;
    }
    
    private TrieNode navigate(String str, boolean createIfAbsent){
        TrieNode current = root;
        for (char c : str.toCharArray()){
            int index = c-'a';
            TrieNode nextNode = current.children[index];
            if (nextNode == null){
                if (createIfAbsent){
                    current.children[index] = new TrieNode();
                    nextNode = current.children[index];
                }else return null;
            }
            current = nextNode;
        }
        return current;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna