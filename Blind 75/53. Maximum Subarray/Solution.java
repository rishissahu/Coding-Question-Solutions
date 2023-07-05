// used Kadane's algorithm

class Solution {
    public int maxSubArray(int[] arr) {
        int res=arr[0]; // max sum
        int maxEnding=arr[0]; // max sum ending at i
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding + arr[i], arr[i]);
            // maxEnding = maxEnding + arr[i];
            // if(maxEnding<arr[i]) maxEnding=arr[i];
            res=Math.max(res, maxEnding);
            // if(res<maxEnding) res=maxEnding;
        }
        return res; 
    }
}