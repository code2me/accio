package accio.week4;

//https://www.hackerrank.com/challenges/sansa-and-xor/problem
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            if (n % 2 == 0) {                   // Case 1
                System.out.println(0);
            } else {                            // Case 2
                int result = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        result ^= array[i];
                    }
                }
                System.out.println(result);
            }
        }
        sc.close();
    }
}