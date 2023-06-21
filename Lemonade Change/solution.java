class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
    
        int five = 0;
        int ten = 0;
        
        for(int i = 0; i < bills.length; i++)
        {
            int bill = bills[i];
            
            if(bill == 5){
                five++;
                continue;
            }
            else if(bill == 10) {
                if(five < 1) 
                    return false;
                ten++;
                five--;
            }
            else
            {
                if(ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) { five-=3;}
                else return false;
            }
        }
        return true;
    }
}