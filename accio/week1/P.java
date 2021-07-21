package accio.week1;
import java.util.*;

public class P {

    static void ans(int a[], int b[]) {
        int count_array1[] = new int[101];
        int count_array2[] = new int[101];
        int min = min(b);
        for (int i = 0; i < a.length; i++) {
            count_array1[a[i] - min]++;
        }
        for (int i = 0; i < b.length; i++) {
            count_array2[b[i] - min]++;
        }
        for (int i = 0; i <= 100; i++) {
            int diff_count = count_array2[i] - count_array1[i];
            if (diff_count > 0) {
                System.out.print((i + min) + " ");
            }

        }
    }

    static int min(int a[]) {
        int min = a[0];
        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    static int max(int b[]) {
        int max = b[0];
        for (int i = 1; i <= b.length - 1; i++) {
            if (b[i] > max) {
                max = b[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N, M;
        N = s.nextInt();
        int array1[] = new int[N];
        for (int i = 0; i <= N - 1; i++) {
            array1[i] = s.nextInt();
        }
        M = s.nextInt();
        int array2[] = new int[M];
        for (int i = 0; i <= M - 1; i++) {
            array2[i] = s.nextInt();
        }
        s.close();
        ans(array1, array2);

    }
}