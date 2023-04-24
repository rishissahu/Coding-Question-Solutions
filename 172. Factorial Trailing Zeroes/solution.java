class Solution {
    public int trailingZeroes(int n) {
        int zeroes=0;
        for(int i=5;i<=n;i=i*5){
            zeroes += n/i;
        }
        return zeroes;
    }
}