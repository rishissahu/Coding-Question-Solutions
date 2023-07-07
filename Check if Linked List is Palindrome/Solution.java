class Solution
{
    //Function to check whether the list is palindrome.
     boolean isPalindrome(Node head) 
    {
        //Your code here
        if(head == null || head.next == null)
            return true;
       Stack<Integer> s = new Stack<Integer>();
       Node curr = head;
       while(curr != null)
       {
           s.push(curr.data);
           curr = curr.next;
       }
       curr = head;
       while(curr != null)
       {
            if(s.pop() != curr.data)
                return false;
            else
                curr = curr.next;
            
       }
       return true;
       
    }  
}
