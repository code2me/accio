package accio.week2;
// https://www.hackerrank.com/challenges/pangrams/problem
import java.util.HashSet;
import java.util.Scanner;

public class B {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        s=s.toLowerCase();
        sc.close();

        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0;i<s.length();i++) {
            if (s.charAt(i) != ' ') {
                int put = (int) s.charAt(i);
                if (put >= 97 && put <= 122)
                    h.add(put);
            }
        }
        if(h.size()==26)
            System.out.println("pangram");
        else 
            System.out.println("not pangram");
    }
}
