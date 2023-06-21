class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
       ArrayList<Integer> subArr = new ArrayList<Integer>();
        if (s == 0) {
            subArr.add(-1);
            return subArr;
        }
        int i = 0, j = 0, sum = 0;
        for (i = 0; i < n; i++) {
            while (sum < s && j < n) {
                sum = sum + arr[j];
                j++;
            }
            if (sum == s) {
                subArr.add(i + 1);
                subArr.add(j);
                return subArr;
            } else {
                sum = sum - arr[i];
            }
        }
        subArr.add(-1);
        return subArr;
    }
}