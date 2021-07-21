package accio.week1;
// https://www.hackerrank.com/challenges/runningtime/problem
import java.util.Scanner;

public class H {

    public static void insertionCounter(int[] arr) {
        int Count = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int value = arr[i];
            while (j >= 1 && arr[j - 1] > value) {
                arr[j] = arr[j - 1];
                j--;
                Count++;
            }
            arr[j] = value;
        }
        System.out.println(Count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        insertionCounter(arr);
    }
}