class Solution {
    public static int dfs(Node root){
        if(root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        return Math.max(left, right)+1;
    }
  public static int maxDepth(Node root) {
      return dfs(root);
  }
}