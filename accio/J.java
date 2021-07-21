package accio;
// https://open.kattis.com/problems/lineup
import java.util.*;

public class J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, count = n;

        List<String> list = new ArrayList<String>();

        for (i = 0; i < n; i++) {
            list.add(sc.next());
        }
        sc.close();

        for (i = 1; i < n; i++) {
            String s1 = list.get(i - 1);
            String s2 = list.get(i);
            int len1 = s1.length();
            int len2 = s2.length();

            int len = Math.min(len1, len2);

            for (j = 0; j < len; j++) {
                if (s1.charAt(j) > s2.charAt(j)) {
                    count--;
                    break;
                } else if (s1.charAt(j) < s2.charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        if (count == 2 * n - 1)
            System.out.println("INCREASING\n");
        else if (count == 1)
            System.out.println("DECREASING\n");
        else
            System.out.println("NEITHER\n");

    }
}