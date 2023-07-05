class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            product =product*nums[i];
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                int newProduct=1;
                for(int j=0;j<i;j++){
                    newProduct*=nums[j];
                }
                for(int j=i+1;j<n;j++){
                    newProduct*=nums[j];
                }
                ans[i]=newProduct;
            }
            else{
            ans[i]=product/nums[i];
            }
        }
        return ans;
    }
}