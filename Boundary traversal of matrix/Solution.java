class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> al = new ArrayList<>();

        if (n == 0 || m == 0) {
            return al; // Empty matrix, return an empty list
        }

        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        
            // Traverse the top row
            for (int i = left; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;

            // Traverse the rightmost column
            if (left <= right) {
                for (int i = top; i <= bottom; i++) {
                    al.add(matrix[i][right]);
                }
                right--;
            }

            // Traverse the bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Traverse the leftmost column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }

        return al;
    }
}