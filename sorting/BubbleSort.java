package sorting;

import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n) {
        int i, j, temp;
        boolean flag;
        for (i = 1; i < n; i++) {           //iterate to n-1 (if n-1 elements is sorted n elements are sorted)
            flag = true;                        
            for (j = 0; j < n-i; j++) {     //iterate to n-i-1 elements (swaps and compare 0 to n-i-1 elements(arr[j]>arr[j+1]))
                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag) break;                // if array is already sorted no swaps will takes place, since "break".
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
        bubbleSort(arr, n);
    }
}
