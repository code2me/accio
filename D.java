import java.util.*;

public class D {

    static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    static int gcdOfFactorial(int m, int n) {
        int min = m < n ? m : n;
        return factorial(min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(gcdOfFactorial(m, n));
    }
}
