import java.util.*;

public class C {

    public static int sumofDigits(int arr[], int index, int len) {
        if (index == len)
            return 0;
        return arr[index] + sumofDigits(arr, index + 1, len);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, cas = 1;
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.printf("Case %d: %d\n", cas, sumofDigits(arr, 0, n));
            t--;
            cas++;
        }

        sc.close();
    }
}