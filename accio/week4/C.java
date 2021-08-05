package accio.week4;

// https://www.hackerrank.com/challenges/and-product/problem
import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long res = a & (a + 1);
            int i = 1;
            while (a + (long) Math.pow(2, i) <= b) {
                res = (a + (long) Math.pow(2, i)) & res;
                ++i;
            }
            System.out.println(res & b);
        }
        sc.close();
    }
}