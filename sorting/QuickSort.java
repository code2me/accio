package sorting;

import java.util.Scanner;

public class QuickSort {
    public static void quickSort(int arr[], int start, int end) {

        if (start < end) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(arr, start, end);

            // recursive call on the left of pivot
            quickSort(arr, start, pi - 1);

            // recursive call on the right of pivot
            quickSort(arr, pi + 1, end);
        }
    }

    // method to find the partition position
    static int partition(int array[], int start, int end) {

        // choose the rightmost element as pivot
        int pivot = array[end];

        // pointer for greater element
        int i = (start - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greatr element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    public static void print(int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
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
        quickSort(arr, 0, n-1);
        print(arr);
    }
}
