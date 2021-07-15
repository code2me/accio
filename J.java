// https://open.kattis.com/problems/lineup
import java.util.*;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            String s1;
            String s2;
            int m = n, l = n;
            s1 = sc.next();
            int l1 = s1.length();
            for (int i = 0; i < n; i++) {
                s2 = sc.next();
                int l2 = s2.length();
                int t = m;
                int len = Math.min(l1, l2);
                for (i = 0; i < len; i++) {
                    if (s1.charAt(i) > s2.charAt(i)) {
                        m--;
                        break;
                    } else if (s1.charAt(i) < s2.charAt(i)) {
                        m++;
                        break;
                    }
                }
                if (t == m)
                    m += l1 <= l2 ? 1 : -1;
                s1 = s2;
                l1 = l2;
            }
            sc.close();
            if (2 * l == m + 1)
                System.out.println("INCREASING\n");
            else if (m == 1)
                System.out.println("DECREASING\n");
            else
                System.out.println("NEITHER\n");
        }
    }
}