class Solution {

  //Function to sort a linked list of 0s, 1s and 2s.
  static Node segregate(Node head) {
    // add your code here
    int arr[] = new int[3];
    Node curr = head;
    while (curr != null) {
      arr[curr.data]++;
      curr = curr.next;
    }
    curr = head;
    for (int i = 0; i < arr[0]; i++) {
      curr.data = 0;
      curr = curr.next;
    }
    for (int i = 0; i < arr[1]; i++) {
      curr.data = 1;
      curr = curr.next;
    }
    for (int i = 0; i < arr[2]; i++) {
      curr.data = 2;
      curr = curr.next;
    }
    return head;
  }
}
