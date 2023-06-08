class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int arr[]=new int[n+1];
        arr[0]=0;
        if(n==0){
            return arr;
        }
        for(int i=1;i<=n;i++){
            if(i==1){
            arr[i]=1;
            }
            else if(i%2==0){
                arr[i]=2;
            }
            else{
                for(int j=3;j<=i;j+=2){
                    if(i%j==0){
                        arr[i]=j;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}