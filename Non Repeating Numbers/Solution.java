class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        HashSet<Integer> s = new HashSet<>();
        //int a [] = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++)
        {
            if(!s.contains(nums[i]))
            s.add(nums[i]);
            else
            s.remove(nums[i]);
        }
        int[] result = new int[s.size()];
        int index = 0;
        for (int num : s) {
            result[index] = num;
            index++;
        }
        Arrays.sort(result);
        
        return result;
    }
}