package accio;
// https://www.hackerrank.com/contests/interfacecse-codedash/challenges/closest-numbers
import java.util.*;

public class I {

    static void closeNum(int arr[], int n) {
        if (n <= 1)
            return;

        Arrays.sort(arr);

        int minDiff = arr[1] - arr[0];
        for (int i = 2; i < n; i++)
            minDiff = Math.min(minDiff, arr[i] - arr[i - 1]);

        for (int i = 1; i < n; i++) {
            if ((arr[i] - arr[i - 1]) == minDiff) {
                System.out.print(arr[i - 1] + " " + arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        closeNum(arr, n);
    }
}