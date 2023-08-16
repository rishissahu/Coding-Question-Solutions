class Solution {
    // Function to return the diameter of a Binary Tree.
    int result=0;
    int height(Node root){
        if(root==null){
            return 0;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        result= Math.max(result,1+ lh+rh);
        return 1+ Math.max(lh, rh);
    }
    int diameter(Node root) {
        // Your code here
        height(root);
        return result;
    }
}