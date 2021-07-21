package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static int[] mergeSort(int arr[]) {

        if(arr.length <= 1) {
            return arr;                                     //return the base array as single element is already sorted
        }
        
        int mid = (arr.length)/2;

        int leftArr[] = Arrays.copyOfRange(arr, 0, mid);                //copy left half of the array (mid is exclusive) (0 to mid-1)
        int rightArr[] = Arrays.copyOfRange(arr, mid, arr.length);      //copy right half of the array (mid is inclusive) (mid to arr.length-1)

        int leftSortedArr[] = mergeSort(leftArr);                       //sort the left half of the array
        int rightSortedArr[] = mergeSort(rightArr);                     //sort the right half of the array
        
        return merge2SortedArray(leftSortedArr, rightSortedArr);        //merge two sorted array
        
    }

    public static int[] merge2SortedArray(int []a, int []b) {
        int alen = a.length;
        int blen = b.length;
        int mergedArr[] = new int[alen + blen];
        int i = 0, j = 0, k = 0;

        while(i<alen && j<blen) {       // compare and find min in the two sorted array and add that in mergedArr
            if(a[i] <= b[j]) {
                mergedArr[k] = a[i];
                i++;
            } else {
                mergedArr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < alen) {                  // rest of sorted elements in array a
            mergedArr[k] = a[i];
            i++;
            k++;
        }

        while (j < blen) {                  // rest of sorted elements in array b
            mergedArr[k] = b[j];
            j++;
            k++;
        }

        return mergedArr;
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
        int res[] = mergeSort(arr);
        print(res);
    }
}
