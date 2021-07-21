package accio.week2;
// https://www.hackerrank.com/challenges/camelcase/problem
import java.util.*;

public class C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            String letter = Character.toString(s.charAt(i));
            if (letter == letter.toUpperCase()) {
                count++;
            }
        }
        System.out.println(count);
    }
}

// System.out.println(s.length() - s.replaceAll("[A-Z]", "").length() + 1);
// System.out.println(s.chars().filter(c -> Character.isUpperCase((char)c)).count()+1);