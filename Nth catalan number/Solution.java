class Solution {
    public static int findCatalan(int n) {
        // code here
       int c[] = new int[n+1];
        c[0]=c[1]=1;
        long mod=1000_000_007L;
        for(int i=2; i<=n; i++)
        {
            long ans=0;
            c[i]=0;
            for(int j=0; j<i; j++)
            {
                ans=(ans+((long) c[j] * c[i - j - 1])%mod)%mod;
            }
            c[i]= (int) ans;
        }
        return c[n];
    }
}