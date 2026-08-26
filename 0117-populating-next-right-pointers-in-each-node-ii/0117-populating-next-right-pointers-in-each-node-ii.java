class Solution {
    public Node connect(Node root) {
        if (root == null) return null;

        Node curr = root; 

        while (curr != null) {
            Node dummy = new Node(0); 
            Node last = dummy;      

            while (curr != null) {
                last = processChild(curr.left, last);
                last = processChild(curr.right, last);
                curr=curr.next;
            }
            curr = dummy.next;
        }

        return root;
    }

    private Node processChild(Node child, Node last) {
        if (child != null){
            last.next = child;
            last = child;
        }
        return last;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna