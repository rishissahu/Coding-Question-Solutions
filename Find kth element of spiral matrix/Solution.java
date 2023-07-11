class Solution {

  /*You are required to complete this method*/
  int findK(int arr[][], int n, int m, int k) {
    // Your code here
    int top = 0, left = 0, right = m - 1, down = n - 1;
    int c = 0;

    while (true) {
      for (int i = left; i <= right; i++) {
        c++;
        if (c == k) return arr[top][i];
      }
      top++;
      for (int i = top; i <= down; i++) {
        c++;
        if (c == k) return arr[i][right];
      }
      right--;
      for (int i = right; i >= left; i--) {
        c++;
        if (c == k) return arr[down][i];
      }
      down--;
      for (int i = down; i >= top; i--) {
        c++;
        if (c == k) return arr[i][left];
      }
      left++;
    }
  }
}
