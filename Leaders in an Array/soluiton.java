class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        int curr_high=arr[n-1];
        a.add(curr_high);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=curr_high){
                curr_high=arr[i];
                a.add(curr_high);
            }
        }
        Collections.reverse(a);
        return a;
    }
}