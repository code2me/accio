package accio.week1;
// https://www.hackerrank.com/contests/aug13/challenges/mark-and-toys
import java.util.*;

public class K {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int money = sc.nextInt();
        int i, sum = 0;

        int cost[] = new int[num];
        for (i = 0; i < num; i++) {
            cost[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(cost);
        i = 0;
        while (cost[i] < money) {
            sum += cost[i];
            if (sum > money)
                break;
            i++;
        }

        System.out.println(i);
    }
}