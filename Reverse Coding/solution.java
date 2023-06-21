class Solution {
    static int sumOfNaturals(int n) {
        // code here
          long ans =(long)n*(n+1)/2;
         long mod=1000000007;
         long res=(long)ans%mod;
         return (int)res;
    }
}