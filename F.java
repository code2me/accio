//https://www.hackerrank.com/challenges/insertionsort1/problem
import java.util.*;

public class F {

    static void insertionSort1(int n, int[] arr) {
        int a = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < a) {
                arr[i + 1] = a;
                print(arr);
                break;
            } else {
                arr[i + 1] = arr[i];
                print(arr);
                if (i == 0) {
                    arr[i] = a;
                    print(arr);
                }
            }

        }
    }

    static void print(int a[]) {
        for (int i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort1(n, arr);
        sc.close();
    }
}