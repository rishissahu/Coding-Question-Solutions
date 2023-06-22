
class Solution {
    int countZeroes(int[] arr, int n) {
        // code here
        if(arr[0]==0){
            return n;
        }
        int s= 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==1){
                s=mid+1;
            }else{
                e = mid-1;
            }
        }
        // s will point at the starting of the first 0, calculate accordingly
        return n-s;

}
    
}
