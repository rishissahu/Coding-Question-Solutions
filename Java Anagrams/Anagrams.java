import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        String s1 =  sc.nextLine();
        String s2 =  sc.nextLine();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();


        if(s1.length() != s2.length()){
            System.out.println("Not Anagrams");
        }
        else{
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            System.out.println(c1);
            System.out.println(c2);

            if(Arrays.equals(c1, c2)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }
        }
    }
}
