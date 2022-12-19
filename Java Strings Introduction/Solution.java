import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String S1 = Sc.nextLine();
        String S2 = Sc.nextLine();
        System.out.println(S1.length() + S2.length());
        System.out.println(S1.compareTo(S2)>0?"Yes": "No");
        System.out.println(S1.substring(0,1).toUpperCase()+S1.substring(1) +" "+S2.substring(0,1).toUpperCase()+S2.substring(1));
    }
}