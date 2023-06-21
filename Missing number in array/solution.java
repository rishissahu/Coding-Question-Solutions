class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum =0;
        int i;
        for(i=0;i<n-1;i++){
            sum += i+1;
            sum -= array[i];
        }
        return sum+i+1;
    }
}