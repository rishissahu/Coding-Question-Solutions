class Solution
{
    // Complete the function
    // n: Input n
    // Return True if the given number is a lucky number else return False
    public static boolean isLucky(int n)
    {
        // Your code here
        int counter =2;
        while(counter<=n){
            if(n%counter==0){
                return false;
            }
            n=n-n/counter;
            counter++;
        }
        return true;
    }
}