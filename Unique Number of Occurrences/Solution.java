class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        HashSet<Integer> h =new HashSet<Integer>();
        Arrays.sort(arr);
        int count=1;
        for(int i = 0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                boolean flag=h.add(count);
                if(flag==false){
                    return false;
                }
                count=1;
            }
        }
        return true;
    }
}