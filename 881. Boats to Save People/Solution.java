class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int n=people.length;
        while(i<j){
            if(people[i]+people[j]<=limit){
                n--;
                i++;
                j--;
            }
            else if(people[i]+people[j]>limit){
                j--;
            }
            else{
                i--;
            }
        }
        return n;
    }
}