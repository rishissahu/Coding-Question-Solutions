class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
         String str1=S;
    String str2="";
    for (int i = 0; i < str1.length(); i++) {
        str2 = str1.charAt(i) + str2;
      }

         int[] L = new int[str1.length() + 1];

        for (int i = 1; i <= str2.length(); i++) {
            int prev = 0;
            for (int j = 1; j <= str1.length(); j++) {
                int current = L[j];
                 if (str1.charAt(j- 1) == str2.charAt(i- 1))
                    L[j] = prev + 1;
                else
                    L[j] = Math.max(L[j], L[j - 1]);
                prev = current;
            }
        }

        return L[str1.length()];
    }
}