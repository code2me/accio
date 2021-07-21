package accio.week2;

import java.util.Scanner;

// https://codeforces.com/problemset/problem/279/B
public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int i;
        int arr[] = new int[n];
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0, pos = 0,k = 0;
        for(i=0;i<n;i++){
        sum+=arr[i];
        while(sum>t){
            sum-=arr[pos];
            pos++;
        }
        if(k<=i-pos+1)
            k=i-pos+1;

        }

        System.out.println(k);
    }
}
