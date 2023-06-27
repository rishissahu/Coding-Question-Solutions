class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        HashMap <Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            m.put(a[i], m.getOrDefault(a[i], 0)+1);
            if(m.get(a[i])==k){
                return a[i];
            }
        }
        return -1;
    } 
}