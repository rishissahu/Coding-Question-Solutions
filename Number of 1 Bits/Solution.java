class Solution {
    static int setBits(int N) {
        // code here
        int ans=0;
        while(N>0){
            if(N%2!=0) ans++;
            N/=2;
        }
        return ans;
    }
}