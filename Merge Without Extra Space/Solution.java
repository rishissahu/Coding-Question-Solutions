class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
                    int end=n-1;
                    int start=0;
                    while(end>=0&&start<m){
                        if(arr1[end]>arr2[start]){
                            // swap(arr1[end--],arr2[start++]);
                            long temp=arr1[end];
                            arr1[end]=arr2[start];
                            arr2[start]=temp;
                            end--;
                            start++;
                        }
                        else {
                            break;
                        }
                        
                    }
                    Arrays.sort(arr1);
                    Arrays.sort(arr2);
    }
    
}
