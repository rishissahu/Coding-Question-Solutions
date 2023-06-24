class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // code here
        if(k>str.length()) return 0;
        int count=0;
        for(int i=0; i<n;i++){
            if(arr[i].length()<k){
                continue;
            }
            boolean flag=true;
            for(int j=0;j<k;j++){
               if( arr[i].charAt(j) != str.charAt(j)){
                   flag=false;
                   break;
               }
            }
            if(flag==true){
                count++;
            }
        }
        return count;
    }
}