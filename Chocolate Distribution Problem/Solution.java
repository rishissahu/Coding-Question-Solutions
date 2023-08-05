class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans=Long.MAX_VALUE;
        for(int i=0; i<n && m<=n;i++){
            ans=Math.min(a.get(m-1)-a.get(i), ans);
            m++;
        }
        return ans;
    }
}