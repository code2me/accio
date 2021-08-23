package Practice;

import java.util.*;

class Main {

	static void findSubset(int arr[], int n, int k) {
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		findSubset(arr, N, K);
	}
}