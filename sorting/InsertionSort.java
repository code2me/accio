package sorting;

import java.util.Scanner;

public class InsertionSort {

    private static void insertionSort(int[] arr, int n) {
        int i,j, temp;
        for (i = 1; i < n; i++) { // unsorted half
            for (j = i-1; j >=0; j--) { //sorted half comparison
                if(arr[j] > j+1) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } else {
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

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        insertionSort(arr, n);
    }    
}