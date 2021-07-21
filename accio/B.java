package accio;
//https://www.hackerrank.com/challenges/recursive-digit-sum/problem
import java.util.*;

public class B {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String k = sc.next();
        sc.close();
        int i, sum = 0;

        for (i = 0; i < n.length(); i++) {
            sum += n.charAt(i) - '0';
        }

        sum = sum * (k.charAt(0) - '0');
        sum = (sum % 9 == 0) ? 9 : sum % 9;

        System.out.println(sum);
    }
}
