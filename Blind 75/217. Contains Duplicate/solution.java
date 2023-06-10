class Solution {
    public boolean containsDuplicate(int[] arr) {
        boolean flag=false;
        Arrays.sort(arr);
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && flag==false){
                return true;
            }
        }
        return false;
    }
}