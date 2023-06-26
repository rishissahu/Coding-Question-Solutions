class Solution{
    
    static int mod=(int)1e9+7;

    static int nCr(int n, int r)
    {
        if(n<r)
            return 0;
        
        int[][] dp=new int[n+1][r+1];
        
        for(int i=0;i<=n; i++){
          dp[i][0]=1;
        }
      
      for(int i=0;i<=n;i++) {
          for(int j=1; j<=Math.min(i, r);j++) {   
              dp[i][j]= (dp[i-1][j-1]%mod + dp[i-1][j]%mod)%mod; 
          }
      }
      
      return dp[n][r];  
    }
}