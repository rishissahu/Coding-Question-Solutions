class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int temp;
        for(int j=0; j<nums.length; j++){
            if(nums[j]!=0){
            temp=nums[j];
            nums[j]=nums[i];
            nums[i]=temp;
                i++;
            }
        }
    }
}