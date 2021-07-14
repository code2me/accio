//https://www.hackerrank.com/challenges/insertionsort2/problem
import java.util.*;

public class G {

    public static void insertionSort2(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int value = array[i];
            while (j >= 1 && array[j - 1] > value) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = value;
            printArray(array);
        }
    }

    static void printArray(int a[]) {
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
        sc.close();
        insertionSort2(arr);
    }
}