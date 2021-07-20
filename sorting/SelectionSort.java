package sorting;
import java.util.Scanner;

public class SelectionSort {

    public static void selectionSort(int arr[], int n) {
        int i, j, min, temp;
        for (i = 0; i < n-1; i++) { //sorted half
            min = i;
            for (j = i+1; j < n; j++) { //check min in unsorted half, if ele in unsorted half is min make it new min
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        print(arr,n);
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        selectionSort(arr, n);
    }
}
