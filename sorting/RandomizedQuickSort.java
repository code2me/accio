package sorting;
// Java program to illustrate
// Randomised Quick Sort
import java.util.*;

class RandomizedQuicksort {

    /*
     * The main function that implements QuickSort() arr[] --> Array to be sorted,
     * low --> Starting index, high --> Ending index
     */
    static void randomizedQuickSort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            randomizedQuickSort(arr, low, pi - 1);
            randomizedQuickSort(arr, pi + 1, high);
        }
    }

    // This Function helps in calculating
    // random numbers between low(inclusive)
    // and high(inclusive)
    static void random(int arr[], int low, int high) {

        Random rand = new Random();
        int pivot = rand.nextInt(high - low) + low;

        int temp1 = arr[pivot];                                     // just swap random with high
        arr[pivot] = arr[high];
        arr[high] = temp1;
    }

    /*
     * This function takes last element as pivot, places the pivot element at its
     * correct position in sorted array, and places all smaller (smaller than pivot)
     * to left of pivot and all greater elements to right of pivot
     */
    static int partition(int arr[], int low, int high) {
        // pivot is choosen randomly
        random(arr, low, high);
        int pivot = arr[high];

        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.printf("%d ",arr[i]);
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        randomizedQuickSort(arr, 0, n - 1);
        printArray(arr);
    }
}