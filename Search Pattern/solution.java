class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
     ArrayList<Integer> a =new ArrayList<Integer>();
        int count = 0;
        int index = 1;
        
        while (count != -1) {
            count = S.indexOf(pat, count);
            if (count != -1) {
                a.add(count+1);
                index++;
                count ++;
            }
        }
        
        if (index == 1) {
            a.add(-1);
        }
        return a;
    }
}