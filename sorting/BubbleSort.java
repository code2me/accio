package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void BSort(int arr[], int n) {
        int i, j, temp;
        boolean flag;
        for (i = 1; i < n; i++) {
            flag = false;
            for (j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
                if(flag) {
                    break;
                }
            }
        }
        print(arr, n);
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        BSort(arr, n);
    }
}
