//https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
import java.util.*;

public class E {

    static void countSwaps(int[] a) {
        int count = 0;
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flag = false;
                    count++;
                }
            }
        }

        System.out
                .println(String.format("Array is sorted in %d swaps.%n" + "First Element: %d%n" + "Last Element: %d%n",
                        count, a[0], a[a.length - 1]));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        countSwaps(arr);
        sc.close();
    }
}