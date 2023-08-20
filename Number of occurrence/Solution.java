class Solution{
    int count(int arr[], int n, int x) {
	    // code here
         
         int s=0,e=n-1;
         
         int first=-1;
         
         //first occurence
         while(s<=e){
             int mid=s+(e-s)/2;
             if(arr[mid]>=x) {
                 first=mid;
                 e=mid-1;
             }
             else s=mid+1;
         }
         
         s=0; e=n-1;
         int second=-1;
         
         //last occurence
         while(s<=e){
             int mid=s+(e-s)/2;
             if(arr[mid]<=x){
                 second=mid;
                 s=mid+1;
             }
             else e=mid-1;
         }
         
         return first==-1 ? 0 : second-first+1;
	}
}