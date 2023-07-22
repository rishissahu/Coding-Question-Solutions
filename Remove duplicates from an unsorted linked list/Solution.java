class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        // Your code here
        Node curr = head;
        Node prev = null;
        
        HashSet<Integer> h = new HashSet<Integer>();
        while (curr != null) {
            if (h.contains(curr.data)) {
                // Duplicate found, skip the node
                prev.next = curr.next;
            } else {
                h.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        return head;
    }
}