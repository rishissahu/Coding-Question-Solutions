class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        int fre[]=new int[26];
        for(int i=0;i<S.length();i++){
            fre[S.charAt(i)-'a']+=1;
        }
        for(int i=0;i<S.length();i++){
            if(fre[S.charAt(i)-'a']==1){
                return S.charAt(i);
            }
        }
        return '$';
    }
}