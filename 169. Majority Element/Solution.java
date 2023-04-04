class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int res=0;
        int count=1;
        for(int i= 0 ; i <len; i++){
            if(nums[res]==nums[i]){
                count++;
            }
            else{
                count--;
            }

            if(count==0){
                count=1;
                res=i;
            }
        }
        count=0;
        for(int i=0;i<len;i++){
            if(nums[i]==nums[res]){
                count++;
            }
        }
        if(count>=len/2){
            return nums[res];
        }
        return -1;
        
    }
}