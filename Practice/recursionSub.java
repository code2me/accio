package Practice;

import java.util.*;

public class recursionSub {

    static List<Integer> giveSubset(int arr[], int index, int n) {
         List<List<Integer>> result = new ArrayList<List<Integer>>();

         if(index == n) {
             return 
         }

        result = giveSubset(arr, index+1, n);

         return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans = giveSubset(arr, 0, n);

        for (int i = 0; i < ans.size(); i++) {
            for (int ele : ans.get(i)) {
                System.out.println(ele);
            }
        }
    }
}
