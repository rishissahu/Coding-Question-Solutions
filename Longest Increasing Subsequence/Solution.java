class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[]){
      int[] aa= new int[size];
       aa[0]=a[0];
       int k=1;
        
        for(int i=1;i<size;i++){
            
            if(a[i]>aa[k-1]){
               aa[k]=a[i];
               k++;
           } 
            else if(a[i]<aa[k-1]){
               int ceil= findCeil(aa,a[i],k-1);
               aa[ceil]=a[i];
                
            }
        }
        
        return k;
    }
    static int findCeil(int[] aa, int val, int end){
        int s=0;
        int e=end;
        int mid=0;
        int ceil=-1;
        while(s<=e){
           
           mid=(s+e)/2;
           
           if(aa[mid]<val) s=mid+1;
           else if(aa[mid]>val){
                e=mid-1;
                ceil=mid;
           }
           else return mid;
        }
        return ceil;
    }
}