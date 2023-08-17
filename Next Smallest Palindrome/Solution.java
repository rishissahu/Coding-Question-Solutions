class Solution {

    Vector<Integer> generateNextPalindrome(int num[], int n) {
        // code here
        int m=n/2;
        int l=m-1;
        int r=(n%2==1) ? m+1:m;
        while(l>=0 && num[l]==num[r]) {
            l--;
            r++;
        }
        Vector<Integer> v=new Vector<Integer>();
        int carry=0;
        if(l<0 || num[l]<num[r]) {
            carry=1;
        }
        l=m;
        if(n%2==0) {
            l=m-1;
        }
        r=m;
        while(l>=0) {
            num[l]+=+carry;
            carry=num[l]/10;
            num[l]%=10;
            num[r]=num[l];
            l--;
            r++;
        }
        if(carry==1) {
            num[n-1]=1;
            v.addElement(1);
        }
        for(int ele:num) {
            v.add(ele);
        }
        return v;
    }
}