class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null) return;
        if(head.next==null) return;
        HashSet<Node> h = new HashSet<>();
        Node cur=head;
        h.add(head);
        while(cur.next!=null &&!h.contains(cur.next))
        {
            h.add(cur.next);
            cur=cur.next;
        }
        cur.next=null;
    }
}