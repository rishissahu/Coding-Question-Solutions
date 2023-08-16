class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long ans=arr[0];
        long curr=arr[0];
        
        for(int i=1;i<n;i++){
            curr=Math.max(curr+arr[i], arr[i]);
            ans=Math.max(curr, ans);
        }
        return ans;
    }
    
}