class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
       int dp[][] = new int[x+1][y+1];
       for(int i=1;i<x+1;i++) {
           for(int j=1;j<y+1;j++) {
               if(s1.charAt(i-1)==s2.charAt(j-1)) {
                   dp[i][j] = dp[i-1][j-1]+1;
               }
               else {
                   dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
               }
           }
       }
       return dp[x][y];
    }
}