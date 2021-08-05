package accio.week4;

// https://www.hackerrank.com/challenges/flipping-bits/problem
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long mask = (1L << 32) - 1;

        for (int t = 0; t < T; t++) {
            long n = sc.nextLong();
            System.out.println(n ^ mask);
        }

        sc.close();

    }

}